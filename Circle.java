package com.figr;
public class Circle extends Figure{
    public double getRadius() {
        return super.getSide();
    }
    public Circle(double radius) {
        this.setRadius(radius);
    }
    public void setRadius(double radius) {
        this.side = radius;
        this.perimeter = radius*2*Math.PI;
        this.area = Math.pow(side,2)*Math.PI;
    }

    @Override
    public void get_info() {
        System.out.println("радиус: "+getRadius());
        super.get_info();
    }

}
