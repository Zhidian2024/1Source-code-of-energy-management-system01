package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.ProtocolObj;
import com.zhengbangnet.commu.wm.pack.UnsignedChar;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电策略数据结构定义 *****************************/
public class wmp_charge_policy_set {
    public UnsignedChar port_id = new UnsignedChar(); // 充电端口, 从1开始
    public byte[] res = new byte[3];     // 保留
    public ProtocolObj<wmp_account> account = new ProtocolObj(1 + wmp_account.WMP_ACCOUNT_LEN); // 充电帐号
    public ProtocolObj<wmp_policy> policy = new ProtocolObj(8);
}
