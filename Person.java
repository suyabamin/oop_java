package encapsolation;

public class Person {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

import encapsolation.Person;

 class Test {
        public static void main(String[] args) {
            Person ob1=new Person();
            ob1.setName("sunny");
            System.out.println(ob1.getName());

            ob1.setAge(18);
            System.out.println(ob1.getAge());

        }
    }



    
