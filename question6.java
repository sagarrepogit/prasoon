import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        int table;
        Scanner sc=new Scanner(System.in);
        System.out.println("multipliaction table of - ");
        table=sc.nextInt();
        for(int i=1;i<=10;i++){
            int a=table*i;
            System.out.printf("%d*%d=%d\n",table,i,a);
        }sc.close();
    }
    
}
