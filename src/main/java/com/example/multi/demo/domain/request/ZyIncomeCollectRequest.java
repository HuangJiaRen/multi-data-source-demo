package com.example.multi.demo.domain.request;

import lombok.Data;

import java.util.List;

/**
 * @author:zhangym
 * @date:2022/9/2 18:20
 */
@Data
public class ZyIncomeCollectRequest {

    private String beginTime;

    private String endTime;

    private Integer direction;

    private List<String> transTypeS;
}
