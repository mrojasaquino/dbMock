/*
 * This file is generated by jOOQ.
 */
package races.f1db.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Laptimes implements Serializable {

    private static final long serialVersionUID = -621013071;

    private Integer raceid;
    private Integer driverid;
    private Integer lap;
    private Integer position;
    private String  time;
    private Integer milliseconds;

    public Laptimes() {}

    public Laptimes(Laptimes value) {
        this.raceid = value.raceid;
        this.driverid = value.driverid;
        this.lap = value.lap;
        this.position = value.position;
        this.time = value.time;
        this.milliseconds = value.milliseconds;
    }

    public Laptimes(
        Integer raceid,
        Integer driverid,
        Integer lap,
        Integer position,
        String  time,
        Integer milliseconds
    ) {
        this.raceid = raceid;
        this.driverid = driverid;
        this.lap = lap;
        this.position = position;
        this.time = time;
        this.milliseconds = milliseconds;
    }

    public Integer getRaceid() {
        return this.raceid;
    }

    public void setRaceid(Integer raceid) {
        this.raceid = raceid;
    }

    public Integer getDriverid() {
        return this.driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public Integer getLap() {
        return this.lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMilliseconds() {
        return this.milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Laptimes (");

        sb.append(raceid);
        sb.append(", ").append(driverid);
        sb.append(", ").append(lap);
        sb.append(", ").append(position);
        sb.append(", ").append(time);
        sb.append(", ").append(milliseconds);

        sb.append(")");
        return sb.toString();
    }
}
