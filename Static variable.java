public class Student {
    String name;
    int id;

   static String universityname="Untetd International university";

   Student(String n,int i){
       name=n;
       id=i;
   }
   void display(){
       System.out.println("Name="+name);
       System.out.println("ID="+id);
       System.out.println("University name="+universityname);
   }
}
public class Static_variable {
  static int count=0;
   Static_variable(){
       count++;
   }
   void display(){
       System.out.println(count);
   }
}

class test{
    public static void main(String[] args) {
       Static_variable ob1=new Static_variable();
        ob1.display();
        Static_variable ob2=new Static_variable();
        ob2.display();
        Static_variable ob3=new Static_variable();
        ob3.display();

    }
}

public class Main {
    public static void main(String[] args) {
        Student ob1=new Student("suyab amin",101);
        Student ob2=new Student("jonny",103);

        ob1.display();
        ob2.display();
    }
}
