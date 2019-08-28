package com.zjw.chapter1.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjw.chapter1.bean.Student;
import com.zjw.chapter1.dao.StudentRepository;
import com.zjw.chapter1.service.IStudentServiceImp;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class StudentServiceImp implements IStudentServiceImp{

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent(){
		return studentRepository.getAllStudent();
	}

	@Override
	public Student getById(Integer id) {
		return studentRepository.getById(id);
	}
	
	@Override
	public int addStudent(Student student) {
		log.info("studentId====="+student.getStudentId());
		return studentRepository.addOne(student);
	}
	
	@Override
	public List<Student> getAllWithClas(){
		return studentRepository.getAllStudentWithClas();
	}
	
}
