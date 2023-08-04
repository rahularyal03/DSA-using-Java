package Problem;
import java.util.*;
import bank.Bank;
public class AccessModifier {
    public static void main(String[] args){
        Bank ac1 = new Bank();
        ac1.name = "Rahul";
        ac1.accountNo = 23455;
        ac1.show();
    }
}
