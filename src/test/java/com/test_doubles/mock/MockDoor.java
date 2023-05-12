package com.test_doubles.mock;

public class MockDoor implements Idoor {
    private boolean closed = false;
    @Override
    public void close() {
        closed = true;
    }
    public boolean isClosed() {
        return closed;
    }

}
