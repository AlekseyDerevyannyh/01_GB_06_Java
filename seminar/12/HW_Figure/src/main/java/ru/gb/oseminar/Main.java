package ru.gb.oseminar;

import ru.gb.oseminar.data.Circle;
import ru.gb.oseminar.data.Rectangle;
import ru.gb.oseminar.data.Square;
import ru.gb.oseminar.model.FiguresRepository;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(20.0);
        System.out.println(square.getSide1() + " " + square.getSide2() + " " + square.area() + " " + square.perimeter());

        Rectangle rectangle = new Rectangle(20.0, 30.0);
        System.out.println(rectangle.getSide1() + " " + rectangle.getSide2() + " " + rectangle.area() + " " + rectangle.perimeter());
        Circle circle = new Circle(10.0);
        System.out.println(circle.getRadius() + " " + circle.area() + " " + circle.length());

        FiguresRepository figuresRepository = new FiguresRepository();
        figuresRepository.add(new Rectangle(20.0, 30.0));
        figuresRepository.add(new Square(20.0));
        figuresRepository.add(new Circle(10.0));


        System.out.println(figuresRepository.allAreas());
        System.out.println(figuresRepository.allLength());
        System.out.println(figuresRepository.allPerimeters());
    }
}