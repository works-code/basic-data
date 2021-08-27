package com.code.enums;

public enum RtnCode {
    E001("Not Exist Data"),
    E002("Server Error");

    private String msg;

    RtnCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
