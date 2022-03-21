package prop;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.basic.FlyingObject;
import edu.hitsz.bullet.AbstractBullet;

import java.util.Random;
public abstract class AbstractProp extends FlyingObject {
    public abstract void  PropActive(HeroAircraft heroAircraft);

    public static AbstractProp Initialize(int locationX, int locationY, int speedX, int speedY) {
        Random random = new Random();
        int seed = random.nextInt(3);
        switch (seed) {
            case 0: return new BombSupplyProp(locationX, locationY, speedX, speedY);
            case 1: return new FireSupplyProp(locationX, locationY, speedX, speedY);
            case 2: return new HealthSupplyProp(locationX, locationY, speedX, speedY);
            default: return null;
        }
    }

}
