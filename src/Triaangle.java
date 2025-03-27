public class Triaangle extends Shape {
    private int sideA ;
    private int sideB ;
    private int sideC ;
    public Triaangle(Point location ,int sideA,int sideB ,int sideC){
        super(location);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;

    }

    @Override
    public int area() {
        return sideA*sideB/sideC;
    }

    @Override
    public int perimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
