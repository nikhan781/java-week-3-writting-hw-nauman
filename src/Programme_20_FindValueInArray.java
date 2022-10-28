public class Programme_20_FindValueInArray {

    public static boolean isArrayContains(int[] arr, int item) {
        boolean isConatin = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                isConatin = true;
                break;
            }
        }
        return isConatin;
    }

    public static void main(String[] args) {

        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        System.out.println(isArrayContains(numArray, 2035));
        System.out.println(isArrayContains(numArray, 7999));

    }

}
