package diwali_assignment1;

public class LongestString {

	public static void main(String[] args) {
      String  str[] = {"animal","beautifulTreasure","magic","box","treasure"};
      String longStr = longString(str);
      System.out.println("longest String in the array is " + longStr +" and its length is: "+longStr.length());
	}

	public static String longString(String[] str) {
		int length=0;
		int index =0;
		for(int i=0;i<str.length;i++)
		{
		  if(str[i].length()>length)
		  {
			  length = str[i].length();
			  index = i;
		  }
		}
		
		return str[index];
	}

}
