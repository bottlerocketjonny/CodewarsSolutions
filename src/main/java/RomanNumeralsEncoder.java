import static java.lang.String.join;

public class RomanNumeralsEncoder {

    public static String solution(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {               // iterate over int values array
            while (num >= values[i]) {                          // while num is >= value[i]
                num = num - values[i];                          // subtract value[i] from num
                roman.append(romanNumerals[i]);                 // append romanNumeral[i] to string using StringBuilder
            }
        }

        return roman.toString();
    }


    public static void main(String[] args) {
        System.out.println(solution(1957));
    }

}
