import java.util.ArrayList;
import java.util.List;

class Student {
    String index;
    String firstName;
    String lastName;

    List<Integer> points = new ArrayList();

    public Student(String index, String firstName, String lastName) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverage() {
        int average = 0;
        for (Integer point : points) {
            average+=point;
        }
        return average;
    }

    public boolean hasSignature() {
        return points.size() >= 8;
    }
}