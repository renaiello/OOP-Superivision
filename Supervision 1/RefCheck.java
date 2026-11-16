public class RefCheck {
    public static void main ( String [] args ) {
        int[] test = new int[]{1, 2, 3, 4};
        int[] testCopy = test;
        test[2] = 8;
        System.out.println(testCopy[2]);
    }
}
