import java.util.*;
public class peterson_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int num = sc.nextInt();
        int temp = num;
        int f ;
        int sum = 0;
        while (num>0){
            f=1;
           int r=num%10;
            for(int i = 1;i<=r;i++){
                f = f * i;
            }
            sum = sum+f;
            num = num/10;
        }
        if(sum==temp){
            System.out.println("Peterson number");
        }
        else{
            System.out.println("Not peterson number");
        }

    }
}