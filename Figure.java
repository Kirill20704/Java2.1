package com.figr;
public abstract class Figure {
    protected double side;
    protected double perimeter;
    protected double area;


    public double getSide() {
        return this.side;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void get_info() {
        System.out.println("периметр: "+getPerimeter());
        System.out.println("площадь: "+getArea());
    }
}
