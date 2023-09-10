import java.util.Scanner;
import java.lang.Math;
public class question23 {
    public static void main (String[]args){
        double p;
        int sin=-1;
        int terms;
        double sum=0;
        int x;
        System.out.println("entere the number of terms");
        Scanner sc=new Scanner (System.in);
        terms=sc.nextInt();
        System.out.println("enter the value of x");
        Scanner bc=new Scanner(System.in);
        x=bc.nextInt();
        terms*=2;
        for(int i=1;i<terms;i=i+2){
            p=Math.pow(x,i);
            sin=sin*-1;
            sum+=p*sin;
            System.out.println(sum);
            System.out.println(p);
        }System.out.println(sum);
    }
}
