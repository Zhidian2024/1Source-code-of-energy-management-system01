package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_charge_policy_resp_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_charge_policy_resp wmp_charge_policy_resp = (wmp_charge_policy_resp)o;
        PackUtil.putByte(buf, wmp_charge_policy_resp.port_id.getByte());
        PackUtil.putByte(buf, wmp_charge_policy_resp.res);
        PackUtil.putShort(buf, wmp_charge_policy_resp.result.getShort());
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_charge_policy_resp wmp_charge_policy_resp = new wmp_charge_policy_resp();

        wmp_charge_policy_resp.port_id.setByte(PackUtil.getByte(buf));
        wmp_charge_policy_resp.res = PackUtil.getByte(buf);
        wmp_charge_policy_resp.result.setShort(PackUtil.getShort(buf));

        return wmp_charge_policy_resp;
    }
}

