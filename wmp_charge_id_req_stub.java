package com.zhengbangnet.commu.wm.message;

/*
*  根据消息定义类、利用Java反射机制，由工具类MakeStubFile自动生成
*  浙江爱充网络, 2020-07-03
* */

import com.zhengbangnet.commu.wm.pack.PackException;
import com.zhengbangnet.commu.wm.pack.PackStubIF;
import com.zhengbangnet.commu.wm.pack.PackUtil;

public class wmp_charge_id_req_stub implements PackStubIF {

    @Override
    public void pack(PackUtil.Buf buf, Object o) throws PackException {
        wmp_charge_id_req wmp_charge_id_req = (wmp_charge_id_req)o;
        PackUtil.putByte(buf, wmp_charge_id_req.port_id.getByte());
    }

    @Override
    public Object unpack(PackUtil.Buf buf) throws PackException { 
        wmp_charge_id_req wmp_charge_id_req = new wmp_charge_id_req();

        wmp_charge_id_req.port_id.setByte(PackUtil.getByte(buf));

        return wmp_charge_id_req;
    }
}

