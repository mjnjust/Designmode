
public class SCupFactory {
	public static <T extends ICup> T createCup(Class<T> t) {
		ICup cup = null ;
		try {
			cup = (T) Class.forName(t.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) cup ;
	}
}
