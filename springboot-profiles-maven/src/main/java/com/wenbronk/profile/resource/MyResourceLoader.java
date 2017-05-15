package com.wenbronk.profile.resource;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * 实现resourceLoaderAware , 加载外部资源文件
 * 
 * @author wenbronk
 * @time 2017年5月15日
 */
@Component
public class MyResourceLoader implements ResourceLoaderAware{
	
	private ResourceLoader resourceLoader;
	
	
	public Resource getresourceLoader(String path) {
		return resourceLoader.getResource("classpath:" + path);
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
}
