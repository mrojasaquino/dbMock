package dbmocker;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.tools.jdbc.MockConnection;
import org.jooq.tools.jdbc.MockDataProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockTester {

	private static final Logger LOGGER = LoggerFactory.getLogger(MockTester.class);
	
	public static void main(String[] args) {
		MockDataProvider provider = new MyDataProvider();
		MockConnection connection = new MockConnection(provider);
		
		DSLContext create = DSL.using(connection, SQLDialect.POSTGRES_10);
		
		testJooqDsl(create);
		testSqlString(create);
	}

	private static void testJooqDsl(DSLContext create) {
		Result<Record> result = create.selectFrom("paciente").where(DSL.field("id", int.class).eq(5)).fetch();
		
		result.forEach(rec -> LOGGER.info("Record :\n {}",rec));
	}

	
	private static void testSqlString(DSLContext create) {
		Result<Record> result = create.fetch("SELECT * FROM paciente WHERE id = ?", 5);
		
		result.forEach(rec -> LOGGER.info("Record :\n {}",rec));
	}
	
	
}
