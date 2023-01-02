package com.example.multi.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.multi.demo.domain.WaybillDO;

/**
 * <p>
 * 智运-运单表 服务类
 * </p>
 *
 * @author liyuhang
 * @since 2021-06-07
 */
public interface WaybillService{



    /**
     * 根据运单号查询运单
     *
     * @param waybillNo 运单号
     * @return 实体
     */
    WaybillDO selectByWaybillNo(String waybillNo);


}
