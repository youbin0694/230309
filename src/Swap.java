/**
 * 배열내의 인덱스에 위치한 값 바꾸는 클래스
 * 
 * @author yblee
 * @since 2023.03.10
 * 
 */
public class Swap {
    /**
     * 배열내의 인덱스에 위치한 값 바꾸는 함수
     * 
     * @param arr    배열
     * @param index1 바꿀 위치1
     * @param index2 바꿀 위치2
     * 
     * @author yblee
     * @since 2023.03.10
     */
    public void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
