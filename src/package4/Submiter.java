package package4;

public class Submiter {
	
	private Response1 teamleader = new Response1();
	private Response2 smallmanager = new Response2();
	private Response3 bigmanager = new Response3();
	
	public Submiter() {
		teamleader.setNext(smallmanager);
		smallmanager.setNext(bigmanager);
	}
	public void submitMessage(Message message) {
		teamleader.handler(message);
	}
	
}
