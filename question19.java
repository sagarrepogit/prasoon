import java.util.Scanner;
public class question19 {
    public static void main(String[]args){
        double sum=1;
        System.out.println("enter the number of terms");
        Scanner sc=new Scanner (System.in);
        double terms =sc.nextDouble();
        for (double i=2;i<=terms;i++){
            sum=sum+(1/i);
        }System.out.println(sum);

    }
}
