
public class Pangram 
{

	public static void main(String[] args) 
	{
		boolean Yogesh=false;
		String s1="The five boxing wizards jump quickly";
		
		s1=s1.replace(" ","");
		s1=s1.toUpperCase();
		
		char [] ch=s1.toCharArray();
		int [] a=new int[26];
		
		for(int i=0; i<ch.length; i++)
		{
			int index=ch[i]-65;
			a[index]++;
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				System.out.println("It's not a pangram");
				Yogesh=true;
			}
		}
		if(Yogesh==false)
		{
			System.out.println("It's a pangram");
		}
		

	}

}
