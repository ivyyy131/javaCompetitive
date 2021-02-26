
public class MergeSortedArray {
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int p = nums1.length-1, p1 = m-1, p2 = n-1;
    	while(p1 >= 0 && p2 >= 0){
    		nums1[p--] = nums2[p2] > nums1[p1] ? nums2[p2--] : nums1[p1--];
    	}
    	while(p2>=0){
    	    nums1[p--]=nums2[p2--];
        }
    
        for(int i=0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);

	}

}
