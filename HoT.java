import java.util.Random;
import java.util.Scanner;

public class HoT{
  public static void main(String[] args){
    System.out.println("Who are you?");
    Scanner sc= new Scanner(System.in);
    String name=sc.next();
    System.out.println("Hello,"+name);
    
    System.out.println("Tossing a coin");
    Random r= new Random();
    int countH=0,countT=0;
    for(int i=1;i<=3;i++){
      boolean bool= r.nextBoolean();
      System.out.print("Round"+i+":");
      if(bool)
      {
        System.out.println("Heads");
        countH++;
      }
      else
      {
        System.out.println("Tails");
        countT++;
      }
    }
    System.out.println("Heads: "+countH+", Tails: "+countT);
    
    String WoL;
    if(countH>countT)
    {
      WoL="win";
    }
    else
    {
      WoL="lose";
    }
    System.out.println(name+ " " + WoL);
    
  }
}
