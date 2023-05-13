package com.github.gguangnian.elor.exceptions;

public class ElorException extends RuntimeException {
    public ElorException() {
    }

    public ElorException(String message) {
        super(message);
    }

    public ElorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElorException(Throwable cause) {
        super(cause);
    }

    public ElorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
