package com.leantech.proxy;

import com.leantech.proxy.filter.PreFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@EnableZuulProxy
@Slf4j
@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		log.info("Como las yucas");
		SpringApplication.run(ProxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

}
