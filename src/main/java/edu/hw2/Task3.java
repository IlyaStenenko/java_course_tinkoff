package edu.hw2;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {
    public interface ConnectionManager {
        Connection getConnection();
    }

    public interface Connection extends AutoCloseable {
        void execute(String command);
    }

    public class ConnectionException extends RuntimeException {
    }

    public class DefaultConnectionManager implements ConnectionManager {
        Random random = new Random();

        @Override
        public Connection getConnection() {
            if (random.nextBoolean()) {
                return new FaultyConnection();
            }
            return new StableConnection();
        }
    }

    public class FaultyConnection implements Connection {
        private static final Logger LOGGER = LogManager.getLogger();

        @Override
        public void execute(String command) throws ConnectionException {
            LOGGER.info("Execute command:  " + command + " is FaultyConnection");
        }

        @Override
        public void close() {}
    }

    public class FaultyConnectionManager implements ConnectionManager {
        @Override
        public Connection getConnection() {
            return new FaultyConnection();
        }
    }

    public class PopularCommandExecutor {
        private static final Logger LOGGER = LogManager.getLogger();

        private final ConnectionManager manager;
        private final int maxAttempts;

        public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
            this.manager = manager;
            this.maxAttempts = maxAttempts;
        }

        public void updatePackages() {
            tryExecute("apt update && apt upgrade -y");
        }

        public void tryExecute(String command) {
            for (int i = 0; i < maxAttempts; i++) {
                try (Connection connection = manager.getConnection()) {
                    if (connection instanceof StableConnection) {
                        connection.execute(command);
                        return;
                    }
                } catch (Exception e) {
                    LOGGER.info(e);
                }
            }
            throw new ConnectionException();
        }
    }

    public class StableConnection implements Connection {
        private static final Logger LOGGER = LogManager.getLogger();

        @Override
        public void execute(String command) {
            LOGGER.info("Execute command: " + command + " is StableConnection");
        }

        @Override
        public void close() {}
    }
}
