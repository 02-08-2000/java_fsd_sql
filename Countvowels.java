package UST_BATCHN0_3.Junit5testcase;

public class Countvowels 
{
	public static void main1(String[] args) 
	{
	    Countvowels v = new Countvowels();
		String s="welcome to hello world";
		System.out.println(v.vowelscount(s));
	}

	public static int vowelscount(String s) {
		// TODO Auto-generated method stub
 
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
 }
 
	}
		return count;
	}

	
	}
