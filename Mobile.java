package week1.day1;

public class Mobile {
	public void sendMsg(String msg) {
		String messageReceived=null;
		System.out.println("messageReceived"+messageReceived);
	}
public void makeCall(long mobileNo) {
	System.out.println("call received"+mobileNo);
	
}
private void saveContact(String name) {
	System.out.println("saveContact"+name);
}
public static void main(String[]args) {
	Mobile Mobile =new Mobile();
    Mobile.saveContact("riku");
    Mobile.makeCall(123456987L);
    
    
	
	
	
}

}

