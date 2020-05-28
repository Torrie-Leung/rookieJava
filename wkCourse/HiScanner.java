import java.util.Scanner;

public class HiScanner{
  public static void main(String[] args) {
    System.out.println("hey~");
    Scanner inp = new Scanner(System.in);
    // final int amount = 100;
    int price,amount;
    System.out.print("请输入票面：");
    amount = inp.nextInt();
    System.out.print("请输入金额：");
    price = inp.nextInt();
    
    System.out.println(amount+"-"+ price + "=" + (amount - price));
    inp.close();
  }
}