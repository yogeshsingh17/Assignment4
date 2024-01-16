public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String s1="Yogesh singh";
		String s2="";
		
		s1=s1.replace(" ","");
		
		s1=s1.toLowerCase();
		
		System.out.println(s1);
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			boolean isDuplicate=false;
			
			for(int j=0; j<s2.length(); j++)	
			{
				if(ch==s2.charAt(j))
				{
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate==false)
			{
				s2=s2+ch;
			}
		}
		
		System.out.println("Orignal string "+ s1);
		System.out.println("String after removing Duplicates "+ s2);
		

	}

}
