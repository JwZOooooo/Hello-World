package com.zjw.chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zjw.chapter1.bean.Student;
import com.zjw.chapter1.service.IStudentServiceImp;
import com.zjw.chapter1.util.ResponseUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/student")
//swagger 的使用
@Api(tags="用户API01")
public class StudentController {
	
	@Autowired
	private IStudentServiceImp studentService;
	
	@ApiOperation(value="hello 执行")
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public Object hello() {
		log.info("成功执行");
		return  ResponseUtil.success("hello world");
	}
	 @ApiOperation(value="用户查询全部")
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public Object getStudents() {
		log.info("查询全部");
		return  ResponseUtil.success(studentService.getAllStudent());
	}
	
	 @ApiOperation(value="用户查询学生的全部信息")
	@RequestMapping(value="/getAllWithClas",method=RequestMethod.GET)
	public Object getStudentsWithClas() {
		log.info("查询学生的全部信息");
		return ResponseUtil.success(studentService.getAllWithClas());
	}
	 @ApiOperation(value="用户按照id查询")
	@RequestMapping(value="/getOne/{id}",method=RequestMethod.GET)
	public Object getById(@PathVariable Integer id) {
		log.info("按照id查询");
		return  ResponseUtil.success(studentService.getById(id));
	}
	 
	 
	 @ApiOperation(value="用户新增")
	@RequestMapping(value="/insert/valid",method=RequestMethod.POST)
	public Object addStuent(@RequestBody Student student) {
		log.info("增加......");
		return  ResponseUtil.success(studentService.addStudent(student));
	}
	
	
}
