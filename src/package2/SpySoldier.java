package package2;

public class SpySoldier extends Soldier{

	public SpySoldier(Mediator mediator) {
		super(mediator);
		mediator.setSpySoldier(this);
	}
	public void work() {
		System.out.println("侦查兵侦查！");
	}
	public void shouldCharge() {
		System.out.println("侦查兵说：步兵可以冲锋！");
		super.mediator.execute("chongfeng");
	}
	public void shouldBombard() {
		System.out.println("侦查兵说：炮兵可以炮击！");
		super.mediator.execute("paoji");
	}
}
