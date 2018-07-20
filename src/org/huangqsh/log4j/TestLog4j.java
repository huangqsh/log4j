package org.huangqsh.log4j;

import org.apache.log4j.Logger;
import org.huangqsh.log4j.service.LogService;

public class TestLog4j {
	
	private static Logger logger = Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) {
		logger.info("哈哈哈哈哈");
		LogService logService = new LogService();
		logService.addLog();
	}
}
