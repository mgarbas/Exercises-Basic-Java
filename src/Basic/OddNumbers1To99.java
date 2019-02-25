package Basic;

public class OddNumbers1To99 {

    public static void main(String[] args) {

        // The program list all odd numbers to 100

        int[] table = new int[100];

        for (int i=1;i<table.length;i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
