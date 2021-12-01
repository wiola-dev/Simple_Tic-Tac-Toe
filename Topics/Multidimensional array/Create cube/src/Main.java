import java.util.Scanner;
import java.util.Arrays;
class ArrayOperations {
//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(createCube()));
//   }
    public static int[][][] createCube() {
        int[][][] threeDimArray = new int[3][3][3];
        int element = 0;
        for (int x = 0; x < threeDimArray.length; x++) {
            for (int y = 0; y < threeDimArray[x].length; y++) {
                for (int z = 0; z < threeDimArray[y].length; z++) {
                    threeDimArray[x][y][z] = element;
                    element++;
                }
            } element = 0;
        }
        return threeDimArray;
    }
}