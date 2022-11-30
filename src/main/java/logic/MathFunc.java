package logic;

import spaceObject.SpaceObject;

public class MathFunc {

    public static double distance(SpaceObject a, SpaceObject b){
        return Math.sqrt( Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY()-b.getVy(),2) );
    }

    public static double cos(SpaceObject a, SpaceObject b){
        return (b.getX() - a.getX())/distance(a,b);
    }

    public static double sin(SpaceObject a, SpaceObject b){
        return (b.getY() - a.getY())/distance(a,b);
    }

}
