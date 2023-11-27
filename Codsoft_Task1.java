import java.util.*;
public class Task1{
    public static void guessing_game(){
        int guess_limit=5;
        int guess_count=0;

        //generating a random number between 1 and 100
        int number=(int)(Math.random()*100+1);
        

        while(guess_count<guess_limit){
            System.out.println("GUESS: ");
            guess_count++;
            Scanner sc=new Scanner(System.in);
            int GUESS=sc.nextInt();

            
            if(GUESS==number){
                System.out.println("CORRECT,YOU WON!!");
                break;
            }
            else if(GUESS>number){
                System.out.println("go lower...");
            }
            else if(GUESS<number){
                System.out.println("go higher!");
            }
        if(guess_count==guess_limit){
            System.out.println("failed sorry");
        }
        int attempts_remaining=guess_limit-guess_count;
        System.out.println("Number of attempts remaining: "+attempts_remaining);
        
    }
    
}
public static void main(String args[]){
    guessing_game();
    Scanner sc=new Scanner(System.in);
    System.out.println("Press 1 to play again");
    int playagain=sc.nextInt();
    if(playagain==1){
        guessing_game();
    }
    else{
        System.out.println("Thanks for playing");
    }
}
}