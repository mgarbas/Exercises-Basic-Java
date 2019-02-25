package Basic;

public class DivisibleBy3And5 {

    // The program list the numbers from 1 to 100 divisible by 3, 5 and both

    public static void main(String[] args) {

        System.out.println("Divided by 3");
        for (int i = 1; i<101;i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nDivided by 5");
        for (int i = 1; i<101;i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nDivided by 3 and 5");
        for (int i = 1; i<101;i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.print(i + ", ");
            }
        }

    }

}
