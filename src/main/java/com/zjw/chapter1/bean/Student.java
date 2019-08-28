package com.zjw.chapter1.bean;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer studentId;
	
	@NotBlank(message="name不能为空")
	private String name;
	
	
	private Integer clasId;
	
	private String clasName;
	
	
	
}
