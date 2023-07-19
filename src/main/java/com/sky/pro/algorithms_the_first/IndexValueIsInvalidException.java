package com.sky.pro.algorithms_the_first;


public class IndexValueIsInvalidException extends RuntimeException {

    public IndexValueIsInvalidException() {
    }


    public IndexValueIsInvalidException(String message) {

        super(message);
    }


    public IndexValueIsInvalidException(String message, Throwable cause) {

        super(message, cause);
    }


    public IndexValueIsInvalidException(Throwable cause) {

        super(cause);
    }
}
