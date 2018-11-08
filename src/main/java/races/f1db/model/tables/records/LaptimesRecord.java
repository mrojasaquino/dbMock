/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import races.f1db.model.tables.Laptimes;


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
public class LaptimesRecord extends UpdatableRecordImpl<LaptimesRecord> implements Record6<Integer, Integer, Integer, Integer, String, Integer> {

    private static final long serialVersionUID = -1747988839;

    /**
     * Setter for <code>public.laptimes.raceid</code>.
     */
    public void setRaceid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.laptimes.raceid</code>.
     */
    public Integer getRaceid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.laptimes.driverid</code>.
     */
    public void setDriverid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.laptimes.driverid</code>.
     */
    public Integer getDriverid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.laptimes.lap</code>.
     */
    public void setLap(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.laptimes.lap</code>.
     */
    public Integer getLap() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.laptimes.position</code>.
     */
    public void setPosition(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.laptimes.position</code>.
     */
    public Integer getPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.laptimes.time</code>.
     */
    public void setTime(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.laptimes.time</code>.
     */
    public String getTime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.laptimes.milliseconds</code>.
     */
    public void setMilliseconds(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.laptimes.milliseconds</code>.
     */
    public Integer getMilliseconds() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Laptimes.LAPTIMES.RACEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Laptimes.LAPTIMES.DRIVERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Laptimes.LAPTIMES.LAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Laptimes.LAPTIMES.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Laptimes.LAPTIMES.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Laptimes.LAPTIMES.MILLISECONDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRaceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDriverid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getMilliseconds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRaceid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDriverid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getMilliseconds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord value1(Integer value) {
        setRaceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord value2(Integer value) {
        setDriverid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord value3(Integer value) {
        setLap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord value4(Integer value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord value5(String value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord value6(Integer value) {
        setMilliseconds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaptimesRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LaptimesRecord
     */
    public LaptimesRecord() {
        super(Laptimes.LAPTIMES);
    }

    /**
     * Create a detached, initialised LaptimesRecord
     */
    public LaptimesRecord(Integer raceid, Integer driverid, Integer lap, Integer position, String time, Integer milliseconds) {
        super(Laptimes.LAPTIMES);

        set(0, raceid);
        set(1, driverid);
        set(2, lap);
        set(3, position);
        set(4, time);
        set(5, milliseconds);
    }
}