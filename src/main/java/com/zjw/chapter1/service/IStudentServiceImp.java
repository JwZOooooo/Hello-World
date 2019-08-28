package com.zjw.chapter1.service;

import java.util.List;

import com.zjw.chapter1.bean.Student;

public interface IStudentServiceImp {

	List<Student> getAllStudent();

	Student getById(Integer id);

	int addStudent(Student student);

	List<Student> getAllWithClas();
	
	
}
