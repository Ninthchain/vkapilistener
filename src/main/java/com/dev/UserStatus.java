package com.dev;

public enum UserStatus {
    Unknown((short) 0),
    Started((short) 1),
    UnverifiedAge((short) 2),
    Verified((short) 3),
    Invalid((short) -4);

    private final short code;

    UserStatus(short statusCode) {
        this.code = statusCode;
    }

    public short code() {
        return this.code;
    }
}