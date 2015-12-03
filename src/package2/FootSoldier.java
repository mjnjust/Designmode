package package2;

public class FootSoldier extends Soldier{

	public FootSoldier(Mediator mediator) {
		super(mediator);
		mediator.setFootSoldier(this);
	}
	
	public void work() {
		System.out.println("步兵冲锋！");
	}
	public void needSpy() {
		System.out.println("步兵说：需要侦查！");
		super.mediator.execute("zhengcha");
	}
	public void needBombard() {
		System.out.println("步兵说：需要炮击！");
		super.mediator.execute("paoji");
	}
}
