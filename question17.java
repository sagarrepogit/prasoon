import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        int n;
        System.out.print("number of rowns in pyramid");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int space=n;space>i;space--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
