/*how to find the number of a computer?
this code will help you to solve the number problum.
system get random numbr.
Ex:
 computer input = 23;
 userinput = 45;
 then it print "your number is too large";
 if userinput = 12;
 then it print "your number is too low";
 if userinput 23;
 then it print "wow conratulation you guess right number";
*/ 
import java.util.Scanner; //imort class for input
public class game {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int mynum = (int)(Math.random()*100); //to genrate random nmber
            int usernum ;

do{
    
     System.out.println("Guess the number :");
            usernum = sc.nextInt();
            if(usernum == mynum){
                System.out.println("WoW conratulation Correct num!!!");
                break;
            }else if(usernum > mynum){
                System.out.println("Your number is too large");
            }else {
                System.out.println("Your number is too low");
            }
}while(usernum>=0);      
System.out.println("My number is :"+" "+mynum);  
}
}