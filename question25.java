import java.util.*;
import java.lang.Math;

public class question25 {
    public static void main(String args[]){
        System.out.println("enter the numbre of terms");
        double n;
        double p;
        double sum=0;
        Scanner sc=new Scanner (System.in);
        n=sc.nextDouble();
        for(int i=1;i<=n;i++){
            p=Math.pow(i,2);
            sum+=p;
            System.out.print(p+" ");

        }System.out.println();
        System.out.println("your sum is ");
        System.out.print(" "+sum);
    }
}
