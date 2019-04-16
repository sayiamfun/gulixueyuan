package com.atguigu.gulixueyuan.ucenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gulixueyuan.ucenter.mapper")
public class UcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcenterApplication.class, args);
	}
}
