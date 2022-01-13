package com.dujie.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * 异常基础类
 */
public abstract class BaseException extends RuntimeException {
    private static final long serialVersionUID = 6626868446456726497L;

    private final IExceptionCode code;

    private final String message;

    public BaseException(IExceptionCode code, String message) {
        this.code = code;
        if (StringUtils.isBlank(message) && null != code) {
            message = code.defaultMessage();
        }
        this.message = message;
    }

    public BaseException(IExceptionCode code, Throwable throwable) {
        super(throwable);
        this.code = code;
        if (null == throwable && null != code) {
            message = code.defaultMessage();
        } else {
            this.message = throwable.getMessage();
        }
    }

    public IExceptionCode getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
