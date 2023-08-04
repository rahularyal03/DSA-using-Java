package OOPs;
class Fruit{
    String name;
    int price;

    public void fruitinfo(int price){
        System.out.println(price);
    }

    public void fruitinfo(String name){
        System.out.println(name);
    }

    public void fruitinfo(String name, int price){
        System.out.println(name + price);
    }
}
public class FunctionOverloading{
    public static void main(String[] args){
        Fruit ft = new Fruit();
        ft.name = "Mango";
        ft.price = 4000;
        ft.fruitinfo(ft.price);
        ft.fruitinfo(ft.name);
        ft.fruitinfo(ft.name, ft.price);
    }
}