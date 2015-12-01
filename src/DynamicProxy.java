import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class DynamicProxy<T> {
	public static <T> T newProxyInstance(ClassLoader cl,Class<?>[] cs,InvocationHandler handler) {
		
		System.out.println("before 创建动态代理");
		T t =  (T) Proxy.newProxyInstance(cl, cs, handler);
		System.out.println("after 创建动态代理");
		return t ;
	}
}
