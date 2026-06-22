class StrictlyIncreasing {

    public boolean isIncreasing(int[] arr, int i) {
        // Base case
        if (i == arr.length - 1) {
            return true;
        }

        // Check current pair
        if (arr[i] >= arr[i + 1]) {
            return false;
        }

        // Recursive call
        return isIncreasing(arr, i + 1);
    }

    public static void main(String[] args) {
        StrictlyIncreasing obj = new StrictlyIncreasing();  // ✔ fixed

        int[] arr1 = {12, 15, 18, 22, 30};
        int[] arr2 = {12, 15, 14, 22};

        System.out.println(obj.isIncreasing(arr1, 0)); // true
        System.out.println(obj.isIncreasing(arr2, 0)); // false
    }
}