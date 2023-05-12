package com.test_doubles.mock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecurityCentralTest {
    @Test
    public void enabling_security_locks_windows_and_doors() {
        MockWindow windowMock = new MockWindow();
        MockDoor doorMock = new MockDoor();

        SecurityCentral securityCentral = new SecurityCentral(windowMock, doorMock);
        securityCentral.securityOn();

        assertTrue(windowMock.isClosed());
        assertTrue(doorMock.isClosed());
    }
}
