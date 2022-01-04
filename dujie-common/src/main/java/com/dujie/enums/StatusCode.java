package com.dujie.enums;

import lombok.Getter;

@Getter
public enum StatusCode {

    /**
     * 操作成功时返回的code码
     **/
    SUCCESS("0", "操作成功"),

    /**
     * 操作失败时返回的code码
     */
    FAIL("-1", "操作失败"),
    ;

    /**
     * 返回前端的code码
     */
    private String code;
    /**
     * 返回前端的数据信息
     */
    private String msg;

    StatusCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}