import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class HomeWorkProxy3 implements InvocationHandler{
	
	private Class cls = null ;
	private Object obj = null ;
	
	public HomeWorkProxy3(Object obj) {
		this.obj = obj ;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		//Object result = method.invoke(this.obj, args);
		Object result = null ;
		if(method.getName().equals("doHomeWork")){
			System.out.println("动态代理开始");
			result = method.invoke(this.obj, args);
			System.out.println("动态代理结束");
		}else {
			System.out.println("others");
			result = method.invoke(this.obj, args);
		}
		
		return result;
	}
	
}
