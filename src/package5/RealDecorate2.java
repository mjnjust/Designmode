package package5;

public class RealDecorate2 extends Decorate {

	public RealDecorate2(Computer computer) {
		super(computer);
	}
	
	public void decorate() {
		System.out.println("这内存，可以同时开很多很多东西而不卡啊！");
	}
	
	@Override
	public void introduce(){
		super.introduce();
		this.decorate();
	}
}
