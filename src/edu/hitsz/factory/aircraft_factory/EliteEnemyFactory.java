package edu.hitsz.factory.aircraft_factory;


import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.EliteEnemy;

import edu.hitsz.application.Main;
import edu.hitsz.application.ImageManager;
public class EliteEnemyFactory implements AircraftFactory{
    @Override
    public AbstractAircraft createEnemyAircraft() {
        return new EliteEnemy(
                (int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth())) * 1,
                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.2) * 1,
                0,
                10,
                90);
    }
}
