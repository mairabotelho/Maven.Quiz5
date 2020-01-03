package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    Character delimeter;
    String string;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.string = "";
    }

    public StringAssembler append(String str) {
        this.string += str + delimeter;

        return this;
    }

    public String assemble() {
        return this.string.substring(0, string.length()-1);
    }
}
