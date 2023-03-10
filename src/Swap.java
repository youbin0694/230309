import java.util.*;

public class Swap {

    public static void swap(int[] arr, int a, int b){

        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) throws Exception {
        
        int[] arr={1,3,2,4,5};
        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }
}
