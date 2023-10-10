package Practika4_1;

public class Square extends Rectangle{
    public Square(){
        super.setLength(0);
        super.setWidth(0);
    }
    public Square(double size){
        super.setWidth(size);
        super.setLength(size);
    }
    public Square(double size,String color, boolean filled){
        super.setFilled(filled);
        super.setColor(color);
        super.setWidth(size);
        super.setLength(size);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "Square{Side: "+getSide()
                +", color: "+super.getColor()
                +", is filled: "+super.isFilled()+"}";
    }
}
