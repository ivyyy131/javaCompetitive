
public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
	      	int[] sum = {0,0};
	      	boolean flag = false;
	        for(int i=0;i<nums.length; i++) {
	        	int curr = target-nums[i];
	        	for(int j=i+1; j<nums.length; j++) {
	        		if(nums[j]==curr) {
	        			flag=true;
	        			sum[0]=i;
	        			sum[1]=j;
	        			break;
	        		}
	        	}
	        	if(flag) break;
	        }
	        return sum;
	  }

}
