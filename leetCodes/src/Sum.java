import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(sum(nums, 6)));
    }

    public static int[] sum(int[] array, int target){
        int[] newArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    newArray[0] = j;
                    newArray[1] = i;
                }
            }
        }
        return newArray;
    }
}
