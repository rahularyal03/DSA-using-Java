package Problem;

public class Permutations {
    public static void printPerm(String name, String result){
        if(name.length()==0){
            System.out.println(result);
            return;
        }
        for(int i = 0; i<name.length(); i++){
            // When i = 0, a will be removed and other characters will remain there, At i = 1, b will be removed and in i = 3, c will be removed. 


            char newChar = name.charAt(i);

            // characters before index i is added to characters after i removing the index i 
            String newName = name.substring(0, i) + name.substring(i+1);

            // The resulted character will undergo recursion till base case.
            printPerm(newName, result + newChar);

        }
    }
    public static void main(String[] args){
        String name = "abcd";
        String result = "";
        printPerm(name, result);
    }
}
