import java.util.Random;

public class HoT{
  public static void main(String[] args){
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
  }
}
