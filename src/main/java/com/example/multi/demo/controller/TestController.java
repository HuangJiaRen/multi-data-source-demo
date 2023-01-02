package com.example.multi.demo.controller;


import com.example.multi.demo.dao.account.AccountMoneyDetailsMapper;
import com.example.multi.demo.domain.WaybillDO;
import com.example.multi.demo.domain.request.ZyIncomeCollectRequest;
import com.example.multi.demo.domain.vo.ZyIncomeCollectVO;
import com.example.multi.demo.service.WaybillService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private WaybillService waybillService;

    @Autowired
    private AccountMoneyDetailsMapper accountMoneyDetailsMapper;

    @GetMapping("/selectByWaybillNo/{waybillNo}")
    public WaybillDO selectByWaybillNo( @PathVariable(value = "waybillNo") String waybillNo){
        return waybillService.selectByWaybillNo(waybillNo);
    }

    @GetMapping(value = "/getIncomeCollect/{beginTime}")
    public List<ZyIncomeCollectVO> getIncomeCollect( @PathVariable(value = "beginTime") String beginTime){
        return accountMoneyDetailsMapper.incomeCollect(beginTime);
    }
}
