import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        int input;
        int factorial=1;
        System.out.println("input number");
        Scanner g=new Scanner(System.in);
        input=g.nextInt();
        for(int i=1;i<=input;i++){
            factorial*=i;
        }System.out.println("your factorial is "+factorial);
        g.close();
    }
}
