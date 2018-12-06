package com.archimedes.mockserver.mapper;

import com.archimedes.mockserver.domain.CreditDecision;

public interface CreditDecisionMapper {
    int deleteByPrimaryKey(String creditNo);

    int insert(CreditDecision record);

    int insertSelective(CreditDecision record);

    CreditDecision selectByPrimaryKey(String creditNo);

    int updateByPrimaryKeySelective(CreditDecision record);

    int updateByPrimaryKey(CreditDecision record);
}