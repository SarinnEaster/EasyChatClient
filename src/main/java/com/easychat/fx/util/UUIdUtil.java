package com.easychat.fx.util;

import java.util.UUID;

/**
 * @author Ann
 * date: 2024/08/20.
 * description:
 */
public class UUIdUtil {
    
    public static String getUUid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
