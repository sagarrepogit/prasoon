import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        int number, a;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers of terms for their cube");
        number= sc.nextInt();
        for (int i=1;i<=number;i++){
           a=i*i*i;
           System.out.println(a);

        }sc.close();

    }
}

