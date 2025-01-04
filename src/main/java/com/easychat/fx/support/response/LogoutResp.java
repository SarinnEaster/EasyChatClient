package com.easychat.fx.support.response;

import com.easychat.fx.support.Packet;
import lombok.Data;

/**
 * @author Ann
 * date: 2024/08/19.
 * description:
 */
@Data
public class LogoutResp extends Packet {
    @Override
    public byte getCommand() {
        return 0;
    }
}
