public class question13 {
    public static void main(String[]args){
        int k=1;
        for (int i=1;i<=4;i++){
            for(int space=5;space>i;space--){
                System.out.print(" ");}
                for(int j=1;j<=i;j++){
                    
                    System.out.print(k++ +" ");
                }
            System.out.println();
        }
    }
}
