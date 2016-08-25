package com.zlfinfo.mapper;

import com.zlfinfo.model.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer queId);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(String queId);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

    List<Question> selectUserAllQuora(String username);

    List<Question> selectQuestionByUser(@Param("username") String username, @Param("flag") Integer flag);
}