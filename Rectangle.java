package com.figr;
public class Rectangle extends Figure{
    protected double side2;

    public Rectangle(double side, double side2) {
        this.setSide(side, side2);
    }

    public void setSide(double side, double side2) {
        this.side = side;
        this.side2 = side2;
        this.perimeter = side*2+side2*2;
        this.area = side*side2;
    }

    @Override
    public void get_info() {
        if(this.side == this.side2)
            System.out.println("сторона: "+getSide());
        else
            System.out.println("стороны: "+getSide()+" ; "+this.side2);
        super.get_info();
    }

}
