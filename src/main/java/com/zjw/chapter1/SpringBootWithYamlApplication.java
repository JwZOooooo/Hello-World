package com.zjw.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
public class SpringBootWithYamlApplication {

	public static void main(String[] args) {
		log.info("项目启动中...");
		SpringApplication.run(SpringBootWithYamlApplication.class, args);
	}
}
