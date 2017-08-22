package org.jks.dao;

import org.jks.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}