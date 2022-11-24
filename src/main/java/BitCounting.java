public class BitCounting {

    public static int countBits(int n){
        String binaryAsString = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 0; i < binaryAsString.length(); i++) {
            if (binaryAsString.charAt(i) == '1') { count++; }           // remember chars are single quotes
            else { continue; }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
