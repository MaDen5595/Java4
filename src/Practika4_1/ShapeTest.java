package Practika4_1;

public class ShapeTest {
    public static void main(String[] args) {
        //Circle
        Circle cir = new Circle(5);
        System.out.println(cir.getColor());
        cir.setColor("Blue");
        System.out.println(cir.getColor());
        System.out.println(cir.getArea());
        System.out.println(cir.getPerimeter());
        //Rectangle
        Rectangle rec = new Rectangle(4,5,"Blue",true);
        rec.setWidth(3);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.toString());
        //Square
        Square sq = new Square(3);
        sq.setSide(4);
        System.out.println(sq.getArea());
        sq.setLength(6);
        System.out.println(sq.getArea());
        sq.setWidth(10);
        System.out.println(sq.getArea());
        System.out.println(sq.toString());
        sq.setColor("Blue");
        System.out.println(sq.toString());

    }
}
