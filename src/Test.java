
public class Test {
	static int i = 1;
	public static void main(String args[]) {
		
		//懒汉式单例结果测试
		Singleton1 singleton11 = Singleton1.getInstance() ;
		singleton11.setIndex(1);
		singleton11.test("singleton11");//结果：单例模式实例singleton1:1
		Singleton1 singleton12 = Singleton1.getInstance();
		singleton12.setIndex(2);
		singleton12.test("singleton12");//单例模式实例singleton2:2
		singleton11.test("singleton11");//单例模式实例singleton1:2
		System.out.println(singleton11 == singleton12);//结果：true
		
		System.out.println("==================");
		//饿汉式单例结果测试
		Singleton2 singleton21 = Singleton2.getInstance();
		singleton21.setIndex(1);
		singleton21.test("singleton21");
		Singleton2 singleton22 = Singleton2.getInstance();
		singleton22.setIndex(2);
		singleton22.test("singleton22");
		singleton21.test("singleton21");
		
		System.out.println(singleton21 == singleton22);
		
	}
}
