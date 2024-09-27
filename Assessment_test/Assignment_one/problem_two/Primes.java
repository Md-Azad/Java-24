package Assessment_test.Assignment_one.problem_two;

public class Primes {
    public static void main(String[] args) {
        int nValues = 50;

        flag: for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue flag;
                }
            }
            System.out.println(i);

        }
    }
}
