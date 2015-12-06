package package6;

//实现多接口转换的适配器模式
public class Adapter2 implements INewUserInfo{
	private IOldUserPersonalInfo oldUserPersonalInfo ;
	private IOldUserWorkInfo oldUserWorkInfo ;
	public Adapter2(IOldUserPersonalInfo oldUserPersonalInfo,IOldUserWorkInfo oldUserWorkInfo) {
		this.oldUserPersonalInfo = oldUserPersonalInfo;
		this.oldUserWorkInfo = oldUserWorkInfo;
	}
	@Override
	public String getUserName() {
		return this.oldUserPersonalInfo.getName();
	}
	@Override
	public int getUserAge() {
		return this.oldUserPersonalInfo.getAge();
	}
	@Override
	public String getUserAddress() {
		return this.oldUserPersonalInfo.getAddress();
	}
	@Override
	public int getWorkYears() {
		return this.oldUserWorkInfo.getWorkYears();
	}
	
	
	
	
}
