public class PangramChecker {

    public static boolean check(String sentence){
        sentence = sentence.toLowerCase();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"
                , "s", "t", "u", "v", "w", "x", "y", "z"};
        String count = "";

        for (int j = 0; j < alphabet.length; j++) {
            if (sentence.contains(alphabet[j]) && !count.contains(alphabet[j])) {
                count += alphabet[j];
            }
        }

        if (count.length() == 26) { return true; }
        else { return false; }
    }

    public static void main(String[] args) {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(check(pangram1));
    }

}

