package array_Shifting_problem;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotation {

	public static void main(String[] args) {
      int arr[] = {1,3,2,4,6,7,5,6,8};
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the how many rotation you want");
      int k= sc.nextInt();
      int i=0;
      while(i<k)
      {
    	  int last = arr[arr.length - 1]; 
          for (int j = arr.length - 1; j > 0; j--) {
              arr[j] = arr[j - 1]; 
          }
          arr[0] = last; 
          i++;
      }
      System.out.println(Arrays.toString(arr));
	}
}
