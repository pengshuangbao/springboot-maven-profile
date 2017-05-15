package com.wenbronk.profile.controller;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenbronk.profile.config.TestConfig;
import com.wenbronk.profile.resource.MyResourceLoader;

/**
 * 测试springboot-maven 分环境打包
 * 
 * @author wenbronk
 * @time 2017年5月15日
 */
@RestController
public class TestController {
	
	/**
	 * 可直接使用environment来配置
	 */
	 @Autowired  
	 private Environment env;

	@Autowired
	private TestConfig testConfig;
	
	@Autowired
	private MyResourceLoader resourceLoader;
	
	@RequestMapping("/test")
	public String test() throws IOException {
		String abc = testConfig.getAbc();
		System.out.println(abc);
		
		String property = env.getProperty("profile");
		System.out.println("property   " + property);
		
		Resource resource = resourceLoader.getresourceLoader("db.properties");
		String string = IOUtils.toString(resource.getInputStream(), "utf-8");
		System.out.println(string);
		return abc;
	}
	
}
