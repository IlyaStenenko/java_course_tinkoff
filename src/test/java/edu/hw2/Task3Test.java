package edu.hw2;

import org.junit.jupiter.api.Test;
import edu.hw2.Task3.DefaultConnectionManager;
import edu.hw2.Task3.ConnectionManager;
import edu.hw2.Task3.Connection;
import edu.hw2.Task3.FaultyConnectionManager;
import edu.hw2.Task3.FaultyConnection;

import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {

    @Test
    void checkDefaultConnectionManagerGetConnection() {
        ConnectionManager connectionManager = new Task3().new DefaultConnectionManager();

        Connection connection = connectionManager.getConnection();

        assertThat(connection).isInstanceOf(Connection.class);
    }

    @Test
    void checkFaultyConnectionManagerGetConnection() {
        ConnectionManager connectionManager = new Task3().new FaultyConnectionManager();

        Connection connection = connectionManager.getConnection();

        assertThat(connection).isInstanceOf(FaultyConnection.class);
    }
}
