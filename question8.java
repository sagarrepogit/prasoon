import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        int n,terms;
        int sum=0;
        System.out.println("number of odd terms:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            terms=(i*2)-1;
        System.out.println(terms); 
        sum+=terms;
           }sc.close();
           System.out.println(sum);
    }
    
}
