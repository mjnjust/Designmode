package package2;

public class ArtillerySoldier extends Soldier{

	public ArtillerySoldier(Mediator mediator) {
		super(mediator);
		mediator.setArtillerySoldier(this);
	}
	public void work() {
		System.out.println("炮兵轰击！");
	}
	public void shoudCharge() {
		System.out.println("炮兵说：步兵可以冲锋！");
		super.mediator.execute("chongfeng");
	}
}
