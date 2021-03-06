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

import races.f1db.model.tables.Constructorresults;


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
public class ConstructorresultsRecord extends UpdatableRecordImpl<ConstructorresultsRecord> implements Record5<Integer, Integer, Integer, Double, String> {

    private static final long serialVersionUID = -939169028;

    /**
     * Setter for <code>public.constructorresults.constructorresultsid</code>.
     */
    public void setConstructorresultsid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.constructorresults.constructorresultsid</code>.
     */
    public Integer getConstructorresultsid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.constructorresults.raceid</code>.
     */
    public void setRaceid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.constructorresults.raceid</code>.
     */
    public Integer getRaceid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.constructorresults.constructorid</code>.
     */
    public void setConstructorid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.constructorresults.constructorid</code>.
     */
    public Integer getConstructorid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.constructorresults.points</code>.
     */
    public void setPoints(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.constructorresults.points</code>.
     */
    public Double getPoints() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.constructorresults.status</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.constructorresults.status</code>.
     */
    public String getStatus() {
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
    public Row5<Integer, Integer, Integer, Double, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Double, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Constructorresults.CONSTRUCTORRESULTS.CONSTRUCTORRESULTSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Constructorresults.CONSTRUCTORRESULTS.RACEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Constructorresults.CONSTRUCTORRESULTS.CONSTRUCTORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Constructorresults.CONSTRUCTORRESULTS.POINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Constructorresults.CONSTRUCTORRESULTS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getConstructorresultsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRaceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getConstructorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getConstructorresultsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRaceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getConstructorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorresultsRecord value1(Integer value) {
        setConstructorresultsid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorresultsRecord value2(Integer value) {
        setRaceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorresultsRecord value3(Integer value) {
        setConstructorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorresultsRecord value4(Double value) {
        setPoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorresultsRecord value5(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConstructorresultsRecord values(Integer value1, Integer value2, Integer value3, Double value4, String value5) {
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
     * Create a detached ConstructorresultsRecord
     */
    public ConstructorresultsRecord() {
        super(Constructorresults.CONSTRUCTORRESULTS);
    }

    /**
     * Create a detached, initialised ConstructorresultsRecord
     */
    public ConstructorresultsRecord(Integer constructorresultsid, Integer raceid, Integer constructorid, Double points, String status) {
        super(Constructorresults.CONSTRUCTORRESULTS);

        set(0, constructorresultsid);
        set(1, raceid);
        set(2, constructorid);
        set(3, points);
        set(4, status);
    }
}
