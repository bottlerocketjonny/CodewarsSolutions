import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        String[] partsOfString = new String[0];

        if (s.length() % 2 == 1) {
            partsOfString = s.split("(?<=\\G.{2})");
            partsOfString[partsOfString.length-1] += "_";
        }
        else {
            partsOfString = s.split("(?<=\\G.{2})");
        }

        return partsOfString;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String d = "hello world";
        System.out.println(Arrays.toString(solution(s)));
        System.out.println(Arrays.toString(solution(d)));
    }

}
