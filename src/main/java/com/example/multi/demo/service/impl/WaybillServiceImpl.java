package com.example.multi.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.example.multi.demo.dao.account.AccountMoneyDetailsMapper;
import com.example.multi.demo.dao.logistic.WaybillMapper;
import com.example.multi.demo.domain.WaybillDO;
import com.example.multi.demo.domain.vo.ZyIncomeCollectVO;
import com.example.multi.demo.service.WaybillService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 智运-运单表 服务实现类
 * </p>
 *
 * @author liyuhang
 * @since 2021-06-07
 */
@Slf4j
@Service
public class WaybillServiceImpl implements WaybillService {
    @Autowired
    private WaybillMapper waybillMapper;

    @Autowired
    private AccountMoneyDetailsMapper accountMoneyDetailsMapper;

    @Override
    public WaybillDO selectByWaybillNo(String waybillNo) {
        List<ZyIncomeCollectVO> collectVOS = accountMoneyDetailsMapper.incomeCollect("2022-06-11");
        System.out.printf("");
        return waybillMapper.selectByWaybillNo(waybillNo);
    }




}
