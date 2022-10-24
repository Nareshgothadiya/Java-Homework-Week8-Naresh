package week8javahomeworknaresh;
//15. Display left angle triangle of * using nested for loops

public class Programme15 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) ;
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
