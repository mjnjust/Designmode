
public class CupFactory extends AbstractCupFactory{

	@Override
	public <T extends ICup> T createCup(Class<T> x) {
		ICup cup = null ;
		try {
			cup = (T) Class.forName(x.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) cup ;
	}

}
