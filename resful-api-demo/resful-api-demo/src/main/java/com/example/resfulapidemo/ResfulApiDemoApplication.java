package com.example.resfulapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
public class ResfulApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResfulApiDemoApplication.class, args);
	}
	@Bean
	public Docket studentAPI() {
		return new Docket(DocumentationType.OAS_30)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.huongdanjava.springbootspringfox"))
				.paths(PathSelectors.regex("/student.*"))
				.build();
	}


}
