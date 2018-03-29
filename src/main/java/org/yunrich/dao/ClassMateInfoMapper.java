package org.yunrich.dao;

import org.yunrich.model.ClassMateInfo;

public interface ClassMateInfoMapper {
    int insert(ClassMateInfo record);
    ClassMateInfo selectByPrimaryKey(String stuId);
    int updateByPrimaryKeySelective(ClassMateInfo record);
}