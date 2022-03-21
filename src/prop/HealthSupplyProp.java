package prop;

import edu.hitsz.aircraft.HeroAircraft;

public class HealthSupplyProp extends AbstractProp{
    public HealthSupplyProp(int locationX, int locationY, int speedX, int speedY) {
        this.locationX=locationX;
        this.locationY=locationY;
        this.speedX=speedX;
        this.speedY=speedY;
    }
    @Override
    public void PropActive(HeroAircraft heroAircraft){
        heroAircraft.increaseHp(30);
    }
}
