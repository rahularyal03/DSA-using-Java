package OOPs;

class Account {
    private String password;

    // getter and setter ( to access private properties or function)
    public String getter(){
        return this.password;
    }

    public void setter(String pass){
        this.password = pass;

    }
}
public class GetterAndSetter {
    public static void main(String[] args){
        Account a1 = new Account();
        a1.setter("IamPassword");
        String x = a1.getter();
        System.out.println(x);

    }

}
