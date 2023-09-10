import java.util.Scanner;

public class question3 {
    public static void main (String[]args){
        int n;
        Scanner rf= new Scanner (System.in);
        n=rf.nextInt();
        int j=0;
        for (int i=0;i<=n;i++){
            System.out.println(i);
            j+=i;
        }rf.close();
        System.out.println(j);
    }
}
