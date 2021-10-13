package Assignment2;

public class Shape {
    String name,color;
    int area,perimeter;

    public Shape(){}
    public Shape(String name, String color) {
        this.name=name;
        this.color=color;
    }
    public Shape(String name, String color, int perimeter, int area) {
        this.name=name;
        this.color=color;
        this.perimeter=perimeter;
        this.area=area;
    }
    public String printShape() {
        return "The " + this.name + " has a " + this.color + " color";
    }
    public int getArea() {
        return this.area;
    }
    public int getPerimeter() {
        return this.perimeter;
    }
}

class Rectangle extends Shape {
    int width, height;
    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }
    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }
    public Rectangle(String name, String color, int width, int height) {
        this.name=name;
        this.color=color;
        this.width=width;
        this.height=height;
    }
    public int getArea() {
        return this.width * this.height;
    }
    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

class Square extends Shape {
    int side;
    public Square(int side){
        this.side=side;
    }
    public Square(String name, String color, int side){
        this.side=side;
        this.name=name;
        this.color=color;
    }
    public int getArea() {
        return this.side * this.side;
    }
    public int getPerimeter() {
        return 4 * this.side;
    }
}