public class Calculate {
    public static void formingTheMatrix(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length && value < array.length + 1; j++) {
                array[i][j] = value;
            }
            value++;
        }
    }

    public static void formingTheNewMatrix(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= array.length - i; j--) {
                array[i][j] = 0;
            }
        }
    }
}
