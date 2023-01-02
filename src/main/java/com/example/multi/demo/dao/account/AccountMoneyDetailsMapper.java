package com.example.multi.demo.dao.account;

import com.example.multi.demo.domain.request.ZyIncomeCollectRequest;
import com.example.multi.demo.domain.vo.ZyIncomeCollectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMoneyDetailsMapper {

    List<ZyIncomeCollectVO> incomeCollect(String beginTime);


}
