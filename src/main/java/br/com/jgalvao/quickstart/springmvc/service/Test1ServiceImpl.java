package br.com.jgalvao.quickstart.springmvc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST)
public class Test1ServiceImpl implements Test1Service {

	private static Logger logger = LoggerFactory.getLogger(Test1ServiceImpl.class);
	
	public Test1ServiceImpl() {
		logger.info("creating Test1Service");
	}
	
	/* (non-Javadoc)
	 * @see br.com.jgalvao.quickstart.springmvc.service.Test1Service#test()
	 */
	@Override
	public void test(){
		logger.info("Test1#test called");
	}
	
}