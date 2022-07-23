public class printNtoOne {
    public static void main(String args[]) {
        System.out.println(checkPalindrome("AAAAAA"));
    }

    public static boolean checkPalindrome(String s) {
        return checkPalindrome(s, "", 1);
    }

    public static boolean checkPalindrome(String s, String revS, int count) {
        if (count > s.length()) {
            if (s.equals(revS)) {
                return true;
            }
            return false;
        }
        revS = revS + (s.charAt(s.length() - count));
        return checkPalindrome(s, revS, count + 1);
    }

    public static int fibonacciRecursive(int n) {
        if (n < 2 && n != 0) {
            return 1;
        }
        if (n < 2 && n == 0) {
            return 0;
        }
        if (n < 2) {
            return 0;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 1;
        int idxOne = 0, idxTwo = 1, sum = 0;
        while (count != n) {
            sum = idxOne + idxTwo;
            idxOne = idxTwo;
            idxTwo = sum;
            count++;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        return fibonacci(n, 0, 1, 1);
    }

    /*
     * Tail Recursive Fibonacci
     */
    public static int fibonacci(int n, int k, int j, int count) {
        if (n == count) {
            return j;
        }
        int sum = k + j;
        k = j;
        j = sum;
        return fibonacci(n, k, j, count + 1);
    }

    public static int nonTailFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * nonTailFactorial(n - 1);
    }

    public static void tailRecursiveFactorial(int n) {
        tailRecursiveFactorial(n, 1);
    }

    public static void tailRecursiveFactorial(int n, int fact) {
        if (n == 0 || n == 1) {
            System.out.println(fact);
            return;
        }
        tailRecursiveFactorial(n - 1, fact * n);
    }

    public static void recursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        recursion(n - 1);
    }

    public static void recursionTwo(int n) {
        if (n == 0) {
            return;
        }
        recursionTwo(n - 1);
        System.out.print(n + " ");
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

}
