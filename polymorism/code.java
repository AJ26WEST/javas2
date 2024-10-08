/*
 * Name: ABHISHEK JOJI
 * Date: 30-09-2024
 * Purpose: Write a Java program to implement polymorphism
 */

// Abstract class Shape
abstract class Shape {
    // Abstract method numberOfSides
    public abstract void numberOfSides();
}

// Class Rectangle extending Shape
class Rectangle extends Shape {
    // Implementation of abstract method
    @Override
    public void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

// Class Triangle extending Shape
class Triangle extends Shape {
    // Implementation of abstract method
    @Override
    public void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

// Class Hexagon extending Shape
class Hexagon extends Shape {
    // Implementation of abstract method
    @Override
    public void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Create instances of each shape
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        // Call the numberOfSides method for each shape
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
