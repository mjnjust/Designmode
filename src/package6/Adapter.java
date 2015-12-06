package package6;

public class Adapter extends OldUser implements INewUserInfo{

	public Adapter(String name, int age, String address,int workyears) {
		super(name, age, address,workyears);
	}

	@Override
	public String getUserName() {
		return super.getName();
	}

	@Override
	public int getUserAge() {
		return super.getAge();
	}

	@Override
	public String getUserAddress() {
		return super.getAddress();
	}

}
