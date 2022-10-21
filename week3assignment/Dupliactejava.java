package week3assignment;

public class Dupliactejava {

	public static void main(String[] args) {
		String text = "We learn java  basics as part of java sessions in java week1";

		int count=0;
		String breaktext[]=text.split(" ");
		String finaltext="";
		for(int i=0;i<breaktext.length;i++)
		{
		for(int j=i+1;j<breaktext.length;j++)
		{
		if(breaktext[i].equals(breaktext[j]))
		{
		count++;
		if(count!=0)
		{
		breaktext[j]="";
		}
		}
		}
		if(count!=0)
		{
		count=0;
		}
		}
		for (String word : breaktext)
		{
		finaltext=finaltext+" "+word;
		}
		System.out.println(finaltext);
		}

		 
	

	}


