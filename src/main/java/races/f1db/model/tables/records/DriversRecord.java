/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import races.f1db.model.tables.Drivers;


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
public class DriversRecord extends UpdatableRecordImpl<DriversRecord> implements Record9<Integer, String, Integer, String, String, String, Date, String, String> {

    private static final long serialVersionUID = 681675475;

    /**
     * Setter for <code>public.drivers.driverid</code>.
     */
    public void setDriverid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.drivers.driverid</code>.
     */
    public Integer getDriverid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.drivers.driverref</code>.
     */
    public void setDriverref(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.drivers.driverref</code>.
     */
    public String getDriverref() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.drivers.number</code>.
     */
    public void setNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.drivers.number</code>.
     */
    public Integer getNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.drivers.code</code>.
     */
    public void setCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.drivers.code</code>.
     */
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.drivers.forename</code>.
     */
    public void setForename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.drivers.forename</code>.
     */
    public String getForename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.drivers.surname</code>.
     */
    public void setSurname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.drivers.surname</code>.
     */
    public String getSurname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.drivers.dob</code>.
     */
    public void setDob(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.drivers.dob</code>.
     */
    public Date getDob() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>public.drivers.nationality</code>.
     */
    public void setNationality(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.drivers.nationality</code>.
     */
    public String getNationality() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.drivers.url</code>.
     */
    public void setUrl(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.drivers.url</code>.
     */
    public String getUrl() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, String, String, String, Date, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, String, String, String, Date, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Drivers.DRIVERS.DRIVERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Drivers.DRIVERS.DRIVERREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Drivers.DRIVERS.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Drivers.DRIVERS.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Drivers.DRIVERS.FORENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Drivers.DRIVERS.SURNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return Drivers.DRIVERS.DOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Drivers.DRIVERS.NATIONALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Drivers.DRIVERS.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDriverid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDriverref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getForename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component7() {
        return getDob();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNationality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDriverid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDriverref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getForename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getDob();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNationality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value1(Integer value) {
        setDriverid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value2(String value) {
        setDriverref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value3(Integer value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value4(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value5(String value) {
        setForename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value6(String value) {
        setSurname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value7(Date value) {
        setDob(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value8(String value) {
        setNationality(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord value9(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriversRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, Date value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriversRecord
     */
    public DriversRecord() {
        super(Drivers.DRIVERS);
    }

    /**
     * Create a detached, initialised DriversRecord
     */
    public DriversRecord(Integer driverid, String driverref, Integer number, String code, String forename, String surname, Date dob, String nationality, String url) {
        super(Drivers.DRIVERS);

        set(0, driverid);
        set(1, driverref);
        set(2, number);
        set(3, code);
        set(4, forename);
        set(5, surname);
        set(6, dob);
        set(7, nationality);
        set(8, url);
    }
}
