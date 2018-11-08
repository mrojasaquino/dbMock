package races.dbmocker;

import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.tools.jdbc.MockDataProvider;
import org.jooq.tools.jdbc.MockExecuteContext;
import org.jooq.tools.jdbc.MockResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyDataProvider implements MockDataProvider {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyDataProvider.class);
	
	public MockResult[] execute(MockExecuteContext ctx) throws SQLException {
		// You might need a DSLContext to create org.jooq.Result and org.jooq.Record objects
        DSLContext create = DSL.using(SQLDialect.POSTGRES_10);
        MockResult[] mock = new MockResult[1];
        
        // The execute context contains SQL string(s), bind values, and other meta-data
        String sql = ctx.sql();
        
        LOGGER.info("SQL : {}", sql);
        
        // Exceptions are propagated through the JDBC and jOOQ APIs
        if (sql.toUpperCase().startsWith("DROP")) {
            throw new SQLException("Statement not supported: " + sql);
        }
        
        // You decide, whether any given statement returns results, and how many
        else if (sql.toUpperCase().startsWith("SELECT")) {
            
            // Always return one record
        	Field<Integer> id = DSL.field("id", int.class);
        	Field<String> nombre = DSL.field("nombre", String.class);
            Result<Record2<Integer, String>> result = create.newResult(id, nombre);
            result.add(create
                .newRecord(id, nombre)
                .values(1, "Orwell"));
            mock[0] = new MockResult(1, result);
        }
        
        // You can detect batch statements easily
        else if (ctx.batch()) {
            // [...]
        }
        
        return mock;
		
		
		
	}

}
