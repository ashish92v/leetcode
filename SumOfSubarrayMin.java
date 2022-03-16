import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SumOfSubarrayMin {

	public static void main(String ags[]) {
		int[] nums = {3,1,2,4};
		
		int sum = sumSubarrayMins(nums);
		System.out.println("sum "+sum);
		
	}
	
	 public static  int m = (int) Math.pow(10,9)+7;
	    public static int sumSubarrayMins(int[] arr) {
	        int len = arr.length;
	        int left[] = new int[len];
	        int right[] = new int[len];
	        
	        ArrayDeque<Pair> stack1 = new ArrayDeque<>();
	        ArrayDeque<Pair> stack2 = new ArrayDeque<>();
	        
	        for(int i=0;i<len;i++){
	            int currentElement = arr[i];
	            int count =1;
	            while(stack1.size()!=0 && stack1.peek().element>currentElement){//3>1
	                count+=stack1.peek().count;
	                stack1.pop();
	            }
	            stack1.push(new Pair(currentElement, count));// 3 1  1 2  2 1  4 1 
 	            left[i] = count; // 1 2 1 1
	        }
	        
	           for(int i=len-1;i>=0;i--){
	            int currentElement = arr[i];
	            int count =1;
	            while(stack2.size()!=0 && stack2.peek().element>=currentElement){
	                count+=stack2.peek().count;
	                stack2.pop();
	            }
	            stack2.push(new Pair(currentElement, count));// 4 1  2 2  1 3  3 1  
	            right[i] = count;// 1 3 2 1 reverse
	        }

	        int ans = 0;
	        for(int i=0;i<len;i++){
	            ans = (ans+left[i]*right[i]*arr[i])%m; // 3+6+4+4 //17
	        }
	        
	        
	        return ans;
	
	    }
}

class Pair{
    int element;
    int count;
    Pair(int ele, int counter){
        element = ele;
        count = counter;
    }
}
