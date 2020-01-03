package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i; j < string.length(); j++){
                    if(!result.contains(string.substring(i, j + 1))){
                        result.add(string.substring(i, j + 1));
                    }
                }
            }

        return result.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] str1 = getAllSubstrings(string1);
        String[] str2 = getAllSubstrings(string2);
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < str1.length; i++){
            for(int j = 0; j < str2.length; j++){

                if(str1[i].equals(str2[j])){
                        result.add(str1[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commomStr = getCommonSubstrings(string1, string2);
        int maxLength = 0;
        String largest = "";

        for (String s : commomStr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                largest = s;
            }
        }

        return largest;
    }
}
