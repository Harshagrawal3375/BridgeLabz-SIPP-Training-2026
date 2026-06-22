class UsernameValidator {

    public boolean isValidUsername(String str, int i) {
        // Base case
        if (i == str.length()) {
            return true;
        }

        char ch = str.charAt(i);

        // Check if character is lowercase letter
        if (ch < 'a' || ch > 'z') {
            return false;
        }

        // Recursive call
        return isValidUsername(str, i + 1);
    }

    public static void main(String[] args) {
        UsernameValidator obj = new UsernameValidator(); // ✔ fixed

        System.out.println(obj.isValidUsername("abcdxyz", 0)); // true
        System.out.println(obj.isValidUsername("abcD123", 0)); // false
    }
}