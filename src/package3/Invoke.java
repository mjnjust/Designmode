package package3;

public class Invoke {
	
	private Command command = null ;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void action() {
		this.command.execute();
	}
	
}
