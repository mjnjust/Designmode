
public class Test {
	static int i = 1;
	static int num = 5 ;
	public static void main(String args[]) {
		
		//懒汉式单例结果测试
		Singleton1 singleton11 = Singleton1.getInstance() ;
		singleton11.setIndex(1);
		singleton11.test("singleton11");//结果：单例模式实例singleton11:1
		Singleton1 singleton12 = Singleton1.getInstance();
		singleton12.setIndex(2);
		singleton12.test("singleton12");//单例模式实例singleton12:2
		singleton11.test("singleton11");//单例模式实例singleton11:2
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
		
		System.out.println("==================");
		//拓展类Singleton3  限定实例化个数类的测试
		for(int i = 0;i<6;i++){
			Singleton3 singleton = Singleton3.getInstance(""+(i+1));
			System.out.println(singleton == null);
		}
		
		System.out.println("==================");
		//工厂类的测试
		CupFactory cupFactory = new CupFactory();
		WaterCup waterCup = cupFactory.createCup(WaterCup.class);
		WineCup wineCup = cupFactory.createCup(WineCup.class);
		TeaCup teaCup = cupFactory.createCup(TeaCup.class);
		waterCup.print();
		wineCup.print();
		teaCup.print();
		
		System.out.println("==================");
		//简单工厂类的测试
		WineCup wineCup2 = SCupFactory.createCup(WineCup.class);
		wineCup2.print();
		
		System.out.println("==================");
		//模板方法模式测试1
		CarA carA = new CarA();
		CarB carB = new CarB();
		carA.carRun();
		carB.carRun();
		System.out.println("==================");
		//模板方法模式测试2
		Product1 product1 = new Product1();
		Product2 product2 = new Product2();
		System.out.println("制造Product1");
		product1.createProduct(new int[]{0,1,3,2});
		System.out.println("制造Product2");
		product2.createProduct(new int[]{1,3,2,0});
		
		System.out.println("==================");
		//建造者模式测试
		Director director = new Director();
		director.getProduct1();
		director.getProduct2();
		
	}
}
