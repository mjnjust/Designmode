/*
 * 方法二：饿汉式单例
 * 优点：在程序初始化的时候就将类实例化，所以是线程安全的
 * 缺点：如果这个类在以后用不着，那么就会造成内存资源的浪费
 */
public class Singleton2 {
	private int index = 0 ;
	public static Singleton2 singleton = null ;
	static{
		singleton = new Singleton2(); 
	}
	public static Singleton2 getInstance() {
		return singleton ;
	}
	private Singleton2(){
		
	}
	public void setIndex(int i) {
		this.index = i ;
	}
	public void test(String name) {
		System.out.println("单例模式实例"+name+":"+index);	
	}
}
