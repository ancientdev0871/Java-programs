public class pattern_8 {
    public static void main(String[] args) {
        for(int i = 1; i<=5;i++){
            for (int j = 1; j<=5+1-i;j++){
                System.out.print(" ");
            }
           for(int star = 1; star<=2 * i - 1;star++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
