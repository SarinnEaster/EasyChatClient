package com.easychat.fx.bean;

import lombok.Data;

/**
 * @author: Zed
 * date: 2024/11/26.
 * description:
 */
@Data
public class MessageCache {
    private String messageType;
    private User messageUser;
    private Group messageGroup;
}
