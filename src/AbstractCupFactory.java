
public abstract class AbstractCupFactory {
	public abstract <T extends ICup> T createCup(Class<T> x) ;
}
