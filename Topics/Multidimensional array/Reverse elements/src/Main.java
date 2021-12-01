
class ArrayOperations {

    public static void reverseElements(int[][] twoDimArray) {
        int middle = twoDimArray[0].length / 2;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < middle; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - 1 - j];
                twoDimArray[i][twoDimArray[i].length - 1 - j] = temp;
            }
        }
    }
}