package package5;

public class Decorate extends Computer {
	private Computer computer ;
	
	public Decorate(Computer computer) {
		this.computer = computer ;
	}
	
	@Override
	public void introduce() {
		this.computer.introduce();
	}

}
