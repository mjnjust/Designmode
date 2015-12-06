package package6;

public class NewUser implements INewUserInfo{
	
	private String userName ;
	private int userAge ;
	private String userAddress ;
	private int userYears;
	
	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public int getUserAge() {
		return this.userAge;
	}

	@Override
	public String getUserAddress() {
		return this.userAddress;
	}

	@Override
	public int getWorkYears() {
		return this.userYears;
	}
	
}
