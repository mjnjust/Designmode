
public class CarA extends AbstractCar{
	@Override
	protected void getCarName() {
		System.out.println("carA");
	}

	@Override
	protected void carStart() {
		System.out.println("carA start!");
	}

	@Override
	protected void carStop() {
		System.out.println("carA stop!");
	}
	
}
