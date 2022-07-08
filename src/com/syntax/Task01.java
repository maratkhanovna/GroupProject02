package com.syntax;

public class Task01 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */
    public static void main(String[] args) {
    Shape[] shapes = {new Circle(6), new Square(12)};
        for(Shape shape:shapes){
          shape.calculateArea();
          shape.calculatePerimeter();
        }
    }
    }
    interface Shape{
    void calculateArea();
    void calculatePerimeter();
    }
    class Circle implements Shape{
    double radius;
    double perimeter;
        public Circle(double radius) {
            this.radius = radius;
        }


        @Override
        public void calculateArea() {
            double area = radius * radius * Math.PI;
            System.out.println("The area of the circle [radius = " + radius + "]: " + area);
        }

        @Override
        public void calculatePerimeter() {
            double perimeter = 2 * Math.PI * radius;
            System.out.println("The perimeter of the circle [radius = " + radius + "]: " + perimeter);
        }
    }
    class Square implements Shape{
    double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public void calculateArea() {
            double area = side*side;
            System.out.println("Area of Square is: "+area);
        }

        @Override
        public void calculatePerimeter() {
            double perimeter = 4*side;
            System.out.println("Perimeter of Square is: "+perimeter);
        }
    }
