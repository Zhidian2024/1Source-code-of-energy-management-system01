package com.zhengbangnet.commu.wm.message;

import com.zhengbangnet.commu.wm.pack.ProtocolStr;
import com.zhengbangnet.commu.wm.pack.UnsignedChar;
import com.zhengbangnet.commu.wm.pack.UnsignedInt;
import com.zhengbangnet.commu.wm.pack.UnsignedShort;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-23
 * */

/************************** 充电识别码数据结构定义 *****************************/
public class wmp_charge_id_resp {
    public final static int WMP_CHARGE_ID_LEN = 8;      // 充电识别码长度
    /* 充电识别码请求结果结果 */
    public final static int WMP_CHGID_SUCESS = 0;       // 请求成功
    public final static int WMP_CHGID_ELSE = 255;       // 其他错误

    public UnsignedChar port_id = new UnsignedChar();   // 充电端口, 从1开始
    public byte res;                                    // 保留
    public UnsignedShort result = new UnsignedShort();  // 结果
    // 充电识别码
    public ProtocolStr id = new ProtocolStr(ProtocolStr.Type.PST_ASCII, WMP_CHARGE_ID_LEN);
    public UnsignedInt time = new UnsignedInt();        // 生成时间，1970秒
}
