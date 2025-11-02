class ArrayExample {
    public static void main(String[] args) {
        int[] a = new int[5]; //decleration
        ArrayExample i = new ArrayExample(); //object create
        System.out.println("array a:");
        i.printArray(a);

        int[] b = {2,3,4,5,6}; //array initialization while decleration: way1
        System.out.println("array b: ");
        i.printArray(b);
        System.out.println("Value of b inside main after calling printArray: ");
        for(int j=0;j<b.length;j++){
            System.out.println("b["+j+"] = "+b[j]);
        }

        int[] c = new int[]{10,11,12,13,14}; //array initialization while decleration: way2
        System.out.println("array c:");
        i.printArray(c);

    }

    void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            a[i]*=2;
            System.out.println(a[i]);
        }
    }
}

ublic class Array {
    public static void main(String[] args) {
        int []a=new int[5];
        Array ob1=new Array();
        System.out.println("c");
        ob1.display(a);
        int []b={2,4,6,8};
        System.out.println("b");
        ob1.display(b);
        System.out.println("next");
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
        int []c=new int []{10,20,30};
        ob1.display(c);
    }
    void display(int[]a){
        for (int i = 0; i <a.length ; i++) {
            a[i]=a[i]*2;
            System.out.println(" "+a[i]);
        }
    }
}


public class TowdArray {
    public static void main(String[] args) {
        int[][] a = new int[3][];

        a[0] = new int[]{1, 2};
        a[1] = new int[]{3, 4, 5};
        a[2] = new int[]{4, 5, 6, 7};

        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}


public class FinalVariavble {
   final String name ="Sunny";
 final int inn;
static final int rank;
 FinalVariavble(int a){
     inn=a;
 }
 static {
     rank=5;
 }

    void display(){

        System.out.println(name);
        System.out.println(inn);
        System.out.println(rank);
    }
}
class test{
    public static void main(String[] args) {
        FinalVariavble ob=new FinalVariavble(105);

        ob.display();
    }
}


public class Practice {
    public static void main(String[] args) {
     Student ob=new Student();
     ob.name="sa";
        System.out.println(ob.name);
        ob.call(ob);
        System.out.println(ob.name);
    }
}
class Student {
    String name;
   void call(Student i){
    i.name="jonny";
   }


}
