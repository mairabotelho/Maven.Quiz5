package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private Map<Student, Double> students;

    public ZipCodeWilmington() {
        this.students = new LinkedHashMap<>();
    }

    public void enroll(Student student) {
        this.students.put(student, student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {
        for(Map.Entry<Student, Double> entry : students.entrySet())
            if(entry.getKey() == student)
                return true;

            return false;
    }

    public void lecture(double numberOfHours) {
        for(Map.Entry<Student, Double> entry : students.entrySet()) {
            entry.getKey().learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        for(Map.Entry<Student, Double> entry : students.entrySet()) {
            entry.setValue(entry.getKey().getTotalStudyTime());
        }

        return students;
    }
}
