import java.util.ArrayList;


public class Ball implements Cloneable{
	public int id = -1;
	public String teststring ;
	public int[] num ;
	public ArrayList<String> list = new ArrayList<String>();
	public T t ; 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Ball ball = null ;
		try {
			ball = (Ball) super.clone();
			ball.list = (ArrayList<String>) this.list.clone();
			ball.t = new T();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ball ;
	}
	
}
class T{
	public int t = 0;
}
