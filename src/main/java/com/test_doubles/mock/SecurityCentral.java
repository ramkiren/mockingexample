package com.test_doubles.mock;
public class SecurityCentral {
    private final Iwindow window;
    private final Idoor door;

    public SecurityCentral(Iwindow window, Idoor door) {
        this.window = window;
        this.door = door;
    }

    public void securityOn() {
        if (!window.isClosed()) {
            window.close();
        }
        if (!door.isClosed()) {
            door.close();
        }
    }
}
