package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
	static Logger logger = Logger.getLogger(TestLog4j.class.getName());
	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("/home/asparagusfern/Downloads/log4j/src/log4j/log4j.properties");
//		BasicConfigurator.configure();
		logger.trace("跟踪信息");
		logger.debug("调试信息");
		logger.info("输出信息");
		logger.warn("警告信息");
		logger.error("错误信息");
		logger.fatal("致命信息");
	}
}
