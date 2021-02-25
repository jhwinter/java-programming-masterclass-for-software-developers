package academy.learnprogramming;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public double distance() {
        return distance(0, 0);
    }
}
