/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import races.f1db.model.tables.Status;


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
public class StatusRecord extends UpdatableRecordImpl<StatusRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 55402752;

    /**
     * Setter for <code>public.status.statusid</code>.
     */
    public void setStatusid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.status.statusid</code>.
     */
    public Integer getStatusid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.status.status</code>.
     */
    public void setStatus(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.status.status</code>.
     */
    public String getStatus() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Status.STATUS.STATUSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Status.STATUS.STATUS_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStatusid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStatusid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatusRecord value1(Integer value) {
        setStatusid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatusRecord value2(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatusRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatusRecord
     */
    public StatusRecord() {
        super(Status.STATUS);
    }

    /**
     * Create a detached, initialised StatusRecord
     */
    public StatusRecord(Integer statusid, String status) {
        super(Status.STATUS);

        set(0, statusid);
        set(1, status);
    }
}
