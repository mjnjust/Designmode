/*
 * 单例模式 
 * 方法一：懒汉式单例
 * 在程序第一次调用getInstence的时候实现实例的产生
 * 优点：只有在使用到这个类的时候才会去实例化，这样可以更好的节省内存资源
 * 缺点：不是线程安全的，在多线程中可能会实例化不止一个。假设有两个线程A、B都要创建一个实例，A调用getInstance，发现singleton是null，此时B线程获得
 * CPU控制权，发现singleton也是空的，这样A和B就各自创建一个实例，（而且后面创建的应该会把前面创建的覆盖）
 * 修改：对getInstance方法进行改进，加入线程锁
 */
public class Singleton1 {
	public static Singleton1 singleton = null ;
	public int index = 0 ;
	public static Singleton1 getInstance() {
		if(singleton == null){
			singleton = new Singleton1();
		}
		return singleton ;
	}
	private Singleton1(){
		
	}
	public void setIndex(int i) {
		this.index = i ;
	}
	public void test(String name) {
		System.out.println("单例模式实例"+name+":"+index);
	}
}

