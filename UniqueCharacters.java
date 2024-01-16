import java.util.Arrays;

public class UniqueCharacters 
{

	public static void main(String[] args) 
	{
		boolean Yogesh=true;
		String s1="Mahima";
		
		char [] ch=s1.toCharArray();
		Arrays.sort(ch);
		
		for(int i=1; i<ch.length; ++i)
		{
			if(ch[i]==ch[i-1])
			{
				Yogesh=false;
				break;
			}
			
		}
		
		System.out.println("orignal string " + s1);
		System.out.println("string has unique characters:- "+ Yogesh);

	}

}
