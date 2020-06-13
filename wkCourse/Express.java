import java.util.Scanner;
public class Express{
  public static void main(String[] args) {
    // initialize
    Scanner inp = new Scanner(System.in);
    System.out.print("请付车票款：");
    int amount = inp.nextInt();
    int tickePrice = 10;
    if(amount >= tickePrice){
      // print ticket
      System.out.println("*************");
      System.out.println("**Java Express***");
      System.out.println("**2nd class seat***");
      System.out.println("**Ticke Price: ¥10 ***");
      System.out.println("*************");
      // count bill
      System.out.println("return: " + (amount - 10));
    }else{
      System.out.print("请补足车票款(" + (tickePrice - amount)+ "元):");
      int add = inp.nextInt();
      if(add + amount == tickePrice){
        // print ticket
        System.out.println("*************");
        System.out.println("**Java Express***");
        System.out.println("**2nd class seat***");
        System.out.println("**Ticke Price: ¥10 ***");
        System.out.println("*************");
      }
    }
    System.out.println("交易结束～");
    inp.close();
    
  }
}