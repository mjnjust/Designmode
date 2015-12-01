
public class Student implements DoHomeWork{
	private String name ;
	private HomeWorkProxy proxy ;
	public Student(String name) {
		this.proxy = new HomeWorkProxy(this);
		this.name = name ;
	}
	
	public void doHomeWork() {
		System.out.println(name+"is doing homework!");
	}
	
	public DoHomeWork getProxy() {
		return this.proxy ;
	}
	
}
