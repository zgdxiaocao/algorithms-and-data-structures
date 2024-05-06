/**
 * 生成数组
 *
 * @author zgd
 */
public class ArrayGenerator {
    private ArrayGenerator() {

    }

    public static Integer[] generate(int length) {
        Integer[] arr = new Integer[length];

        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }

        return arr;
    }

}
