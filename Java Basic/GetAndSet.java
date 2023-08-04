public class GetAndSet{

    private String myName ;
    
// Getter
    public String getName(){
        return myName;
    }
// Setter
    public void setName(String newName){
        this.myName = newName;
    }

    public static void main(String[] args){
        GetAndSet ref = new GetAndSet();
        ref.setName("Rahul");
        System.out.print(ref.myName);

    }
}