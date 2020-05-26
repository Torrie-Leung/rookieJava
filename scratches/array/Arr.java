import java.util.Scanner;
public class Arr{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int x;
    double sum = 0;
    int cnt = 0;
    x = inp.nextInt();
    while(x != -1){
      sum += x;
      cnt++;
      x = inp.nextInt();
    }
    if(cnt > 0){
      System.out.println(sum/cnt);
    }
    inp.close();
  }
}