package com.test_doubles.mock;

public class Door implements Idoor{
    private boolean closed = false;

    public void close() {
        closed = true;
    }

    public boolean isClosed() {
        return closed;
    }
}
