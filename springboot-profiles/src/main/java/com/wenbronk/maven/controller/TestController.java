package com.wenbronk.maven.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenbronk.maven.config.TestConfig;

/**
 * 测试多环境部署
 * 
 * @author wenbronk
 * @time 2017年5月12日
 */
@RestController
public class TestController {

	@Autowired
	private Environment env;

	@Autowired
	private TestConfig testConfig;

	/**
	 * 
	 * @return
	 * @time 2017年5月12日
	 */
	@RequestMapping(value = "/test")
	public String test() {
		System.out.println("connect success");
		String property = env.getProperty("profile");
		System.out.println("property   " + property);

		String abc = testConfig.getAbc();
		System.out.println(abc);

		return "sucess";
	}

}
