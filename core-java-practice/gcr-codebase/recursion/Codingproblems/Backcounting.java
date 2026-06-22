public class Backcounting {

    public void printNumbers(int n) {
        // Base case
        if (n == 1) {
            System.out.print(1);
            return;
        }

        // Print current number
        System.out.print(n + " ");

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Backcounting obj = new Backcounting();  // ✔ fixed
        obj.printNumbers(5);
    }
}