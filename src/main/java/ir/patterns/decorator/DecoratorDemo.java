package ir.patterns.decorator;

import java.awt.*;

public class DecoratorDemo {
    public static void main(String[] args) {

        //imagine we have some needed now before drawing circle
        //and we dont want to change the circle class

        System.out.println("before adding functionalities to the object: ");
        Shape shape = new Rectangle();
        shape.draw();

        Shape shape1 = new Circle();
        shape1.draw();

        System.out.println("************************");
        System.out.println("after adding functionalities to the object: ");

        Shape circle2 = new FillColorDecorator(
                new BorderColorDecorator(
                        new BorderStyleDecorator(
                                new BorderThicknessDecorator(
                                        new Circle(),2
                                ),LineStyle.SOLID
                        ),Color.RED
                ), Color.BLUE
        );
        circle2.draw();

        System.out.println("************************");
        System.out.println("for rectangle object :");

        Shape rectangle = new FillColorDecorator(
                new BorderStyleDecorator(new Rectangle(),LineStyle.DASH),
                Color.GREEN
        );
        rectangle.draw();
    }
}
