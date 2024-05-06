/**
 * @author zgd
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 5, 4};

        SelectionSort.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}