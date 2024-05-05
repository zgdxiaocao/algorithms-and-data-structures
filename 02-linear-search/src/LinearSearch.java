/**
 * @author zgd
 */
public class LinearSearch {
    private LinearSearch() {
    }

    // 泛型不支持基本数据类型，只能支持类对象
    public static <E> int search(E[] arr, E target) {
        for (int i = 0; i < arr.length; i++) {
            // 类对象==判断的是引用
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        Float[] floatData = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.10f};

        int res = LinearSearch.search(floatData, 2.2f);
        System.out.println(res);

        int res2 = LinearSearch.search(floatData, 31);
        System.out.println(res2);


        Student s1 = new Student("zhangsan");
        Student s2 = new Student("lisi");
        Student s3 = new Student("wangwu");
        Student[] students = {s1, s2, s3};

        int re3 = LinearSearch.search(students, s2);
        System.out.println(re3);
    }

}
