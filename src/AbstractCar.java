
public abstract class AbstractCar {
	protected abstract void getCarName() ;
	protected abstract void carStart() ;
	protected abstract void carStop() ;
	protected void carRun() {
		this.getCarName();
		this.carStart();
		this.carStop();
	}
}
