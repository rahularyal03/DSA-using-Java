import java.util.*;
public class ScissorPaperRock {
    static int ranNum;
    
    public static void main(String[] args){
    int choice = 1;
    Scanner input = new Scanner(System.in);
    
    while(choice>0 && choice < 4){
    System.out.println("Enter your choice: 0) Scissor \t 1) Paper \t 2)Rock");
    int hey = input.nextInt();

    Random rand = new Random();

    ranNum = rand.nextInt(3);
    System.out.println("Computer = "+ranNum);

    if(ranNum == hey){
        System.out.println("Match Draw");
        
    }

    else if(ranNum == 1 && hey == 0 ){
        System.out.println("Computer Won the game.");
    }

    else if(ranNum == 0 && hey == 1 ){
        System.out.println("You Won the game.");
    }

    else if(ranNum == 1 && hey == 0 ){
        System.out.println("You Won the game.");
    }


    else if(ranNum == 1 && hey == 2 ){
        System.out.println("Computer Won the game.");
    }

    else if(ranNum == 2 && hey == 1 ){
        System.out.println("You Won the game.");
    }



    else if(ranNum == 2 && hey == 0 ){
        System.out.println("Computer Won the game.");
    }
    
    else if(ranNum == 0 && hey == 2 ){
        System.out.println("Computer Won the game.");
    }
    else{
        System.out.println("Wrong Input!!!!");

    }
    choice++;
    
    }
  
    System.out.println("********Thank you for playing********");
   

    


    }
}
