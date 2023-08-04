package bank;
    // accessing this by file AccessModifier  saved Problem folder.
public class Bank {
    public String name;
    public int accountNo;
    protected String email;
    private String password;
    int areaCode;

    public void show(){
        System.out.println("My name is " + this.name + " and account No. is " + accountNo);
    }

    public static void main(String[] args){
        System.out.println("hello");
        
    }
}
