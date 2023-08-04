package OOPs;

class Student{
    String name;
    int age;
    String department;

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.department = s2.department;

    }
   

    public void fprint(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Student(){

    }
}
public class CopyConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 22;
        s1.department = "Computer";
        Student s2 = new Student(s1);
        s1.fprint();
        s2.fprint();
    }
}
