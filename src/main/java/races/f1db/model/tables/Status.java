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
import races.f1db.model.tables.records.StatusRecord;


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
public class Status extends TableImpl<StatusRecord> {

    private static final long serialVersionUID = 505193209;

    /**
     * The reference instance of <code>public.status</code>
     */
    public static final Status STATUS = new Status();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatusRecord> getRecordType() {
        return StatusRecord.class;
    }

    /**
     * The column <code>public.status.statusid</code>.
     */
    public final TableField<StatusRecord, Integer> STATUSID = createField("statusid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('status_statusid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.status.status</code>.
     */
    public final TableField<StatusRecord, String> STATUS_ = createField("status", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.status</code> table reference
     */
    public Status() {
        this(DSL.name("status"), null);
    }

    /**
     * Create an aliased <code>public.status</code> table reference
     */
    public Status(String alias) {
        this(DSL.name(alias), STATUS);
    }

    /**
     * Create an aliased <code>public.status</code> table reference
     */
    public Status(Name alias) {
        this(alias, STATUS);
    }

    private Status(Name alias, Table<StatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private Status(Name alias, Table<StatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Status(Table<O> child, ForeignKey<O, StatusRecord> key) {
        super(child, key, STATUS);
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
        return Arrays.<Index>asList(Indexes.STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StatusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StatusRecord> getPrimaryKey() {
        return Keys.STATUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StatusRecord>> getKeys() {
        return Arrays.<UniqueKey<StatusRecord>>asList(Keys.STATUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status as(String alias) {
        return new Status(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status as(Name alias) {
        return new Status(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Status rename(String name) {
        return new Status(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Status rename(Name name) {
        return new Status(name, null);
    }
}
