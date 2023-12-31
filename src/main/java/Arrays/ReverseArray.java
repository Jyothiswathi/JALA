package Arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int s[]= {6,7,2,3};
		int s1[]=new int[s.length];
		int j=0;
		for(int i=s.length-1;i>=0;i--)
		{
			s1[j]=s[i];
			j++;
		}
	System.out.println(Arrays.toString(s1));	
	}
	
	
	

}
