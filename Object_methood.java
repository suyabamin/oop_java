public class Test {
    public static void main(String[] args) {
        //constructor create to innitilize value,
        Teacher teacher1=new Teacher("suyab amin sunny","math",18);
        //methood call
        teacher1.display();

        Teacher teacher2=new Teacher("joy","english",25 );
        //methood 2 call
        teacher2.display();
          //constructor call without parameter;
        Teacher teacher3=new Teacher();
    }
}


public class Teacher {
    String name,sub;
    int age;
//creating constructor, its name is simmiller with class
    Teacher(String n,String s,int a){
        name=n;
        sub=s;
        age=a;
    }
    Teacher(){
        System.out.println("no value ");
    }
    //methood create
    void display(){
        System.out.println("Name="+name);
        System.out.println("Subject="+sub);
        System.out.println("Age="+age);
        System.out.println("\n");
    }

}
