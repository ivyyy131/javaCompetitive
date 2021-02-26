
public class DublicateZeros {
	public static void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++) {
        	
        	if(arr[i]==0 && i!=arr.length-1) {
        		for(int j=arr.length-2; j>=i+1; j--) {
        			arr[j+1]=arr[j];
        		}
        		arr[i+1]=0;
        		i++;
        	}
        }
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
    }
	
	public static void main(String[] args) {
		int[] arr = {1,0,2,3,0,4,5,0};
		//int[] arr2 = {1,0,2};
		duplicateZeros(arr);
	
	}
}
