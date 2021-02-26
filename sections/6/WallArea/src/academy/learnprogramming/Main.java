package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        System.out.println("************************");
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        System.out.println("************************");
        Wall wallTwo = new Wall();
        System.out.println("area= " + wallTwo.getArea());

        System.out.println("************************");
        wallTwo.setWidth(6);
        System.out.println("width= " + wallTwo.getWidth());
        System.out.println("height= " + wallTwo.getHeight());
        System.out.println("area= " + wallTwo.getArea());
    }
}
