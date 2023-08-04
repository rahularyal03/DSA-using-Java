public class StringBuilders{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Hey!");
        System.out.println(str);

        str.insert(4, " Rahul");
        System.out.println(str);
        str.setCharAt(3,'@');
        System.out.println(str);

        str.delete(4, str.length());
        System.out.println(str);


        StringBuilder str2 = new StringBuilder("Rahul");
        StringBuilder str3 = new StringBuilder("Aryal");

        System.out.println(str2.append(str3));


    }

        
}