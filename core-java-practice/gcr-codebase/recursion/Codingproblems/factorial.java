class Factorial {

    public int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();  
        int result = obj.factorial(5);
        System.out.println(result);
    }
}