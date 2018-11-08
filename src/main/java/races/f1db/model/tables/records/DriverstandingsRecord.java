/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import races.f1db.model.tables.Driverstandings;


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
public class DriverstandingsRecord extends UpdatableRecordImpl<DriverstandingsRecord> implements Record7<Integer, Integer, Integer, Double, Integer, String, Integer> {

    private static final long serialVersionUID = -1746198517;

    /**
     * Setter for <code>public.driverstandings.driverstandingsid</code>.
     */
    public void setDriverstandingsid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.driverstandings.driverstandingsid</code>.
     */
    public Integer getDriverstandingsid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.driverstandings.raceid</code>.
     */
    public void setRaceid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.driverstandings.raceid</code>.
     */
    public Integer getRaceid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.driverstandings.driverid</code>.
     */
    public void setDriverid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.driverstandings.driverid</code>.
     */
    public Integer getDriverid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.driverstandings.points</code>.
     */
    public void setPoints(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.driverstandings.points</code>.
     */
    public Double getPoints() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.driverstandings.position</code>.
     */
    public void setPosition(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.driverstandings.position</code>.
     */
    public Integer getPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.driverstandings.positiontext</code>.
     */
    public void setPositiontext(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.driverstandings.positiontext</code>.
     */
    public String getPositiontext() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.driverstandings.wins</code>.
     */
    public void setWins(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.driverstandings.wins</code>.
     */
    public Integer getWins() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Double, Integer, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Double, Integer, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Driverstandings.DRIVERSTANDINGS.DRIVERSTANDINGSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Driverstandings.DRIVERSTANDINGS.RACEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Driverstandings.DRIVERSTANDINGS.DRIVERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Driverstandings.DRIVERSTANDINGS.POINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Driverstandings.DRIVERSTANDINGS.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Driverstandings.DRIVERSTANDINGS.POSITIONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Driverstandings.DRIVERSTANDINGS.WINS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDriverstandingsid();
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
        return getDriverid();
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
    public Integer component5() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPositiontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getWins();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDriverstandingsid();
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
        return getDriverid();
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
    public Integer value5() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPositiontext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getWins();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value1(Integer value) {
        setDriverstandingsid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value2(Integer value) {
        setRaceid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value3(Integer value) {
        setDriverid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value4(Double value) {
        setPoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value5(Integer value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value6(String value) {
        setPositiontext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord value7(Integer value) {
        setWins(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverstandingsRecord values(Integer value1, Integer value2, Integer value3, Double value4, Integer value5, String value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriverstandingsRecord
     */
    public DriverstandingsRecord() {
        super(Driverstandings.DRIVERSTANDINGS);
    }

    /**
     * Create a detached, initialised DriverstandingsRecord
     */
    public DriverstandingsRecord(Integer driverstandingsid, Integer raceid, Integer driverid, Double points, Integer position, String positiontext, Integer wins) {
        super(Driverstandings.DRIVERSTANDINGS);

        set(0, driverstandingsid);
        set(1, raceid);
        set(2, driverid);
        set(3, points);
        set(4, position);
        set(5, positiontext);
        set(6, wins);
    }
}
