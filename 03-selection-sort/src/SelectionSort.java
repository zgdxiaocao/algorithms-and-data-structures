/**
 * 选择排序
 *
 * @author zgd
 */
public class SelectionSort {
    private SelectionSort() {

    }


    public static void sort(int[] arr) {
        // arr[0,i)是有序的, arr[i,n)无序的
        for (int i = 0; i < arr.length; i++) {

            // 选出[i,n)中最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            swap(arr, i, minIndex);
        }


    }

    private static void swap(int[] arr, int i, int j){

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
