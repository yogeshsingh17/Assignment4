import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
		String s1="Care";
		String s2="";
		String s3="Race";
		String s4="";
		
		//Converting to lower character
		
		for(int i=0;i<s1.length(); i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				s2=s2+(char)(s1.charAt(i)+32);
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		for(int i=0; i<s3.length(); i++)
		{
			if(s3.charAt(i)>='A' && s3.charAt(i)<='Z')
			{
				s4=s4+(char)(s3.charAt(i)+32);
			}
			else
			{
				s4=s4+s3.charAt(i);
			}
		}
		
		System.out.println(s2);
		System.out.println(s4);
		
		//Converting string into array
		
		char [] ch1= s2.toCharArray();
		char [] ch2= s4.toCharArray();
		
		//Sorting of array
		
		for(int i=0; i<ch1.length; i++)
		{
			for(int j=0; j<ch1.length-1-i; j++)
			{
				if(ch1[j]>ch1[j+1])
				{
					char temp=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		for(char elem1:ch1)
		{
			System.out.print(elem1 +" ");
		}
		
		System.out.println();
		
		for(int i=0; i<ch2.length; i++)
		{
			for(int j=0;j<ch2.length-1-i; j++)
			{
				if(ch2[j]>ch2[j+1])
				{
					char temp=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
				}
			}
		}
		for(char elem2: ch2)
		{
			System.out.print(elem2 +" ");
		}
		
		System.out.println();
		
		//Comparing the 2 arrays
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It is an anagram");
		}
		else
		{
			System.out.println("It is not an anagram");
		}
		

	}

}
