
public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s1="2552";
		String s2="";
		
		for(int i=s1.length()-1;i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s2.equals(s1))
		{
			System.out.println(s1 +" is a palindrome ");
		}
		else
		{
			System.out.println(s1 +" is not a palindrome");
		}

	}

}
