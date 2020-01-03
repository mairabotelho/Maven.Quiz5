package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Integer id;
    private double totalHours;

    public Student() {
        this.id = null;
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        this.totalHours = totalHours + amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalHours;
    }
}
