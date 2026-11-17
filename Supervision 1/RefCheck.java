public class RefCheck {
    public static void main ( String [] args ) {
        int[] test = new int[]{1, 2, 3, 4};
        int[] testCopy = test;
        test[2] = 8;
        // James: Not quite - you are not showing that this is copied when passed as an argument
        System.out.println(testCopy[2]);
    }

    // James: Consider:
    void setToNull(int[] testCopy) {
        testCopy[2] = 8;
        testCopy = null;
    }
}
