import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner s=new Scanner(System.in);
		int c=0,n=0,a=0; 
		String test=s.nextLine();
		int i= test.length();
		for(int j=0;j<i;++j)
		{
			if(Character.isLetter(test.charAt(j))==true)
			++a;
			else if(Character.isDigit(test.charAt(j))==true)
			++n;
			else
			++c;
		}
		System.out.println("number of characters are"+c);
		System.out.println("number of numbers are"+n);
		System.out.println("number of alphabets"+a);
	}
}