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
import races.f1db.model.tables.records.QualifyingRecord;


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
public class Qualifying extends TableImpl<QualifyingRecord> {

    private static final long serialVersionUID = 2069970660;

    /**
     * The reference instance of <code>public.qualifying</code>
     */
    public static final Qualifying QUALIFYING = new Qualifying();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QualifyingRecord> getRecordType() {
        return QualifyingRecord.class;
    }

    /**
     * The column <code>public.qualifying.qualifyid</code>.
     */
    public final TableField<QualifyingRecord, Integer> QUALIFYID = createField("qualifyid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('qualifying_qualifyid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.qualifying.raceid</code>.
     */
    public final TableField<QualifyingRecord, Integer> RACEID = createField("raceid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.qualifying.driverid</code>.
     */
    public final TableField<QualifyingRecord, Integer> DRIVERID = createField("driverid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.qualifying.constructorid</code>.
     */
    public final TableField<QualifyingRecord, Integer> CONSTRUCTORID = createField("constructorid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.qualifying.number</code>.
     */
    public final TableField<QualifyingRecord, Integer> NUMBER = createField("number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.qualifying.position</code>.
     */
    public final TableField<QualifyingRecord, Integer> POSITION = createField("position", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.qualifying.q1</code>.
     */
    public final TableField<QualifyingRecord, String> Q1 = createField("q1", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.qualifying.q2</code>.
     */
    public final TableField<QualifyingRecord, String> Q2 = createField("q2", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.qualifying.q3</code>.
     */
    public final TableField<QualifyingRecord, String> Q3 = createField("q3", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.qualifying</code> table reference
     */
    public Qualifying() {
        this(DSL.name("qualifying"), null);
    }

    /**
     * Create an aliased <code>public.qualifying</code> table reference
     */
    public Qualifying(String alias) {
        this(DSL.name(alias), QUALIFYING);
    }

    /**
     * Create an aliased <code>public.qualifying</code> table reference
     */
    public Qualifying(Name alias) {
        this(alias, QUALIFYING);
    }

    private Qualifying(Name alias, Table<QualifyingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Qualifying(Name alias, Table<QualifyingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Qualifying(Table<O> child, ForeignKey<O, QualifyingRecord> key) {
        super(child, key, QUALIFYING);
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
        return Arrays.<Index>asList(Indexes.QUALIFYING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<QualifyingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_QUALIFYING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<QualifyingRecord> getPrimaryKey() {
        return Keys.QUALIFYING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<QualifyingRecord>> getKeys() {
        return Arrays.<UniqueKey<QualifyingRecord>>asList(Keys.QUALIFYING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Qualifying as(String alias) {
        return new Qualifying(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Qualifying as(Name alias) {
        return new Qualifying(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Qualifying rename(String name) {
        return new Qualifying(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Qualifying rename(Name name) {
        return new Qualifying(name, null);
    }
}
