/*
  a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"*/



public class Task {

	public static void main(String[] args) {
		String str="Global Warming";
	int len=str.length();
		//A
		 System.out.println(str.substring(10));
		 //B
		 System.out.println(str.substring(4,8));
		//C
	        boolean isAlphaNumeric = (str != null) &&
	                str.chars().allMatch(Character::isLetterOrDigit);
	        System.out.println(isAlphaNumeric);
		 //D
		String st= str.substring(len-4);
		 System.out.println(st);
		//E
		 String trimmed4space = str.substring(0,4);
	        System.out.println(trimmed4space);
	    //F    
	     int str2= str.indexOf("Wa");
	     System.out.println(str2);
	        //G
	        System.out.println(str.toUpperCase());
	       //I
	        String h2= str.replace('a',  '*');
	        System.out.println(h2);
	        
	        System.out.println(bTitleCase(str));
	}
	//H
	public static boolean bTitleCase(String s)
	{
		boolean result=false;
		String arr[]=s.split("\\st");
		for(int i=0;i<arr.length;i++)
		{
			char ch1=arr[i].charAt(0);
			if(ch1>=65 && ch1<=90)
			{
				result=true;
			}
			else
			{
				result=false;
				break;
				
			}
		}
		return result;
	}

}

