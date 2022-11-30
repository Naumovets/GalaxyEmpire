package spaceObject;

public class SpaceObject {
    private int id;
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


    public SpaceObject(int id,String name, String breed, double x, double y, double r, double vx,
                       double vy, double m, String color, SpaceObject relativity) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.x = x + relativity.getX();
        this.y = y + relativity.getY();
        this.r = r;
        this.vx = vx + relativity.getVx();
        this.vy = vy + relativity.getVy();
        this.m = m;
        this.color = color;
        this.relativity = relativity;
    }

    public SpaceObject(int id,String name, String breed, double x, double y, double r,
                       double vx, double vy, double m, String color) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;
        this.m = m;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public double getM() {
        return m;
    }

    public String getColor() {
        return color;
    }

    public SpaceObject getRelativity() {
        return relativity;
    }

    public int getId(){
        return id;
    }
}
