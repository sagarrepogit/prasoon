import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        int first,second;
        Scanner sc=new Scanner(System.in);
        System.out.println("multipliaction table from - ");
        first=sc.nextInt();
        System.out.println("to");
        Scanner sce= new Scanner(System.in);
        second=sce.nextInt();
        for(int j=first;j<=second;j++)
        {
        for(int i=1;i<=10;i++){
            int a=j*i;
            System.out.printf("%d*%d=%d\n",j,i,a);
        }sc.close();
        sce.close();
    }}
    
}
