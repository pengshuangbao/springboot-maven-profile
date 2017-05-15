package com.wenbronk.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wenbronk.profiles.App;

//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@SpringBootTest(classes = App.class) 
public class Log4j2Test {

	private static Logger LOGGER = LoggerFactory.getLogger(Log4j2Test.class);
	
//	@Autowired
//	private MongoTemplate mongoTemplate;
	
	@Test
	public void test() {
		LOGGER.trace("I am trace log.");  
		LOGGER.debug("I am debug log.");  
		LOGGER.warn("I am warn log.");  
		LOGGER.error("I am error log.");
		System.out.println("i am here");
	}
	
}
