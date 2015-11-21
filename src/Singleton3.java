import java.util.HashMap;
import java.util.Map;


public class Singleton3 {
	public static Map<String, Singleton3> map = new HashMap<String, Singleton3>();
	private static int cancreate = 5 ;
	public static synchronized Singleton3 getInstance(String name) {
		if(!map.containsKey(name)&&cancreate!=0){
			map.put(name, new Singleton3());
			cancreate--;
		}else if(cancreate == 0){
			System.out.println(Singleton3.class.getName()+"可创建数量已达上限！");
			return null ;
		}
		return map.get(name);
	}
	
	private Singleton3(){};
	
	
}
