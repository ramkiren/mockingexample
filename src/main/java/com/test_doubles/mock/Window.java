package com.test_doubles.mock;

public class Window implements Iwindow{
    private boolean closed = false;

    public void close() {
        closed = true;
    }

    public boolean isClosed() {
        return closed;
    }
}
