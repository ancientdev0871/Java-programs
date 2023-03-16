import java.util.*;
public class ugly_number{
    public static void main(String [] args){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        boolean flag = true;
        while(n != 1){
            if(n%5==0){
                n = n/5;
            }
            else if(n%3==0){
                n = n/3;
            }
            else if(n%2==0){
                n = n/2;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Ugly number");
        }
        else{
            System.out.println("Not ugly number");
        }
    }
}