package com.zjw.chapter1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zjw.chapter1.bean.Student;

@Mapper
public interface StudentRepository {

	//查全部
	List<Student> getAllStudent();
	
	//id查询
	Student getById(Integer id);
	
	//增加
	int addOne(Student student);
	
	
	List<Student>	getAllStudentWithClas();
}
