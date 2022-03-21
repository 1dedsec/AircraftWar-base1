package prop;

import edu.hitsz.aircraft.HeroAircraft;

public class BombSupplyProp extends AbstractProp{
    public BombSupplyProp(int locationX, int locationY, int speedX, int speedY) {
        this.locationX=locationX;
        this.locationY=locationY;
        this.speedX=speedX;
        this.speedY=speedY;
    }
    @Override
    public void PropActive(HeroAircraft heroAircraft){
        System.out.println("BombSupplyActive");
    }

}
