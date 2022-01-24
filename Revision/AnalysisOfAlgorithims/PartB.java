package Revision.AnalysisOfAlgorithims;

// Help Recieved
// I googled what a mod does

//Part: C
//Our program in part B runs in O(n) because we check all the numbers less than the given number to check.

public class PartB {

    public static boolean primeCheck(int check) {

        for (int i = 2; i < check; i++) {
            if (check % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int primes = 0;
        for (int i = 2; i < 1001; i++) {

            if (primeCheck(i)) {
                primes++;
            }

        }

        System.out.println(primes);
    }
}
