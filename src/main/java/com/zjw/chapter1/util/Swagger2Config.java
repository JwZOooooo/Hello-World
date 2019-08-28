package com.zjw.chapter1.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class Swagger2Config {

	
	
	//是否开启Swagger2
	@Value(value="${swagger.enabled}")
	Boolean swaggerEnabled;
	
	public Docket createRestApi() {
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.enable(swaggerEnabled).select()
				.apis(RequestHandlerSelectors.basePackage("com.zjw.chapter1"))
				.paths(PathSelectors.any()).build().pathMapping("/");
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SpringBoot-swagger2的集成与使用").description("JwZ")
				.version("1.0").build();
				
	}
	
}
