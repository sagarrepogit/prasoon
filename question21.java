import java.util.*;
import java.lang.Math;
public class question21 {
    public static void main(String[]args){
        System.out.println("input the number of terms");
        Scanner sc=new Scanner(System.in);
        int n;
        double sum=0;
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            double value=Math.pow(10,i);
            sum+= value-1;
        }System.out.println(sum);
    }
}
