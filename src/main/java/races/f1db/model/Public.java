/*
 * This file is generated by jOOQ.
 */
package races.f1db.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import races.f1db.model.tables.Circuits;
import races.f1db.model.tables.Constructorresults;
import races.f1db.model.tables.Constructors;
import races.f1db.model.tables.Constructorstandings;
import races.f1db.model.tables.Drivers;
import races.f1db.model.tables.Driverstandings;
import races.f1db.model.tables.Laptimes;
import races.f1db.model.tables.Pitstops;
import races.f1db.model.tables.Qualifying;
import races.f1db.model.tables.Races;
import races.f1db.model.tables.Results;
import races.f1db.model.tables.Seasons;
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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1198898840;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.circuits</code>.
     */
    public final Circuits CIRCUITS = races.f1db.model.tables.Circuits.CIRCUITS;

    /**
     * The table <code>public.constructorresults</code>.
     */
    public final Constructorresults CONSTRUCTORRESULTS = races.f1db.model.tables.Constructorresults.CONSTRUCTORRESULTS;

    /**
     * The table <code>public.constructors</code>.
     */
    public final Constructors CONSTRUCTORS = races.f1db.model.tables.Constructors.CONSTRUCTORS;

    /**
     * The table <code>public.constructorstandings</code>.
     */
    public final Constructorstandings CONSTRUCTORSTANDINGS = races.f1db.model.tables.Constructorstandings.CONSTRUCTORSTANDINGS;

    /**
     * The table <code>public.drivers</code>.
     */
    public final Drivers DRIVERS = races.f1db.model.tables.Drivers.DRIVERS;

    /**
     * The table <code>public.driverstandings</code>.
     */
    public final Driverstandings DRIVERSTANDINGS = races.f1db.model.tables.Driverstandings.DRIVERSTANDINGS;

    /**
     * The table <code>public.laptimes</code>.
     */
    public final Laptimes LAPTIMES = races.f1db.model.tables.Laptimes.LAPTIMES;

    /**
     * The table <code>public.pitstops</code>.
     */
    public final Pitstops PITSTOPS = races.f1db.model.tables.Pitstops.PITSTOPS;

    /**
     * The table <code>public.qualifying</code>.
     */
    public final Qualifying QUALIFYING = races.f1db.model.tables.Qualifying.QUALIFYING;

    /**
     * The table <code>public.races</code>.
     */
    public final Races RACES = races.f1db.model.tables.Races.RACES;

    /**
     * The table <code>public.results</code>.
     */
    public final Results RESULTS = races.f1db.model.tables.Results.RESULTS;

    /**
     * The table <code>public.seasons</code>.
     */
    public final Seasons SEASONS = races.f1db.model.tables.Seasons.SEASONS;

    /**
     * The table <code>public.status</code>.
     */
    public final Status STATUS = races.f1db.model.tables.Status.STATUS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CIRCUITS_CIRCUITID_SEQ,
            Sequences.CONSTRUCTORRESULTS_CONSTRUCTORRESULTSID_SEQ,
            Sequences.CONSTRUCTORS_CONSTRUCTORID_SEQ,
            Sequences.CONSTRUCTORSTANDINGS_CONSTRUCTORSTANDINGSID_SEQ,
            Sequences.DRIVERS_DRIVERID_SEQ,
            Sequences.DRIVERSTANDINGS_DRIVERSTANDINGSID_SEQ,
            Sequences.QUALIFYING_QUALIFYID_SEQ,
            Sequences.RACES_RACEID_SEQ,
            Sequences.RESULTS_RESULTID_SEQ,
            Sequences.STATUS_STATUSID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Circuits.CIRCUITS,
            Constructorresults.CONSTRUCTORRESULTS,
            Constructors.CONSTRUCTORS,
            Constructorstandings.CONSTRUCTORSTANDINGS,
            Drivers.DRIVERS,
            Driverstandings.DRIVERSTANDINGS,
            Laptimes.LAPTIMES,
            Pitstops.PITSTOPS,
            Qualifying.QUALIFYING,
            Races.RACES,
            Results.RESULTS,
            Seasons.SEASONS,
            Status.STATUS);
    }
}
