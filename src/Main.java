import java.util.Arrays;

/**
 * Swap 클래스 내의 swap 함수 불러오는 클래스 
 * 
 * @author yblee
 * @since 2023.03.10
 */
public class Main {

    public static void main(String[] args) {

        Swap swap = new Swap();

        int[] arr = { 1, 3, 2, 4, 5 };
        System.out.println(Arrays.toString(arr));

        swap.swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }
}
