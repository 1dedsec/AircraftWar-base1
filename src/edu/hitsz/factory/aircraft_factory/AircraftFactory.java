package edu.hitsz.factory.aircraft_factory;

import edu.hitsz.aircraft.AbstractAircraft;

public interface AircraftFactory {
    AbstractAircraft createEnemyAircraft();
}