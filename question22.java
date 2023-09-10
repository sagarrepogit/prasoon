import java.util.Scanner;
public class question22 {
    public static void main(String[] args) {
        System.out.println("etner the number of terms");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=i;j>=1;j--){
                int value=j%2;
                System.out.print(value);
            }System.out.println();
        }
    }
}
