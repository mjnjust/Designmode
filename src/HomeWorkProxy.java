
public class HomeWorkProxy implements DoHomeWork{
	
	DoHomeWork student = null ;
	
	public HomeWorkProxy(Student student) {
		this.student = student ;
	}
	
	public void doHomeWork() {
		this.beforeDo();
		this.student.doHomeWork();
		this.afterDo();
	}
	
	public void beforeDo() {
		System.out.println("复习！");
	}
	
	public void afterDo() {
		System.out.println("检查！");
	}
	
}
