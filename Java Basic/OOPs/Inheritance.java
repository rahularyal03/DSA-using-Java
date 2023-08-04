package OOPs;

class Shape{
    String color;

}

class Triangle extends Shape{
    public void show(){
        System.out.println(this.color);
    }
}

class Square extends Triangle{
    public void show(int l, int h){
        System.out.println(2* l * h);
    }
}
public class Inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.show();

    }
}

// There are 5 different types of Java inheritance i) single  ii) Multilevel  inheritance iii) hierarchial inheritance   iv)Hybrid  v) multiple inheritance

