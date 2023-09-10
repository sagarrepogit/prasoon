import java.util.Scanner;
public class question4 {
    public static void main(String[]args){
        int a;
        float b=0;
        float avg;
         Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter the 10 numbers");
            
            a=sc.nextInt();
            b+=a;
        } 
        System.out.println(b);
        avg=b/10;
        System.out.println(avg);
    sc.close();
    }
}
