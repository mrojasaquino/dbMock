package races.dbmocker;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.jooq.tools.jdbc.MockConnection;
import org.jooq.tools.jdbc.MockDataProvider;
import org.jooq.tools.jdbc.MockFileDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockTesterFile {

	private final static Logger LOGGER = LoggerFactory.getLogger(MockTesterFile.class);
	
	public static void main(String[] args) throws IOException {
		MockDataProvider db = new MockFileDatabase(new File("drivers.txt"));
		
		try(Connection c = new MockConnection(db)) {
			Statement stmt = c.createStatement();
			
			try(ResultSet rs = stmt.executeQuery("select * from drivers")) {
				while(rs.next()) {
					LOGGER.info("{} - {} - {}", 
							rs.getString("code"),
							rs.getString("forename"),
							rs.getString("surname")
							);
				}
			}
			
		} catch (Exception e) {
			LOGGER.error("", e);
		}
		
	}
}
