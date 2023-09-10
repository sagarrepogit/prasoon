import java.util.Scanner;
public class question28 {
    public static void main(String[] args) {
        
        int number;
        int start;
        int end;
        
        Scanner bc=new Scanner(System.in);
        System.out.println("enter the starting number");
        start=bc.nextInt();
        Scanner fc=new Scanner (System.in);
        System.out.println("enter the end number");
        end=fc.nextInt();
        System.out.println("the perfect number is ");
        for(number=start;number<=end;number++){
            int sum=0;
        for (int i=1;i<number;i++)
        {
            if (number%i==0)
            {
                sum+=i;
                
            }
        }
        if (sum==number)
        {
            System.out.print(sum+" ");

        }
        

    }}
}
