package com.easychat.fx.support.request;

import com.easychat.fx.support.Command;
import com.easychat.fx.support.Packet;
import lombok.Data;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
@Data
public class LoginReq extends Packet {
    /** 账号*/
    private String userName;
    /** 密码*/
    private String password;
    @Override
    public byte getCommand() {
        return Command.LOGIN_RRQ;
    }
}
