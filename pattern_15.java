public class pattern_15 {
    public static void main(String[] args) {
        for(int i = 1; i<=5;i++){
            for (int j=1; j<=5+1-i ;j++){
                System.out.print(" ");
            }

                System.out.print("*");

            if(i > 1){ // 1, 3, 5, 7
                for(int j=1; j<= (2*i) - 3;j++){
                    System.out.print(" ");
                }
            }
            if(i>1){

                    System.out.print("*");

            }
            System.out.println();
        }
        // down
        for(int i = 1; i<=4;i++){// 2, 3, 4, 5
            for (int j = 1; j<=i+1;j++){
                System.out.print(" ");
            }

                System.out.print("*");

            if (i < 4){ // 5, 3, 1
                for (int j =1; j<=6+1-(2 * i); j++){
                    System.out.print(" ");
                }
            }
            if (i <4) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
