import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Scanner;

import package2.ArtillerySoldier;
import package2.FootSoldier;
import package2.Mediator;
import package2.SpySoldier;
import package3.ButiCommond;
import package3.CodeCommond;
import package3.Invoke;


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
		
		System.out.println("==================");
		//代理模式测试
		//代理
		Student student = new Student("test");
		DoHomeWork proxy = student.getProxy();
		proxy.doHomeWork();
		
		System.out.println("==================");
		//动态代理类1
		Student student2 = new Student("动态代理");
		ClassLoader cl = student2.getClass().getClassLoader();
		HomeWorkProxy3 handler = new HomeWorkProxy3(student2);
		DoHomeWork proxy2 = (DoHomeWork) Proxy.newProxyInstance(cl, new Class[]{DoHomeWork.class}, handler); 
		proxy2.doHomeWork();
		proxy2.hashCode();
		
		System.out.println("=================");
		//动态代理类2
		Student student3 = new Student("动态代理2");
		ClassLoader cl2 = student3.getClass().getClassLoader();
		HomeWorkProxy3 handler2 = new HomeWorkProxy3(student3);
		DoHomeWork proxy3 = DynamicProxy.newProxyInstance(cl2, new Class[]{DoHomeWork.class}, handler2);
		proxy3.doHomeWork();
		
		System.out.println("=================");
		//原型模式
		Ball ball = new Ball();
		ball.id = 1;
		ball.num = new int[]{1,2};
		T t = new T();
		t.t = 1;
		ball.t =t;
		ball.list.add("i am the first string ball.list");
		ball.teststring = "i am ball!" ;
		Ball cloneball = null ;
		try {
			cloneball = (Ball) ball.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ball信息：");
		System.out.println("id:"+ball.id+" num:"+ball.num[0]+" "+ball.num[1]+" T:"+ball.t.t+" list[0]:"+ball.list.get(0)+" string:"+ball.teststring);
		System.out.println("cloneball信息:");
		System.out.println("id:"+cloneball.id+" num:"+cloneball.num[0]+" "+cloneball.num[1]+" T:"+cloneball.t.t+" list[0]:"+
				cloneball.list.get(0)+" string:"+cloneball.teststring);
		System.out.println("两者的teststring地址是否相同："+(ball.teststring == cloneball.teststring));
		System.out.println("修改ball信息：");
		ball.id = 2;
		ball.num[0] = 2;
		ball.num[1] = 3;
		ball.t.t = 2;
		ball.list.remove(0);
		ball.teststring = "i am ball after change!" ;
		ball.list.add("i am the first string ball.list after change !");
		System.out.println("id:"+ball.id+" num:"+ball.num[0]+" "+ball.num[1]+" T:"+ball.t.t+" list[0]:"+ball.list.get(0)+" string:"+ball.teststring);
		System.out.println("此时cloneball的信息变化为：");
		System.out.println("id:"+cloneball.id+" num:"+cloneball.num[0]+" "+cloneball.num[1]+" T:"+cloneball.t.t+" list[0]:"+
				cloneball.list.get(0)+" string:"+cloneball.teststring);
		
		//中介者模式
		System.out.println("==================");
		Mediator mediator = new Mediator();
		FootSoldier footSoldier = new FootSoldier(mediator);
		ArtillerySoldier artillerySoldier = new ArtillerySoldier(mediator);
		SpySoldier spySoldier = new SpySoldier(mediator);
		footSoldier.needSpy();
		footSoldier.needBombard();
		
		spySoldier.shouldBombard();
		spySoldier.shouldCharge();
		
		artillerySoldier.shoudCharge();
		//命令模式
		System.out.println("==================");
		Invoke manager = new Invoke();
		ButiCommond butiCommond = new ButiCommond();
		CodeCommond codeCommond = new CodeCommond();
		manager.setCommand(codeCommond);
		manager.action();
		manager.setCommand(butiCommond);
		manager.action();
		
		
		
		
		
		
	}
}
