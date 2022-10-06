package week1.day1;

public class Mobile {


	public void makecall(String mobilemodel ,float mobileweight) {
		System.out.println("my mobliemodel is" + mobilemodel);
		
		System.out.println("my mobileweight is" + mobileweight);
	}
		
	public void sendmsg(boolean fullycharged   ,int mobilecost) {
		System.out.println("isfullycharged" + fullycharged);
		
		System.out.println("mobilecost is" + mobilecost);
	}
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		m.makecall("Redmi",12.5f);
		m.sendmsg(true,15000);
		System.out.println("This is my new mobile");
	}
	}




