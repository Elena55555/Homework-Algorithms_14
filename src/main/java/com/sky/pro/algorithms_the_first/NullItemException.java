package com.sky.pro.algorithms_the_first;

public class NullItemException extends RuntimeException {
    public NullItemException() {
    }

    public NullItemException(String message) {
        super(message);
    }

    public NullItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullItemException(Throwable cause) {
        super(cause);
    }
}
