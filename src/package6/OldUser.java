package package6;

public class OldUser implements IOldUserInfo{
	
	private String name ;
	private int age ;
	private String  address ;
	private int workyears ;
	public OldUser(String name,int age,String address,int workyears) {
		this.name = name ;
		this.age = age ;
		this.address =address ;
		this.workyears = workyears;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	@Override
	public int getWorkYears() {
		return this.workyears ;
	}
	
}
