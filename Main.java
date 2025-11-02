public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        Teacher teacher2=new Teacher("suyab amin","male",01745);
        teacher2.display();
        Teacher teacher3=new Teacher("Sunny",01745762524,0112330236);
       teacher3.display();
    }

}

 class Teacher{
    String name,gender;
    int phone,id;

    Teacher(){
        System.out.println("No information in this constructor");
    }
    Teacher(String n,String g,int p){
        name=n;
        gender=g;
        phone=p;
    }
    Teacher(String n,int p,int i){
        name=n;
        phone=p;
        id=i;


    }
    void display(){
        System.out.println("name="+name);
        System.out.println("Gende="+gender);
        System.out.println("Phone="+phone);
        System.out.println("Id="+id);
    }

}
