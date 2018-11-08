/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables;


import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import races.f1db.model.Indexes;
import races.f1db.model.Keys;
import races.f1db.model.Public;
import races.f1db.model.tables.records.PitstopsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pitstops extends TableImpl<PitstopsRecord> {

    private static final long serialVersionUID = -1485534910;

    /**
     * The reference instance of <code>public.pitstops</code>
     */
    public static final Pitstops PITSTOPS = new Pitstops();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PitstopsRecord> getRecordType() {
        return PitstopsRecord.class;
    }

    /**
     * The column <code>public.pitstops.raceid</code>.
     */
    public final TableField<PitstopsRecord, Integer> RACEID = createField("raceid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.pitstops.driverid</code>.
     */
    public final TableField<PitstopsRecord, Integer> DRIVERID = createField("driverid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.pitstops.stop</code>.
     */
    public final TableField<PitstopsRecord, Integer> STOP = createField("stop", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.pitstops.lap</code>.
     */
    public final TableField<PitstopsRecord, Integer> LAP = createField("lap", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.pitstops.time</code>.
     */
    public final TableField<PitstopsRecord, Time> TIME = createField("time", org.jooq.impl.SQLDataType.TIME.nullable(false), this, "");

    /**
     * The column <code>public.pitstops.duration</code>.
     */
    public final TableField<PitstopsRecord, String> DURATION = createField("duration", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.pitstops.milliseconds</code>.
     */
    public final TableField<PitstopsRecord, Integer> MILLISECONDS = createField("milliseconds", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.pitstops</code> table reference
     */
    public Pitstops() {
        this(DSL.name("pitstops"), null);
    }

    /**
     * Create an aliased <code>public.pitstops</code> table reference
     */
    public Pitstops(String alias) {
        this(DSL.name(alias), PITSTOPS);
    }

    /**
     * Create an aliased <code>public.pitstops</code> table reference
     */
    public Pitstops(Name alias) {
        this(alias, PITSTOPS);
    }

    private Pitstops(Name alias, Table<PitstopsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pitstops(Name alias, Table<PitstopsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Pitstops(Table<O> child, ForeignKey<O, PitstopsRecord> key) {
        super(child, key, PITSTOPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PITSTOPS_PKEY, Indexes.PITSTOPS_RACEID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PitstopsRecord> getPrimaryKey() {
        return Keys.PITSTOPS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PitstopsRecord>> getKeys() {
        return Arrays.<UniqueKey<PitstopsRecord>>asList(Keys.PITSTOPS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pitstops as(String alias) {
        return new Pitstops(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pitstops as(Name alias) {
        return new Pitstops(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pitstops rename(String name) {
        return new Pitstops(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pitstops rename(Name name) {
        return new Pitstops(name, null);
    }
}
