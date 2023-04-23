import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,4};
        System.out.println(Arrays.toString(add(l1, l2)));
    }

    public static int[] add(int[] l1, int[] l2){
        int length = l1.length-1;
        int[] newArray = new int[l1.length];
        int count = 0;
        for (int i = length; i >= 0; i--) {
            if ( l1[i] + l2[i] < 10) {
                newArray[count] = l1[i] + l2[i];
            }
            else {
                newArray[count] =  (l1[i] + l2[i]) % 10;
                if (i > 0) {
                    l1[i-1] += 1;
                }
            }
            count++;
        }
        return newArray;
    }
}
