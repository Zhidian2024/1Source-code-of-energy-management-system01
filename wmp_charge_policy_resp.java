package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.UnsignedChar;
import com.zhengbangnet.commu.wm.pack.UnsignedShort;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电策略数据结构定义 *****************************/
public class wmp_charge_policy_resp {

    /* 策略配置结果 */
    public final static int WMP_POLICY_SUCESS = 0;        // 策略成功
    public final static int WMP_POLICY_ACCOUNT = 1;       // 帐号非法
    public final static int WMP_POLICY_LOCK = 2;          // 帐号锁定
    public final static int WMP_POLICY_BALENCE = 3;       // 余额不足
    public final static int WMP_POLICY_PARAM = 4;         // 参数非法
    public final static int WMP_POLICY_ELSE = 255;        // 其他错误

    public UnsignedChar port_id = new UnsignedChar();     // 充电端口, 从1开始
    public byte res;                                      // 保留
    public UnsignedShort result = new UnsignedShort();    // 结果
}
