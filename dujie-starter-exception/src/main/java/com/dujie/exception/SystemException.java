package com.dujie.exception;


import com.dujie.exception.type.ExceptionCode;

public class SystemException extends BaseException {
    private static final long serialVersionUID = 8996110607302347653L;

    public SystemException() {
        super(ExceptionCode.INTERNAL_SERVER_ERROR, ExceptionCode.INTERNAL_SERVER_ERROR.defaultMessage());
    }

    public SystemException(String message) {
        super(ExceptionCode.INTERNAL_SERVER_ERROR, message);
    }

    public SystemException(Throwable throwable) {
        super(ExceptionCode.INTERNAL_SERVER_ERROR, throwable);
    }
}
