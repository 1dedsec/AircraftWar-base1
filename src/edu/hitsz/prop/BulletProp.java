package edu.hitsz.prop;

public class BulletProp extends AbstractProp{
    public BulletProp(int locationX, int locationY, int speedX, int speedY) {
        this.locationX=locationX;
        this.locationY=locationY;
        this.speedX=speedX;
        this.speedY=speedY;
    }
    @Override
    public void PropActive(){
        System.out.println("FireSupplyActive");
    }

}
