package interfaceprograms;

public class WhatsupImp implements Test0 {

	
	public void calls() {
		System.out.println("calls");
		
	}

	
	public void chats() {
		System.out.println("chats");
		
	}

	
	public void photo() {
		System.out.println("photos");
		
	}
public static void main(String[] args) {
	WhatsupImp w=new WhatsupImp();
	w.calls();
	w.chats();
	w.photo();
}
}
