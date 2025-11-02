public class Abstruction {
    
}
public class Main {
    public static void main(String[] args) {
     Shape se;
     se=new Ractrangle(5,2);
     se.area();

        se=new Sircle(2);
        se.area();
    }
}

public abstract class Shape {
    double d1,d2;
    public Shape(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
    public abstract void area();
}

class Ractrangle extends Shape{
   public Ractrangle(double d1,double d2){
        super(d1,d2);
    }
    @Override
    public void area(){
       double area=d1*d2;
        System.out.println("Ractrangle area="+area);
    }
}

class Sircle extends Shape{
   public Sircle(double r){
        super(r,r);
    }
    @Override
    public void area(){
       double area=Math.PI*d1*d2;
        System.out.println("Area of Sircle="+area);
    }
}
