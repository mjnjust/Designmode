
public class CarB extends AbstractCar{

	@Override
	protected void getCarName() {
		System.out.println("carB");
	}

	@Override
	protected void carStart() {
		System.out.println("carB start");
	}

	@Override
	protected void carStop() {
		System.out.println("carB stop!");
	}

}
