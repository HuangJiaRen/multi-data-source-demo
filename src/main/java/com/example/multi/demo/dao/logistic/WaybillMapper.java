package com.example.multi.demo.dao.logistic;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.multi.demo.domain.WaybillDO;

/**
 * <p>
 * 智运-运单表 Mapper 接口
 * </p>
 *
 * @author liyuhang
 * @since 2021-06-07
 */
public interface WaybillMapper extends BaseMapper<WaybillDO> {

    /**
     * 根据运单号查询运单
     *
     * @param waybillNo 运单号
     * @return 实体
     */
    WaybillDO selectByWaybillNo(String waybillNo);


}
