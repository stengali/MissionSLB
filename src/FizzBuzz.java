import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sandeep on 2/8/17.
 */
public class FizzBuzz {

    private static List<String> fizzBuzz(int n) {

        if(n<1){
            return null;
        }

        List<String> output = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0)
                output.add("FizzBuzz");
            else if(i%3 == 0)
                output.add("Fizz");
            else if(i%5 == 0)
                output.add("Buzz");
            else
                output.add(String.valueOf(i));
        }
        return output;
    }

    public static void main(String args[]){
        List<String> fizzBuzzWords = fizzBuzz(15);

        if(fizzBuzzWords != null && fizzBuzzWords.size() > 0) {
            for (String str : fizzBuzzWords) {
                System.out.println(str);
            }
        }

    }
}

