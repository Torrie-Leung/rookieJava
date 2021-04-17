import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int [] array = { 10,20,40,30,70 };
//        面向过程
        System.out.print("[" );
        for(int i = 0; i < array.length; i++){
            if( i == array.length-1){
                System.out.print(array[i]+"]");
            }else {
                System.out.print(array[i]+",");
            }

        }
        System.out.println("================ " );

//        oop
        System.out.println(Arrays.toString(array));
    }
}
