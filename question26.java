import java.util.Scanner;
import java.lang.Math;
public class question26 {
    public static void main(String[]args){
        double p;
        double sum=1;
        double total=0;
        double n;
        System.out.println("enter the number of terms");
        Scanner sc= new Scanner (System.in);
        n=sc.nextDouble();
        System.out.print(sum+" ");
        for (int i =1;i<=n;i++){
            p=Math.pow(10,i);
            sum+=p;
            System.out.print(sum+" ");
            total=total +sum;
        }System.out.println();
        System.out.println("the sum is");
        System.out.println(total);
    }
}
