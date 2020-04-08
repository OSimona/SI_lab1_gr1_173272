import java.util.ArrayList;
import java.util.List;

class Course {

    List<Student> marks = new ArrayList();

    private double calculateAverage(List <Student> marks) {
  Integer sum = 0;
  if(!marks.isEmpty()) {
    for (Student mark : marks) {
        sum += mark;
    }
    return sum.doubleValue() / marks.size();
  }
  return sum;
}
}