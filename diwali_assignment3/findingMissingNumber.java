package diwali_assignment3;

public class findingMissingNumber {

	public static void main(String[] args) {
       int arr[] = {0,1,2,3,4,6,7,8,9};
       int n = arr.length;
       int sum = n*(n+1)/2;
       int actualSum=0;
       for(int i=0;i<arr.length;i++)
       {
    	   actualSum+=arr[i]; 
       }
       int missingDigit = sum-actualSum;
       System.out.println("The missing digit is: -----> "+missingDigit);
       
	}

}
