import java.util.*;
import java.lang.Math;
public class question18 {
    public static void main(String[] args) {
    int terms;
    System.out.println("enter the number of terms");
    Scanner sc = new Scanner(System.in);
    terms=sc.nextInt();
        
        System.out.println("enter the value of x");
        Scanner bc=new Scanner(System.in);
       float x=bc.nextFloat();
        int sin=1;
        double power;
        int fact=1;
        double sum=1;
        for (int i=2;i<=terms;i+=2){
            power=Math.pow(x,i);
            fact=fact*i*(i-1);
            sin=sin*(-1);
            sum=sum+sin*(power/fact);

        }System.out.println(sum);
        sc.close();
        bc.close();

    }}
