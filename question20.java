public class question20{
    public static void main (String[]args){
        for(int i=1;i<=3;i++){
            for (int space=1;space<5-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }}
