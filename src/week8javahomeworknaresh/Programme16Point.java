package week8javahomeworknaresh;

public class Programme16Point {
    int x;
    int y;

    Programme16Point() {
    }

    Programme16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public double distance() {
        return distance(0, 0);

    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Programme16Point secondPoint) {
        return distance((int) secondPoint.x, (int) secondPoint.y);
    }

    public static void main(String[] args) {
        Programme16Point first = new Programme16Point(6, 5);
        Programme16Point second = new Programme16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme16Point point = new Programme16Point();
        System.out.println("distance()= " + point.distance());
    }
}
