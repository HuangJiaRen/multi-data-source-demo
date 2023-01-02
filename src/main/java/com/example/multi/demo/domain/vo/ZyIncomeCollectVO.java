package com.example.multi.demo.domain.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author:zhangym
 * @date:2022/9/2 18:15
 */
@Data
public class ZyIncomeCollectVO {

    public BigDecimal amount;

    private Integer taxSource;

    /**
     *  11=资金明细 12=核算明细
     */
    private String detailType;

    private String customerNo;

    private Integer countNum;
}
