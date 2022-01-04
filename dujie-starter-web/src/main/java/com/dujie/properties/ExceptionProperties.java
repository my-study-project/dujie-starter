package com.dujie.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = ExceptionProperties.PREFIX)
public class ExceptionProperties {
    public static final String PREFIX = "dujie.exception";

    /**
     * 是否启用全局异常处理器
     **/
    private boolean enabled = true;

}
