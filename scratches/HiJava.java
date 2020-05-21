import java.util.Scanner;
public class HiJava{
  public static void main(String[] args){
    // int oxVal = 032;
    Scanner sc = new Scanner(System.in);
    
    // System.out.println(oxVal);
    System.out.println("Hi java~");
    System.out.println("Hey DUMMY.");
    // 搞个简陋BMI↓
    System.out.print("请输入身高(m):");
    double h = sc.nextDouble();
    System.out.print("请输入体重(kg):");
    double w = sc.nextDouble();
    int bmi = (int)(w/(h*h));
    System.out.println("当前BMI:"+bmi);
    if(bmi < 18.5){
      System.out.println("太瘦啦~危险");
    }else if(bmi >18.5 && bmi <= 24){
      System.out.println("正常体重~安全");
    }else if(bmi > 24 && bmi <= 27){
      System.out.println("体重有点重~注意");
    }else if(bmi > 27 && bmi <= 30){
      System.out.println("轻度肥宅警告！");
    }else if(bmi > 30 && bmi <= 35){
      System.out.println("中度肥宅警告！");
    }else if(bmi > 35){
      System.out.println("黑人抬棺~");
    }

    sc.close();
  }
}