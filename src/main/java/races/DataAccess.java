package races;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public enum DataAccess {

	INSTANCE;
	
	private final Logger logger = LoggerFactory.getLogger(DataAccess.class);
	
	private HikariDataSource ds; 
	
	
	private Properties props;
	private boolean testing;
	
		
	private DataAccess() {
		init();
	}

	private void init() {
		props = new Properties();
		
		try(InputStream inStr = new FileInputStream(new File("system.properties"))) {
			
			props.load(inStr);
			
			testing = Boolean.parseBoolean(props.getProperty("testing", "false"));
			
			if(!testing) {
				HikariConfig hConfig = new HikariConfig();
				hConfig.setUsername(props.getProperty("jdbc.user"));
				hConfig.setPassword(props.getProperty("jdbc.password"));
				hConfig.setJdbcUrl(props.getProperty("jdbc.url"));
				
				ds = new HikariDataSource(hConfig);
			}
			
		} catch (Exception e) {
			logger.error("", e);
		}
		
	}
	
	
	public DSLContext getDbCtx() {
		
		DSLContext retVal = null;
		
		if(testing) {
			
		} else {
			
		}
		
		return retVal;
	}
	
}
