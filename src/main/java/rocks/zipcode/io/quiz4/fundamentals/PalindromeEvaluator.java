package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i; j < string.length(); j++){
                if (isPalindrome(string.substring(i, j + 1))){
                    if(!(result.contains(string.substring(i, j + 1)))){
                        result.add(string.substring(i, j + 1));
                    }
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {

        if(string.equals(reverseString(string)))
            return true;

        return false;
    }

    public static String reverseString(String string) {
        StringBuilder str = new StringBuilder(string);

        return str.reverse().toString();
    }
}
