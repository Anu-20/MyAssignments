package week3assignment;


import java.util.Arrays;

	public class Anagram {

		public static void main(String[] args) {
                String text1 = "stops";
		        String text2 = "potss"; 
				
		        if(text1.length()!=text2.length())
		        {
		        	System.out.println("This is not Anagram");
		        }
			 else 
		        
		        {
					char[] char1 = text1.toCharArray();
					char[] char2=text2.toCharArray();
					Arrays.sort(char1);
					Arrays.sort(char2);
					
					
					if(Arrays.equals(char1,char2)) {
						System.out.println("This is anagram");
					}
					else {
						System.out.println("This is not Anagram");
					}
				}


		}

	}
	


