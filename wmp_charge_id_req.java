package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.UnsignedChar;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电识别码数据结构定义 *****************************/
public class wmp_charge_id_req {
    public UnsignedChar port_id = new UnsignedChar(); // 充电端口, 从1开始
}
