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
import races.f1db.model.tables.records.CircuitsRecord;


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
public class Circuits extends TableImpl<CircuitsRecord> {

    private static final long serialVersionUID = 830211859;

    /**
     * The reference instance of <code>public.circuits</code>
     */
    public static final Circuits CIRCUITS = new Circuits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CircuitsRecord> getRecordType() {
        return CircuitsRecord.class;
    }

    /**
     * The column <code>public.circuits.circuitid</code>.
     */
    public final TableField<CircuitsRecord, Integer> CIRCUITID = createField("circuitid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('circuits_circuitid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.circuits.circuitref</code>.
     */
    public final TableField<CircuitsRecord, String> CIRCUITREF = createField("circuitref", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.circuits.name</code>.
     */
    public final TableField<CircuitsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.circuits.location</code>.
     */
    public final TableField<CircuitsRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.circuits.country</code>.
     */
    public final TableField<CircuitsRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.circuits.lat</code>.
     */
    public final TableField<CircuitsRecord, Double> LAT = createField("lat", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.circuits.lng</code>.
     */
    public final TableField<CircuitsRecord, Double> LNG = createField("lng", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.circuits.alt</code>.
     */
    public final TableField<CircuitsRecord, Integer> ALT = createField("alt", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.circuits.url</code>.
     */
    public final TableField<CircuitsRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.circuits</code> table reference
     */
    public Circuits() {
        this(DSL.name("circuits"), null);
    }

    /**
     * Create an aliased <code>public.circuits</code> table reference
     */
    public Circuits(String alias) {
        this(DSL.name(alias), CIRCUITS);
    }

    /**
     * Create an aliased <code>public.circuits</code> table reference
     */
    public Circuits(Name alias) {
        this(alias, CIRCUITS);
    }

    private Circuits(Name alias, Table<CircuitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Circuits(Name alias, Table<CircuitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Circuits(Table<O> child, ForeignKey<O, CircuitsRecord> key) {
        super(child, key, CIRCUITS);
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
        return Arrays.<Index>asList(Indexes.CIRCUITS_PKEY, Indexes.CIRCUITS_URL_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CircuitsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CIRCUITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CircuitsRecord> getPrimaryKey() {
        return Keys.CIRCUITS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CircuitsRecord>> getKeys() {
        return Arrays.<UniqueKey<CircuitsRecord>>asList(Keys.CIRCUITS_PKEY, Keys.CIRCUITS_URL_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Circuits as(String alias) {
        return new Circuits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Circuits as(Name alias) {
        return new Circuits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Circuits rename(String name) {
        return new Circuits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Circuits rename(Name name) {
        return new Circuits(name, null);
    }
}
