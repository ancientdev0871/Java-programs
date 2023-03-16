import java.util.*;
public class amicable_pair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int n = sc.nextInt();
        System.out.println("Enter second no: ");
        int m = sc.nextInt();
        int sn = 0;
        int sm = 0;
        for(int i = 1;i <n;i++){
            if (n%i==0){
                sn = sn + i;
            }
        }
        for(int j = 1;j<m;j++){
            if (m%j==0){
                sm = sm + j;
            }
        }
       if(sn==m&&sm==n){
           System.out.println("Amicable pair");
       }
       else{
           System.out.println("Not Amicable pair");
       }
    }
}
