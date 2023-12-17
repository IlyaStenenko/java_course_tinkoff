package edu.hw11.FibonacciClassProviderSupport;

import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;

public final class FibonacciImplementation implements Implementation {

    private FibonacciImplementation() {

    }

    @Override
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    @Override
    public ByteCodeAppender appender(Target implementationTarget) {
        return LongFibonacciAppender.getInstance();
    }


    public static Implementation getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private final static class SingletonHolder {
        public static final Implementation INSTANCE = new FibonacciImplementation();
    }
}
