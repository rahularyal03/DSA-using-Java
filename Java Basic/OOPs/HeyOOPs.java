class Pen{
    String color;
    String type;
        
    public void penInfo(){
        System.out.print(this.color + " ");
        System.out.println(this.type);
}
}

public class HeyOOPs {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Ballpen";
    
    
        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Gelpen";

        pen1.penInfo();
        pen2.penInfo();

    }
}
