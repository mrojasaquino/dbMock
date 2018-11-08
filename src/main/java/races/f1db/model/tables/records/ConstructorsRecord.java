/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import races.f1db.model.tables.Constructors;


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
public class ConstructorsRecord extends UpdatableRecordImpl<ConstructorsRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = 57009275;

    /**
     * Setter for <code>public.constructors.constructorid</code>.
     */
    public void setConstructorid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.constructors.constructorid</code>.
     */
    public Integer getConstructorid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.constructors.constructorref</code>.
     */
    public void setConstructorref(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.constructors.constructorref</code>.
     */
    public String getConstructorref() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.constructors.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.constructors.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.constructors.nationality</code>.
     */
    public void setNationality(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.constructors.nationality</code>.
     */
    public String getNationality() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.constructors.url</code>.
     */
    public void setUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.constructors.url</code>.
     */
    public String getUrl() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Constructors.CONSTRUCTORS.CONSTRUCTORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Constructors.CONSTRUCTORS.CONSTRUCTORREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Constructors.CONSTRUCTORS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Constructors.CONSTRUCTORS.NATIONALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Constructors.CONSTRUCTORS.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getConstructorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getConstructorref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNationality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getConstructorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstructorref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNationality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorsRecord value1(Integer value) {
        setConstructorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorsRecord value2(String value) {
        setConstructorref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorsRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorsRecord value4(String value) {
        setNationality(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorsRecord value5(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorsRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConstructorsRecord
     */
    public ConstructorsRecord() {
        super(Constructors.CONSTRUCTORS);
    }

    /**
     * Create a detached, initialised ConstructorsRecord
     */
    public ConstructorsRecord(Integer constructorid, String constructorref, String name, String nationality, String url) {
        super(Constructors.CONSTRUCTORS);

        set(0, constructorid);
        set(1, constructorref);
        set(2, name);
        set(3, nationality);
        set(4, url);
    }
}
