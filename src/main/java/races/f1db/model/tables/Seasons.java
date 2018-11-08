/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables;


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
import races.f1db.model.tables.records.SeasonsRecord;


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
public class Seasons extends TableImpl<SeasonsRecord> {

    private static final long serialVersionUID = -1383266257;

    /**
     * The reference instance of <code>public.seasons</code>
     */
    public static final Seasons SEASONS = new Seasons();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeasonsRecord> getRecordType() {
        return SeasonsRecord.class;
    }

    /**
     * The column <code>public.seasons.year</code>.
     */
    public final TableField<SeasonsRecord, Integer> YEAR = createField("year", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.seasons.url</code>.
     */
    public final TableField<SeasonsRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.seasons</code> table reference
     */
    public Seasons() {
        this(DSL.name("seasons"), null);
    }

    /**
     * Create an aliased <code>public.seasons</code> table reference
     */
    public Seasons(String alias) {
        this(DSL.name(alias), SEASONS);
    }

    /**
     * Create an aliased <code>public.seasons</code> table reference
     */
    public Seasons(Name alias) {
        this(alias, SEASONS);
    }

    private Seasons(Name alias, Table<SeasonsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Seasons(Name alias, Table<SeasonsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Seasons(Table<O> child, ForeignKey<O, SeasonsRecord> key) {
        super(child, key, SEASONS);
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
        return Arrays.<Index>asList(Indexes.SEASONS_PKEY, Indexes.SEASONS_URL_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SeasonsRecord> getPrimaryKey() {
        return Keys.SEASONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SeasonsRecord>> getKeys() {
        return Arrays.<UniqueKey<SeasonsRecord>>asList(Keys.SEASONS_PKEY, Keys.SEASONS_URL_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seasons as(String alias) {
        return new Seasons(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seasons as(Name alias) {
        return new Seasons(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Seasons rename(String name) {
        return new Seasons(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Seasons rename(Name name) {
        return new Seasons(name, null);
    }
}
