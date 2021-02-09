package com.ming.common;

/**
 * 常量
 */
public enum CommonConstant {

    SUCCESS("0000","成功"),
    FAIL("0000","成功");

    private String code;

    private String name;

    CommonConstant(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
