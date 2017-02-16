import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Sandeep on 2/8/17.
 */
public class NextGreaterElement1 {

    /*
    Best solution
     */
    private static int[] nextGreaterElementSol2(int[]findNums, int[] nums) {
        Map<Integer,Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num:nums){
            while(!stack.isEmpty() && num>stack.peek()){
                nextGreaterMap.put(stack.pop(),num);
            }
            stack.push(num);
        }

        for(int i=0;i<findNums.length;i++){
            findNums[i] = nextGreaterMap.getOrDefault(findNums[i],-1);
        }
        return findNums;
    }

    public static int[] nextGreaterElementSol1(int[] findNums, int[] nums) {
        for(int i=0;i<findNums.length;i++){
            boolean matchFlag = false;
            boolean foundFlag = false;
            for(int j=0;j<nums.length;j++){
                if(matchFlag && nums[j]>findNums[i]){
                    findNums[i] = nums[j];
                    foundFlag = true;
                    break;
                }
                if(!matchFlag && nums[j] == findNums[i]){
                    matchFlag = true;
                }
            }
            if(!foundFlag) {
                findNums[i] = -1;
            }
        }
        return findNums;
    }
    public static void main(String args[]){

        int[] findNums = {4,1,2};
        int[] nums = {1,3,4,2};

        int[] result = nextGreaterElementSol1(findNums,nums);
        for(int i:result){
            System.out.println(i);
        }
    }
}
