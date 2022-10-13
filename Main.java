package com.figr;
public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(1);
        sq1.get_info();
        Rectangle rc = new Rectangle(1, 4);
        rc.get_info();
        Circle cr = new Circle(5);
        cr.get_info();
        sq1.setSide(7);
        sq1.get_info();
        rc.setSide(7, 8);
        rc.get_info();
        cr.setRadius(7);
        cr.get_info();

    }
}
