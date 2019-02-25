package Basic;

public class SumOfPrimes {

    public static void main(String[] args) {

        // The program sums up the first ten prime numbers

        int sum = 1;
        int ctr = 0;
        int n = 0;

        while (ctr < 10) {
            n++;
            if (n % 2 != 0) {
                if (isPrime(n)) {
                sum += n;
                ctr++;
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime (int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }return true;
    }
}
