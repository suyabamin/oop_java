public class Box {
    double height,width,depth,vol;
    Box(double height,double width,double depth){
       this.height=height;
      this.width=width;
        this.depth=depth;
         vol=height*width*depth;
    }
    void desplayvol(){
        System.out.println("voliun"+vol);
    }
}

class test{
    public static void main(String[] args) {
        Box b1=new Box(10,10,10);
        Box b2=new Box(20,30,10);

        b1.desplayvol();
        b2.desplayvol();
    }
}

call by refarance///

public class CallByrefrenc {
    String name;
    void change(CallByreferrnce i){
        i.name="jonny";
    }
}
class test{
    public static void main(String[] args) {
        CallByreferrnce ob=new CallByreferrnce();
        ob.name="sunny";
        System.out.println(ob.name);
        ob.change(ob);
        System.out.println(ob.name);
    }
}

public class Main {
    public static void main(String[] args) {
        CallByreferrnce ob1=new CallByreferrnce();
     ob1.name="sunny";
        System.out.println("Before calling"+ob1.name);
        ob1.change(ob1);
        System.out.println("after call by refarence"+ob1.name);
    }

}

class CallByreferrnce{
    String name;
    void change(CallByreferrnce i){
       i.name="jonny";
    }

}
