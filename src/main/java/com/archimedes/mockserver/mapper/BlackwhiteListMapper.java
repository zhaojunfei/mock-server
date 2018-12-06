package com.archimedes.mockserver.mapper;

import com.archimedes.mockserver.domain.BlackwhiteList;
import com.archimedes.mockserver.domain.BlackwhiteListKey;

public interface BlackwhiteListMapper {
    int deleteByPrimaryKey(BlackwhiteListKey key);

    int insert(BlackwhiteList record);

    int insertSelective(BlackwhiteList record);

    BlackwhiteList selectByPrimaryKey(BlackwhiteListKey key);

    int updateByPrimaryKeySelective(BlackwhiteList record);

    int updateByPrimaryKey(BlackwhiteList record);
}