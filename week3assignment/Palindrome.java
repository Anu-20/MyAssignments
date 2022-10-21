package week3assignment;


public class Palindrome {

			public static void main(String[] args) {
				String m="madam";
				String rev ="";
				char[]ch=m.toCharArray();
				for(int i=ch.length-1;i>=0;i--) {
				rev=rev+ch[i];
				
				}
				if(rev.equals(m)) {
					System.out.println("palindrome");
				}
				else
				{
					System.out.println("Not a  palindrome");
					
				}
				
				
			}
		}

