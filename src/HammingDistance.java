/**
 * Created by Sandeep on 2/8/17.
 */
public class HammingDistance {

    public static int hammingDistanceIterative(int x, int y) {

        int i = x^y;
        int distance =0;

        while(i != 0){
            ++distance;
            i = (i-1)& i;
        }

        return distance;
    }

    public static int hammingDistanceRecursive(int x, int y) {

        int i = x^y;

        if(i==0)
            return 0;

        return (x^y)%2 + hammingDistanceRecursive(x/2,y/2);
    }



    public static void main(String args[]){
        System.out.println(hammingDistanceIterative(1,41));
        System.out.println(hammingDistanceRecursive(1241,41));
    }

}
