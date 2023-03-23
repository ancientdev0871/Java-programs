import java.util.*;
public class icse_cl10_2023 {
    public static void main(String[] args) {
        // Question - 5+
//        for(int i =1; i<=5;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int t = n;
        int os = 0,es=0;
        int r;
        while(t>0){
            r = t%10;
            if(r%2==0){
                es += r;
            }
            else{
                os += r;
            }
            t = t/10;
        }

        if(os == es){
            System.out.println("Lead no");
        }
    }
}
