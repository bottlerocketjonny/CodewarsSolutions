import java.util.ArrayList;

public class MultiplesOf3Or5 {
    public int solution(int number){

        // return 0 if number is negative
        if (number <= 0) { return 0; }

        // store multiples of 3/5 below input number in an arrayList
        ArrayList<Integer> multiples = new ArrayList<>();

        for(int i = 0; i < number; i++) {
          if (i % 3 == 0 || i % 5 == 0) { multiples.add(i); }
        }

        // sum using stream
        int sum = multiples.stream().mapToInt(Integer::intValue).sum();

        return sum;
    }
}
