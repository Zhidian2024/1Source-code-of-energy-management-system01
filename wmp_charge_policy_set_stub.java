package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_charge_policy_set_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_charge_policy_set wmp_charge_policy_set = (wmp_charge_policy_set)o;
        PackUtil.putByte(buf, wmp_charge_policy_set.port_id.getByte());
        PackUtil.putByteArray(buf, wmp_charge_policy_set.res);
        PackUtil.putProtocolObj(buf, wmp_charge_policy_set.account);
        PackUtil.putProtocolObj(buf, wmp_charge_policy_set.policy);
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_charge_policy_set wmp_charge_policy_set = new wmp_charge_policy_set();

        wmp_charge_policy_set.port_id.setByte(PackUtil.getByte(buf));
        PackUtil.parseByteArray(buf, wmp_charge_policy_set.res);
        PackUtil.parseProtocolObj(buf, wmp_charge_policy_set.account, wmp_account.class);
        PackUtil.parseProtocolObj(buf, wmp_charge_policy_set.policy, wmp_policy.class);

        return wmp_charge_policy_set;
    }
}

