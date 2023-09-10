import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
      int term;
      int sum=0;
      System.out.print("input number of terms");
      Scanner sc= new Scanner(System.in);
        term=sc.nextInt();
        
            for(int i=1;i<=term;i++){
                System.out.printf("%d ",i*2);
                sum+=2*i;
            }
            
            System.out.println("\n"+sum);
        
        
    }
}
