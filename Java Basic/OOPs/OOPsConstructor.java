package OOPs;
class Fruits{
    String fname;
    int fprice;

    Fruits(String name, int price){
        this.fname = name;
        this.fprice = price;
    }
    public void fprint(){
        System.out.println(this.fname);
        System.out.println(this.fprice);
    
    }

    Fruits(){

    }
}

public class OOPsConstructor {
    public static void main(String ags[]){
        Fruits frt1 = new Fruits("Apple", 800);
        frt1.fprint();

        Fruits frt2 = new Fruits();
        frt2.fname = "Banana";
        frt2.fprice = 700;
        frt2.fprint();
    }
}