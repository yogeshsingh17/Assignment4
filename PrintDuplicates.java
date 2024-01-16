
public class PrintDuplicates 
{

	public static void main(String[] args) 
	{
		String s1="Yogesh Singh";
		String s2="";
		
		s1=s1.toLowerCase();
		
		s1=s1.replace(" ", "");
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			boolean isDuplicate=false;
			
			for(int j=i+1; j<s1.length(); j++)
			{
				if(ch==s1.charAt(j))
				{
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate && s2.indexOf(ch) == -1)
			{
				s2=s2+ch;
			}
		}
		
		System.out.println("Orignal string is "+ s1);
		System.out.println("Duplicates are "+ s2);

	}

}
