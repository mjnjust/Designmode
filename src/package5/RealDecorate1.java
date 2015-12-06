package package5;

public class RealDecorate1 extends Decorate {

	public RealDecorate1(Computer computer) {
		super(computer);
	}
	
	public void decorate() {
		System.out.println("这显卡，玩lol完全没问题！");
	}
	
	@Override
	public void	introduce(){
		super.introduce();
		this.decorate();
	}
	
}
