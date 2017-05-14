import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sandeep on 2/24/17.
 */
public class ConstructTheRectangle {

    private static List<Integer> findFactors(int num)
    {
        int incrementer = 1;
        if (num % 2 != 0)
        {
            incrementer = 2; //only test the odd ones
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= num / 2; i=i+incrementer)
        {
            if (num % i == 0)
            {
                list.add(i);
            }
        }
        list.add(num);
        return list;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int area =20;
        List<Integer> list = findFactors(20);
        int i = list.size() -1;
        int j = 0;
        int diff = area;


    }
}
