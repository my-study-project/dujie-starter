package com.dujie.util;

import java.util.UUID;

/**
 * @Author dujie 分布式id生成器
 */
public class IdUtil {

    private IdUtil() {
        throw new IllegalStateException("IdUtils工具异常");
    }

    public static synchronized String get32Uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
