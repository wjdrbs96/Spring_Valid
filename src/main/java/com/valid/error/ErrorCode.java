package com.valid.error;

/**
 * created by Gyunny 2021/10/11
 */
public enum ErrorCode {

    // Global
    INVALID_INPUT_VALUE(400, "INVALID INPUT VALUE");

    private final int status;
    private final String message;

    ErrorCode(final int status, final String message) {
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus() {
        return status;
    }

}
