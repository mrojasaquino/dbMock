/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
import races.f1db.model.tables.records.ResultsRecord;


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
public class Results extends TableImpl<ResultsRecord> {

    private static final long serialVersionUID = 764199167;

    /**
     * The reference instance of <code>public.results</code>
     */
    public static final Results RESULTS = new Results();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResultsRecord> getRecordType() {
        return ResultsRecord.class;
    }

    /**
     * The column <code>public.results.resultid</code>.
     */
    public final TableField<ResultsRecord, Integer> RESULTID = createField("resultid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('results_resultid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.raceid</code>.
     */
    public final TableField<ResultsRecord, Integer> RACEID = createField("raceid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.driverid</code>.
     */
    public final TableField<ResultsRecord, Integer> DRIVERID = createField("driverid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.constructorid</code>.
     */
    public final TableField<ResultsRecord, Integer> CONSTRUCTORID = createField("constructorid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.number</code>.
     */
    public final TableField<ResultsRecord, Integer> NUMBER = createField("number", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.results.grid</code>.
     */
    public final TableField<ResultsRecord, Integer> GRID = createField("grid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.position</code>.
     */
    public final TableField<ResultsRecord, Integer> POSITION = createField("position", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.results.positiontext</code>.
     */
    public final TableField<ResultsRecord, String> POSITIONTEXT = createField("positiontext", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.results.positionorder</code>.
     */
    public final TableField<ResultsRecord, Integer> POSITIONORDER = createField("positionorder", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.points</code>.
     */
    public final TableField<ResultsRecord, Double> POINTS = createField("points", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.field("'0'::double precision", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>public.results.laps</code>.
     */
    public final TableField<ResultsRecord, Integer> LAPS = createField("laps", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.time</code>.
     */
    public final TableField<ResultsRecord, String> TIME = createField("time", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.results.milliseconds</code>.
     */
    public final TableField<ResultsRecord, Integer> MILLISECONDS = createField("milliseconds", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.results.fastestlap</code>.
     */
    public final TableField<ResultsRecord, Integer> FASTESTLAP = createField("fastestlap", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.results.rank</code>.
     */
    public final TableField<ResultsRecord, Integer> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.results.fastestlaptime</code>.
     */
    public final TableField<ResultsRecord, String> FASTESTLAPTIME = createField("fastestlaptime", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.results.fastestlapspeed</code>.
     */
    public final TableField<ResultsRecord, String> FASTESTLAPSPEED = createField("fastestlapspeed", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.results.statusid</code>.
     */
    public final TableField<ResultsRecord, Integer> STATUSID = createField("statusid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.results</code> table reference
     */
    public Results() {
        this(DSL.name("results"), null);
    }

    /**
     * Create an aliased <code>public.results</code> table reference
     */
    public Results(String alias) {
        this(DSL.name(alias), RESULTS);
    }

    /**
     * Create an aliased <code>public.results</code> table reference
     */
    public Results(Name alias) {
        this(alias, RESULTS);
    }

    private Results(Name alias, Table<ResultsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Results(Name alias, Table<ResultsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Results(Table<O> child, ForeignKey<O, ResultsRecord> key) {
        super(child, key, RESULTS);
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
        return Arrays.<Index>asList(Indexes.RESULTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ResultsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESULTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResultsRecord> getPrimaryKey() {
        return Keys.RESULTS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResultsRecord>> getKeys() {
        return Arrays.<UniqueKey<ResultsRecord>>asList(Keys.RESULTS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Results as(String alias) {
        return new Results(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Results as(Name alias) {
        return new Results(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Results rename(String name) {
        return new Results(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Results rename(Name name) {
        return new Results(name, null);
    }
}
