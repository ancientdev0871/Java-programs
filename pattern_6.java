public class pattern_6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j =1; j<=5+1-i; j++) {
                System.out.print(" ");
            }
                for(int l =1; l<=i; l++) {
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
