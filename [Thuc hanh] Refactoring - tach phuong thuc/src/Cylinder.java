public class Cylinder {
    private int radius;
    private int height;

    private Cylinder(){};

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    public double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
