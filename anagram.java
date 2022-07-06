import java.util.*;
class anagram
{
	public static void main(String args[])
     {
		 String s1;
		 String s2;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first string");
		 s1=sc.nextLine();
		 System.out.println("Enter second string");
		 s2=sc.nextLine();
		 s1=s1.toLowerCase();
		 s2=s2.toLowerCase();
		 if(s1.length()!=s2.length())
		 {
			 System.out.println("String are not anagram ");
			 }
			 else
			 {
				 char[] String1=s1.toCharArray();
				 char[] String2=s2.toCharArray();
				 Arrays.sort(String1);
				 Arrays.sort(String2);
				 if(Arrays.equals(String1,String2)==true)
				 {
					 System.out.println("both are anagram");
					 }
					 else
					 {
						 System.out.println("both are not anagrams");
						 }
				 }
		 }
	}
