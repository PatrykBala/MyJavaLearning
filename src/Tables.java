public class Tables {
    public static void main(String[] args) {
        int[] smallNumbers = {1, 3, 6, 8, 9, 10};
        int[] bigNumbers = {111, 333, 654, 856, 999, 1022, 2567};

        System.arraycopy(smallNumbers, 2, bigNumbers, 3, 4);
        for (int i = 0; i < bigNumbers.length; i++)
            System.out.println(i + ": " +bigNumbers[i]);
    }
}