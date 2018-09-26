import java.util.Scanner;

public class Thriceturn{
    public static void main(String[] args) {
        int turnnum = 1;
        int randomint = (int)(Math.random()*6 + 1);
        int randomint2 = (int)(Math.random()*6 + 1);
        int randomint3 = (int)(Math.random()*6 + 1);
        int count = 0;
        double score = 0;
        double value;
        double die1 = randomint;
        double die2 = randomint2;
        double die3 = randomint3;
        int round1val;

        
        
      
    
        Scanner scan = new Scanner(System.in);



        while(turnnum == 1){
            if (die1 == die2 && die2 == die3){
                score = score + die1;
                System.out.println("Triplet! Your score is: " + score + " Round: " + turnnum);
                count++;
                round1val = die1;
                turnnum = turnnum + 1;
                
            



            }else{
                randomint = (int)(Math.random()*6 + 1);
                randomint2 = (int)(Math.random()*6 + 1);
                randomint3 = (int)(Math.random()*6 + 1);
                die1 = randomint;
                die2 = randomint2;
                die3 = randomint3;
                System.out.println(count + " roll again");
                count++;

            }
        }

        while (turnnum == 2){
            while(round1val >= 0){
                randomint = (int)(Math.random()*6 + 1);
                randomint2 = (int)(Math.random()*6 + 1);
                randomint3 = (int)(Math.random()*6 + 1);
                die1 = randomint;
                die2 = randomint2;
                die3 = randomint3;


            }
        
        }

        
        


        




        




    }
}