package Revision.AnalysisOfAlgorithims;

public class PartD {

    public static boolean checkPrimeButBetter(int number) {

        int i = 2;
        while (i <= (int) Math.sqrt(number)) {
            if (number % i == 0)
                return false;

            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        int primes = 0;
        for (int i = 2; i < 1001; i++) {

            if (checkPrimeButBetter(i)) {
                primes++;
            }

        }

        System.out.println(primes);

    }
}
