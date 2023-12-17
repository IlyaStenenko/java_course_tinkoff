package edu.hw10.Task2;

import edu.hw10.Task2.Cache;

public interface Calculator {
    @Cache(persist = true)
    long calculate(long a);
}
