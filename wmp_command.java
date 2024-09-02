package com.zhengbangnet.commu.wm.message;

/*
 *  通信协议消息定义，修改自研究院plat_wm_def.h
 *  Eichong ZDY, 2020-4-21
 * */

/************************** 万马协议消息功能码包定义 *****************************/
public class wmp_command {

    /* 电桩上线下线  */
    public final static int WMP_REGISTER_REQ = 0x0001;    // 充电桩上线请求
    public final static int WMP_REGISTER_RESP = 0x0002;    // 充电桩上线响应
    public final static int WMP_OFFLINE_REQ = 0x0003;       // 下线通知
    public final static int WMP_CIPHER_KEY = 0x0004;        // 加解密密钥
    public final static int WMP_PLAT_KEEPLIVE = 0x0005;    // 平台保活消息

    /* 充电费率  */
    public final static int WMP_RATE_MODEL_REQ = 0x1000;    // 费率获取
    public final static int WMP_RATE_MODEL_RESP = 0x1001;    // 费率下发
    public final static int WMP_RATE_MODEL_QRY = 0x1002;    // 费率查询
    public final static int WMP_RATE_MODEL_REPORT = 0x1003;    // 费率响应

    /* 实时数据  */
    public final static int WMP_PILE_STATE = 0x2000;    // 电桩状态
    public final static int WMP_PILE_FAULT = 0x2001;    // 电桩故障
    public final static int WMP_PILE_DATA = 0x2002;    // 电桩数据

    /* 充电辅助  */
    public final static int WMP_USER_AUTHEN_REQ = 0x3000;    // 鉴权请求
    public final static int WMP_USER_AUTHEN_RESP = 0x3001;    // 鉴权响应
    public final static int WMP_CHARGE_POLICY_SET = 0x3002;    // 充电策略设置
    public final static int WMP_CHARGE_POLICY_RESP = 0x3003;    // 充电策略响应
    public final static int WMP_CHARGE_ID_REQ = 0x3004;    // 充电识别码请求
    public final static int WMP_CHARGE_ID_RESP = 0x3005;    // 充电识别码响应


    /* 充电过程  */
    public final static int WMP_START_CHARGE_CMD = 0x4000;      // 启动充电命令
    public final static int WMP_START_CHARGE_EVENT = 0x4001;    // 启动充电事件
    public final static int WMP_STOP_CHARGE_CMD = 0x4002;       // 停止充电命令
    public final static int WMP_STOP_CHARGE_EVENT = 0x4003;    // 停止充电事件
    public final static int WMP_CHARGE_DATA = 0x4004;           // 充电数据
    public final static int WMP_CHARGE_CTRL = 0x4005;           // 充电功率控制
    public final static int WMP_CHARGE_REC_REPORT = 0x4006;    // 充电记录上报
    public final static int WMP_CHARGE_REC_CONFIRM = 0x4007;    // 充电记录确认

    /* 查询与控制 */
    public final static int WMP_PILE_INFO_QRY = 0x6000;    // 电桩信息查询
    public final static int WMP_PILE_INFO_RESP = 0x6001;    // 电桩信息报告
    public final static int WMP_CTRL_INFO_QRY = 0x6002;    // 控制器信息查询
    public final static int WMP_CTRL_INFO_RESP = 0x6003;    // 控制器信息报告
    public final static int WMP_ADMIN_CMD = 0x6004;         // 远程控制命令
    public final static int WMP_ADMIN_CMD_RESP = 0x6005;    // 远程控制响应

    /* 固件更新  */
    public final static int WMP_FW_INFO_REQ = 0x8000;    // 固件概要获取
    public final static int WMP_FW_INFO_RESP = 0x8001;    // 固件概要信息
    public final static int WMP_FW_BLK_REQ = 0x8002;    // 固件数据块请求
    public final static int WMP_FW_BLK_RESP = 0x8003;    // 固件数据块响应
}
