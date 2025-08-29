package com.ramazzotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.reactive.function.client.WebClient;

import com.ramazzotte.config.NomeProjetoProperty;


@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@EnableConfigurationProperties(NomeProjetoProperty.class)
@EnableAsync
public class SpringLivroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLivroApplication.class, args);		
		
	}
	@Bean
	public WebClient webClientapi(WebClient.Builder builder) {
		return builder.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}

}
