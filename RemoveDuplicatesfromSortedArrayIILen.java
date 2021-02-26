
public class RemoveDuplicatesfromSortedArrayIILen {
	public int removeDuplicates(int[] nums) {
		int len=nums.length;
		for(int i=0; i<nums.length-1; i++) {
			int br=1;
			while(nums[i]==nums[i+1] && i<nums.length-2) {
				br++;
				i++;
				if(i==nums.length-2 && nums[i]==nums[i+1]) {
					len--;
				}
			}
			if(br>2) {
				len-= (br-2);
			}
		}
        return len;
    }
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		int ans = new RemoveDuplicatesfromSortedArrayIILen().removeDuplicates(nums);
		System.out.println(ans);
	}
}

