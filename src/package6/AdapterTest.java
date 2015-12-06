package package6;

public class AdapterTest {
	public static void main(String args[]) {
		//适配器模式
		INewUserInfo user1 = new Adapter("test", 21, "njust",0);
		System.out.println("name:"+user1.getUserName());
		System.out.println("age:"+user1.getUserAge());
		System.out.println("address:"+user1.getUserAddress());
		
		System.out.println("====================");
		//适配器模式 扩展
		OldUser2 oldUser2 = new OldUser2("test2", 21, 2, "njust");
		IOldUserPersonalInfo oldUserPersonalInfo = oldUser2;
		IOldUserWorkInfo oldUserWorkInfo = oldUser2;
		INewUserInfo user2 = new Adapter2(oldUserPersonalInfo, oldUserWorkInfo);
		System.out.println("name:"+user2.getUserName());
		System.out.println("age:"+user2.getUserAge());
		System.out.println("address:"+user2.getUserAddress());
		System.out.println("workyears:"+user2.getWorkYears());
	}
}
