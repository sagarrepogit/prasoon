import java.util.Scanner;
public class question30 {
    public static void main(String[] args) {
        int start;
        int end;
        Scanner sc=new Scanner (System.in);
        Scanner gc= new Scanner(System.in);
        System.out.println("enter the starting number ");
        start=sc.nextInt();
        System.out.println("enter the end number");
        end=gc.nextInt();
         System.out.print("Armstrong number in the given range are ");
        for(int nu=start;nu<=end;nu++){
        int t1=nu;
        int len=0;
        while(t1!=0){
            t1/=10; 
            len+=1;
            
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
            System.out.print(nu+" ");

        }
        }
    }
}
