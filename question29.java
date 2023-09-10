import java.util.Scanner;
public class question29 {
    public static void main(String[] args) {
        int nu;
        System.out.println("enter the number for armstrong cheack");
        Scanner sc= new Scanner(System.in);
        nu=sc.nextInt();
        int t1=nu;
        int len=0;
        while(t1!=0){
            t1/=10; 
            len+=1;
            System.out.println(t1);
        }
        int t2=nu;
        int rem;
        int arm=0;
        
        while(t2!=0){
            rem=t2%10;
            int mul=1;
            for(int i=1;i<=len;i++){
                mul=mul*rem;}
            
            arm=arm+mul;
            t2/=10;
        }
        if(arm==nu){
            System.out.println("the number is armstron");

        }
        else{
            System.out.println("number is not a armstrong");
        }
    }
}
