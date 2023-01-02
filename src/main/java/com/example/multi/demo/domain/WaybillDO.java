package com.example.multi.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 智运-运单表
 * </p>
 *
 * @author liyuhang
 * @since 2021-06-07
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("waybill")
public class WaybillDO extends BaseDO implements Serializable {

    private static final long serialVersionUID = 8754585529063164350L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 客户编号
     */
    private String customerNo;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 运单编号
     */
    private String waybillNo;

    /**
     * 货物编号
     */
    private String cargoNo;

    /**
     * 货物名称
     */
    private String cargoName;

    /**
     * 货物类型
     */
    private String cargoType;

    /**
     * 货物名前缀
     */
    private String cargoPrefix;

    /**
     * 计划装运货物重量
     */
    private BigDecimal planSendCargoWeight;

    /**
     * 实际装运货物重量
     */
    private BigDecimal realSendCargoWeight;

    /**
     * 实际交付货物重量
     */
    private BigDecimal realDeliverCargoWeight;

    /**
     * 结算重量
     */
    private BigDecimal settlementCargoWeight;

    /**
     * 实际货损
     */
    private BigDecimal lossWeight;

    /**
     * 货物单价
     */
    private BigDecimal cargoPrice;

    /**
     * 运费单价(0使用合作税率、1不使用合作说率)
     */
    private Integer freightRate;

    /**
     * 合作税率
     */
    private BigDecimal cooperationTaxRate;

    /**
     * 货物随机码
     */
    private String cargoRandomCode;

    /**
     * 运输模式: 0.短倒运输 1.干线运输
     */
    private Integer distanceType;

    /**
     * 计费方式: 0.计重 1.包车 2.计方
     */
    private Integer rulesType;

    /**
     * 运力方式: 0.正常模式 1.自由模式
     */
    private Integer capacityType;

    /**
     * 结算方式: 0.见表结算 1.见磅单结算 2.听通知结算 3.正常结算 4.见预付结算 5.月结
     */
    private Integer settlementType;

    /**
     * 结算对象
     */
    private String settlementName;

    /**
     * 结算手机号
     */
    private String settlementPhone;


    /**
     * 订单中发单模式: 0.公开 1.指定车辆 2.指定承运商 3.暗单
     */
    private Integer receiptPattern;

    /**
     * 订单中计费规则是否选择了内保: 0.未投保 1. 投保
     */
    private Integer internalBonded;

    /**
     * 订单中是计费规则是否选择了预付费: 0.否 1.是
     */
    private Integer prepay;

    /**
     * 运输里程
     */
    private BigDecimal distance;

    /**
     * 车牌号
     */
    private String plateNumber;

    /**
     * 车编号
     */
    private String carNo;

    /**
     * 承运商编号
     */
    private String carrierNo;

    /**
     * 承运商名称
     */
    private String carrierName;

    /**
     * 司机编号
     */
    private String driverNo;

    /**
     * 司机名称
     */
    private String driverName;

    /**
     * 司机电话
     */
    private String driverPhone;

    /**
     * 发货省份编号
     */
    private String startProvinceNo;

    /**
     * 发货城市编号
     */
    private String startCityNo;

    /**
     * 发货区县编号
     */
    private String startDistrictNo;

    /**
     * 收货省份编号
     */
    private String endProvinceNo;

    /**
     * 收货城市编号
     */
    private String endCityNo;

    /**
     * 收货区县编号
     */
    private String endDistrictNo;

    /**
     * 要求最晚装货时间    待装运
     */
    private LocalDateTime requiredLoadingTime;

    /**
     * 要求最晚送达时间    待交付
     */
    private LocalDateTime requiredArriveTime;


    /**
     * 提交核算时间    待核算
     */
    private LocalDateTime submitAccountingTime;

    /**
     * 核算时间   已核算
     */
    private LocalDateTime accountedTime;

    /**
     * 取消
     */
    private LocalDateTime cancelTime;

    /**
     * 运单完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 运单上报状态:0.未上报 1.已上报 2.上报失败
     */
    private Integer uploadStatus;

    /**
     * 是否在途 :0.不在途 1.在途
     */
    private Integer onWay;

    /**
     * 是否在线 :0.在线 1.离线
     */
    private Integer onLine;
    /**
     * 最后位置更新时间数值
     */
    private Long lastLocation;

    /**
     * 资金上报状态:0.未上报 1.已上报 2.上报失败
     */
    private Integer amountUploadStatus;

    /**
     * 申请支付时间
     */
    private LocalDateTime applyTime;

    /**
     * 支付状态:0.未支付 1.已支付
     */
    private Integer payStatus;

    /**
     * 待核算状态拆分：0 待交付审核 1:交付驳回 2:待核算审核 3:核算通过
     */
    private Integer checkStatus;

    /**
     * 运单状态:  0.待装运 1.待交付  2.待核算 3.待结算  4.已完成 5.已取消
     */
    private Integer waybillStatus;



    /**
     * 司机评价:0.未评价 1.已评价
     */
    private Integer valuationDriver;

    /**
     * 货主评价:0.未评价 1.已评价
     */
    private Integer valuationUser;

    /**
     * 创建人信息
     */
    private String createUserNo;


    /**
     * 修改人信息
     */
    private String updateUserNo;

    /**
     * 订单时间  补单时是自定义时间 默认是当前时间
     */
    private LocalDateTime insertTime;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreated;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;

    /**
     * 是否删除:0.正常 1.删除
     */
    private Integer deleted;

    /**
     * 支付模式：0普通1代付
     */
    private Integer transferType;


    /**
     * 1130新需求
     * 税源地 : 0 天津  1 太原
     */
    private Integer taxSource;

    /**
     * 承运商类型(0 企业 1个人 2车队)
     */
    private Integer carrierType;

    /**
     * 货物类型名称
     */
    private String cargoTypeName;

    /**
     * 货物子类型
     */
    private String cargoSubTypeNo;

    /**
     * 货物子类型名称
     */
    private String cargoSubTypeName;

    /**
     * 税费承担(0 :承运商 1:平台)
     */
    private Integer whoTax;

    /**
     * 上传发货磅单时间
     */
    private LocalDateTime sendCargoTime;

    /**
     * 上传收货磅单时间
     */
    private LocalDateTime receiveCargoTime;
}