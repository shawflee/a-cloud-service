package com.shawf.repository;

import com.shawf.entity.Student;

import java.util.Collection;

/**
 * @author shawf_lee
 * @date 2019/9/27 10:34
 * Content:
 */

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
