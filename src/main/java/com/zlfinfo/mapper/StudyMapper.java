package com.zlfinfo.mapper;

import com.zlfinfo.model.Study;

public interface StudyMapper {
    int deleteByPrimaryKey(Integer stdId);

    int insert(Study record);

    int insertSelective(Study record);

    Study selectByPrimaryKey(Integer stdId);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKey(Study record);
}