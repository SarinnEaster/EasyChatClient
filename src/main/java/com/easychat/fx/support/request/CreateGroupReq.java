package com.easychat.fx.support.request;

import com.easychat.fx.support.Command;
import com.easychat.fx.support.Packet;
import lombok.Data;

import java.util.List;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
@Data
public class CreateGroupReq extends Packet {
    /** 创建的群名*/
    private String groupName;
    /** 初始化邀请的群好友*/
    private List<String> users;
    @Override
    public byte getCommand() {
        return Command.CREATE_GROUP_REQ;
    }
}
