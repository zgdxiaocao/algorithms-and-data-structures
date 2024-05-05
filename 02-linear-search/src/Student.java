/**
 * @author zgd
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return ((Student) o).name.equals(this.name);
        }

        return false;
    }
}
