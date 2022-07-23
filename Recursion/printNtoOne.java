public class printNtoOne {
    public static void main(String args[]) {
        System.out.println(nonTailFactorial(5));
    }

    public static int fibonacci(int n, int k, int j) {
        if(n == 0){
            return 0;
        }
        return  
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

}