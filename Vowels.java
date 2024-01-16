
public class Vowels {

	public static void main(String[] args) 
	{
		String s1="Yogesh@singh";
		
		int vowelCount=0;
		int consonantCount=0;
		int specialCharCount=0;
		
		s1=s1.toLowerCase();
		
		for(char ch : s1.toCharArray())
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;
				
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				consonantCount++;
				break;
			
			default:
				if(!Character.isWhitespace(ch))
				{
					specialCharCount++;
				}
				break;
				
			}
		}
		
		System.out.println("vowels "+ vowelCount);
		System.out.println("consonants "+ consonantCount);
		System.out.println("special character "+ specialCharCount);
	}

}
