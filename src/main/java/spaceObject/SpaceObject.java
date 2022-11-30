package spaceObject;

public class SpaceObject {
//    name,breed,x, y, r, vx, vy, m, color = "black", relativity

    private String name;
    private String breed;
    private double x;
    private double y;
    private double r;
    private double vx;
    private double vy;
    private double m;
    private String color;
    private SpaceObject relativity;


    public SpaceObject(String name, String breed, double x, double y, double r, double vx,
                       double vy, double m, String color, SpaceObject relativity) {
        this.name = name;
        this.breed = breed;
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;
        this.m = m;
        this.color = color;
        this.relativity = relativity;
    }
}
