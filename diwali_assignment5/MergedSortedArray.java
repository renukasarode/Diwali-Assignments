package diwali_assignment5;

import java.util.Arrays;

public class MergedSortedArray {

	public static void main(String[] args) {
		 int nums1[] = {1,2,3,4,5,12};
	      int nums2[] = {0,6,7,8,9,10,11};
	      int [] mergedSorted = mergeSortArray(nums1,nums2);
	      System.out.println(Arrays.toString(mergedSorted));
		}

		public static int[] mergeSortArray(int[] nums1, int[] nums2) {
			int result [] = new int[nums1.length+nums2.length];
			int n1=0;
			int n2=0;
			for(int i=0;i<result.length;i++)
			{
				if(n1<nums1.length && n2<nums2.length)
				{
				if(nums1[n1]<=nums2[n2])
				{
					
					result[i] = nums1[n1++];
				}
				else
				{
					result[i] = nums2[n2++];
				}
			  }	
				else if(n1 < nums1.length)
				{
					result[i] = nums1[n1++];
				}
				else if(n2 < nums2.length)
				{
					result[i] = nums2[n2++];
				}
		}
		  return result;
	}
}

