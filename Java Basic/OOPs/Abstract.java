package OOPs;

abstract class Animals{
    abstract void moves();
    public void eats(){
        System.out.println("They eat food.");
    };

    Animals(){
        System.out.println("Hello, I am the constructor of Animals.");
    }
}

class Cat extends Animals{
    public void moves(){
        System.out.println("Cat has 4 legs.");
    }
}

class Human extends Animals{
    public void moves(){
        System.out.println("Human have 2 legs.");
    }

    Human(){
        System.out.println("And i am the constructor of Human.");
    }
}
public class Abstract {
    public static void main(String[] args){
      Human h = new Human();
      h.moves();
      h.eats();
    }
}
