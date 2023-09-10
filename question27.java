import java.util.Scanner;
public class question27 {
    public static void main(String[] args) {
        int sum=0;
        int n;
        System.out.println("enter the number");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                sum+=i;
                System.out.print(i+" ");
            }
        }System.out.println(); 
        if (sum==n)
        {
            System.out.println("number is a perfect number");

        }
        else
        {
            System.out.println("the number is not a perfect number");
        }

    }
}
