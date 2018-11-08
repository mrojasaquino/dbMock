/*
 * This file is generated by jOOQ.
 */
package races.f1db.model;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

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
import races.f1db.model.tables.records.CircuitsRecord;
import races.f1db.model.tables.records.ConstructorresultsRecord;
import races.f1db.model.tables.records.ConstructorsRecord;
import races.f1db.model.tables.records.ConstructorstandingsRecord;
import races.f1db.model.tables.records.DriversRecord;
import races.f1db.model.tables.records.DriverstandingsRecord;
import races.f1db.model.tables.records.LaptimesRecord;
import races.f1db.model.tables.records.PitstopsRecord;
import races.f1db.model.tables.records.QualifyingRecord;
import races.f1db.model.tables.records.RacesRecord;
import races.f1db.model.tables.records.ResultsRecord;
import races.f1db.model.tables.records.SeasonsRecord;
import races.f1db.model.tables.records.StatusRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CircuitsRecord, Integer> IDENTITY_CIRCUITS = Identities0.IDENTITY_CIRCUITS;
    public static final Identity<ConstructorresultsRecord, Integer> IDENTITY_CONSTRUCTORRESULTS = Identities0.IDENTITY_CONSTRUCTORRESULTS;
    public static final Identity<ConstructorsRecord, Integer> IDENTITY_CONSTRUCTORS = Identities0.IDENTITY_CONSTRUCTORS;
    public static final Identity<ConstructorstandingsRecord, Integer> IDENTITY_CONSTRUCTORSTANDINGS = Identities0.IDENTITY_CONSTRUCTORSTANDINGS;
    public static final Identity<DriversRecord, Integer> IDENTITY_DRIVERS = Identities0.IDENTITY_DRIVERS;
    public static final Identity<DriverstandingsRecord, Integer> IDENTITY_DRIVERSTANDINGS = Identities0.IDENTITY_DRIVERSTANDINGS;
    public static final Identity<QualifyingRecord, Integer> IDENTITY_QUALIFYING = Identities0.IDENTITY_QUALIFYING;
    public static final Identity<RacesRecord, Integer> IDENTITY_RACES = Identities0.IDENTITY_RACES;
    public static final Identity<ResultsRecord, Integer> IDENTITY_RESULTS = Identities0.IDENTITY_RESULTS;
    public static final Identity<StatusRecord, Integer> IDENTITY_STATUS = Identities0.IDENTITY_STATUS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CircuitsRecord> CIRCUITS_PKEY = UniqueKeys0.CIRCUITS_PKEY;
    public static final UniqueKey<CircuitsRecord> CIRCUITS_URL_KEY = UniqueKeys0.CIRCUITS_URL_KEY;
    public static final UniqueKey<ConstructorresultsRecord> CONSTRUCTORRESULTS_PKEY = UniqueKeys0.CONSTRUCTORRESULTS_PKEY;
    public static final UniqueKey<ConstructorsRecord> CONSTRUCTORS_PKEY = UniqueKeys0.CONSTRUCTORS_PKEY;
    public static final UniqueKey<ConstructorsRecord> CONSTRUCTORS_NAME_KEY = UniqueKeys0.CONSTRUCTORS_NAME_KEY;
    public static final UniqueKey<ConstructorstandingsRecord> CONSTRUCTORSTANDINGS_PKEY = UniqueKeys0.CONSTRUCTORSTANDINGS_PKEY;
    public static final UniqueKey<DriversRecord> DRIVERS_PKEY = UniqueKeys0.DRIVERS_PKEY;
    public static final UniqueKey<DriversRecord> DRIVERS_URL_KEY = UniqueKeys0.DRIVERS_URL_KEY;
    public static final UniqueKey<DriverstandingsRecord> DRIVERSTANDINGS_PKEY = UniqueKeys0.DRIVERSTANDINGS_PKEY;
    public static final UniqueKey<LaptimesRecord> LAPTIMES_PKEY = UniqueKeys0.LAPTIMES_PKEY;
    public static final UniqueKey<PitstopsRecord> PITSTOPS_PKEY = UniqueKeys0.PITSTOPS_PKEY;
    public static final UniqueKey<QualifyingRecord> QUALIFYING_PKEY = UniqueKeys0.QUALIFYING_PKEY;
    public static final UniqueKey<RacesRecord> RACES_PKEY = UniqueKeys0.RACES_PKEY;
    public static final UniqueKey<RacesRecord> RACES_URL_KEY = UniqueKeys0.RACES_URL_KEY;
    public static final UniqueKey<ResultsRecord> RESULTS_PKEY = UniqueKeys0.RESULTS_PKEY;
    public static final UniqueKey<SeasonsRecord> SEASONS_PKEY = UniqueKeys0.SEASONS_PKEY;
    public static final UniqueKey<SeasonsRecord> SEASONS_URL_KEY = UniqueKeys0.SEASONS_URL_KEY;
    public static final UniqueKey<StatusRecord> STATUS_PKEY = UniqueKeys0.STATUS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CircuitsRecord, Integer> IDENTITY_CIRCUITS = Internal.createIdentity(Circuits.CIRCUITS, Circuits.CIRCUITS.CIRCUITID);
        public static Identity<ConstructorresultsRecord, Integer> IDENTITY_CONSTRUCTORRESULTS = Internal.createIdentity(Constructorresults.CONSTRUCTORRESULTS, Constructorresults.CONSTRUCTORRESULTS.CONSTRUCTORRESULTSID);
        public static Identity<ConstructorsRecord, Integer> IDENTITY_CONSTRUCTORS = Internal.createIdentity(Constructors.CONSTRUCTORS, Constructors.CONSTRUCTORS.CONSTRUCTORID);
        public static Identity<ConstructorstandingsRecord, Integer> IDENTITY_CONSTRUCTORSTANDINGS = Internal.createIdentity(Constructorstandings.CONSTRUCTORSTANDINGS, Constructorstandings.CONSTRUCTORSTANDINGS.CONSTRUCTORSTANDINGSID);
        public static Identity<DriversRecord, Integer> IDENTITY_DRIVERS = Internal.createIdentity(Drivers.DRIVERS, Drivers.DRIVERS.DRIVERID);
        public static Identity<DriverstandingsRecord, Integer> IDENTITY_DRIVERSTANDINGS = Internal.createIdentity(Driverstandings.DRIVERSTANDINGS, Driverstandings.DRIVERSTANDINGS.DRIVERSTANDINGSID);
        public static Identity<QualifyingRecord, Integer> IDENTITY_QUALIFYING = Internal.createIdentity(Qualifying.QUALIFYING, Qualifying.QUALIFYING.QUALIFYID);
        public static Identity<RacesRecord, Integer> IDENTITY_RACES = Internal.createIdentity(Races.RACES, Races.RACES.RACEID);
        public static Identity<ResultsRecord, Integer> IDENTITY_RESULTS = Internal.createIdentity(Results.RESULTS, Results.RESULTS.RESULTID);
        public static Identity<StatusRecord, Integer> IDENTITY_STATUS = Internal.createIdentity(Status.STATUS, Status.STATUS.STATUSID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CircuitsRecord> CIRCUITS_PKEY = Internal.createUniqueKey(Circuits.CIRCUITS, "circuits_pkey", Circuits.CIRCUITS.CIRCUITID);
        public static final UniqueKey<CircuitsRecord> CIRCUITS_URL_KEY = Internal.createUniqueKey(Circuits.CIRCUITS, "circuits_url_key", Circuits.CIRCUITS.URL);
        public static final UniqueKey<ConstructorresultsRecord> CONSTRUCTORRESULTS_PKEY = Internal.createUniqueKey(Constructorresults.CONSTRUCTORRESULTS, "constructorresults_pkey", Constructorresults.CONSTRUCTORRESULTS.CONSTRUCTORRESULTSID);
        public static final UniqueKey<ConstructorsRecord> CONSTRUCTORS_PKEY = Internal.createUniqueKey(Constructors.CONSTRUCTORS, "constructors_pkey", Constructors.CONSTRUCTORS.CONSTRUCTORID);
        public static final UniqueKey<ConstructorsRecord> CONSTRUCTORS_NAME_KEY = Internal.createUniqueKey(Constructors.CONSTRUCTORS, "constructors_name_key", Constructors.CONSTRUCTORS.NAME);
        public static final UniqueKey<ConstructorstandingsRecord> CONSTRUCTORSTANDINGS_PKEY = Internal.createUniqueKey(Constructorstandings.CONSTRUCTORSTANDINGS, "constructorstandings_pkey", Constructorstandings.CONSTRUCTORSTANDINGS.CONSTRUCTORSTANDINGSID);
        public static final UniqueKey<DriversRecord> DRIVERS_PKEY = Internal.createUniqueKey(Drivers.DRIVERS, "drivers_pkey", Drivers.DRIVERS.DRIVERID);
        public static final UniqueKey<DriversRecord> DRIVERS_URL_KEY = Internal.createUniqueKey(Drivers.DRIVERS, "drivers_url_key", Drivers.DRIVERS.URL);
        public static final UniqueKey<DriverstandingsRecord> DRIVERSTANDINGS_PKEY = Internal.createUniqueKey(Driverstandings.DRIVERSTANDINGS, "driverstandings_pkey", Driverstandings.DRIVERSTANDINGS.DRIVERSTANDINGSID);
        public static final UniqueKey<LaptimesRecord> LAPTIMES_PKEY = Internal.createUniqueKey(Laptimes.LAPTIMES, "laptimes_pkey", Laptimes.LAPTIMES.RACEID, Laptimes.LAPTIMES.DRIVERID, Laptimes.LAPTIMES.LAP);
        public static final UniqueKey<PitstopsRecord> PITSTOPS_PKEY = Internal.createUniqueKey(Pitstops.PITSTOPS, "pitstops_pkey", Pitstops.PITSTOPS.RACEID, Pitstops.PITSTOPS.DRIVERID, Pitstops.PITSTOPS.STOP);
        public static final UniqueKey<QualifyingRecord> QUALIFYING_PKEY = Internal.createUniqueKey(Qualifying.QUALIFYING, "qualifying_pkey", Qualifying.QUALIFYING.QUALIFYID);
        public static final UniqueKey<RacesRecord> RACES_PKEY = Internal.createUniqueKey(Races.RACES, "races_pkey", Races.RACES.RACEID);
        public static final UniqueKey<RacesRecord> RACES_URL_KEY = Internal.createUniqueKey(Races.RACES, "races_url_key", Races.RACES.URL);
        public static final UniqueKey<ResultsRecord> RESULTS_PKEY = Internal.createUniqueKey(Results.RESULTS, "results_pkey", Results.RESULTS.RESULTID);
        public static final UniqueKey<SeasonsRecord> SEASONS_PKEY = Internal.createUniqueKey(Seasons.SEASONS, "seasons_pkey", Seasons.SEASONS.YEAR);
        public static final UniqueKey<SeasonsRecord> SEASONS_URL_KEY = Internal.createUniqueKey(Seasons.SEASONS, "seasons_url_key", Seasons.SEASONS.URL);
        public static final UniqueKey<StatusRecord> STATUS_PKEY = Internal.createUniqueKey(Status.STATUS, "status_pkey", Status.STATUS.STATUSID);
    }
}