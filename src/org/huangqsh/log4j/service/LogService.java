package org.huangqsh.log4j.service;

import org.apache.log4j.Logger;
import org.huangqsh.log4j.dao.LogDao;

public class LogService {
	private Logger logger = Logger.getLogger(LogService.class);
	public void addLog() {
		LogDao logDao = new LogDao();
		logger.error("嗯嗯嗯嗯嗯嗯");
		logDao.addLog();
		
	}
}
