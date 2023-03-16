import java.util.*;
public class long_inputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //creating object of Scanner class.

        System.out.println("Enter 10 numbers.");

        int s;
        int two_digit = 0;
        int three_digit = 0;
        for(int I=1;I<=10;I++)

        {

             System.out.print("Enter: ");

            s=sc.nextInt();
            if(s>9&&s<100){
                two_digit = two_digit+s;
            }
            else if (s>99 && s<1000){
                three_digit = three_digit + s;
            }


        }
        System.out.println(two_digit);
        System.out.println(three_digit);
    }
}
