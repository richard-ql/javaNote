package leetcode;

import java.util.Arrays;

public class leetcode4 {
	
	public static void main(String[] args) {
		int[] nums1= new int[] {1, 3, 5};
		int[] nums2= new int[] {2, 4, 6};
		
		findMedianSortedArrays(nums1, nums2);
	}
	public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
	          
		return mergeArrays(nums1, nums2);
	}
	    
    public static int[] mergeArrays(int[] nums1, int[] nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] nums3 = Arrays.copyOf(nums1, len1+len2);
        
        System.arraycopy(nums2,0,nums3,len1,len2);
        Arrays.sort(nums3);
        
        for(int i:nums3) {
        	System.out.println(i);
        }
        return nums3;
    }
}
