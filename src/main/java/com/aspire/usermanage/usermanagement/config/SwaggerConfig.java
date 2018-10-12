package com.aspire.usermanage.usermanagement.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger for User management application
 * 
 * @author kathiravan.sethurama
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public Docket userManagementApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()  
				.apis(RequestHandlerSelectors.basePackage("com.aspire.usermanage.usermanagement.controller"))
				.build();
	}
}
