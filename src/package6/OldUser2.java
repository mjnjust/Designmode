package package6;

public class OldUser2 implements IOldUserPersonalInfo,IOldUserWorkInfo{
	private String name ;
	private int age ;
	private int workyears ;
	private String address ;
	
	public OldUser2(String name,int age,int workyears,String address) {
		this.name = name ;
		this.age = age ;
		this.workyears = workyears ;
		this.address = address ;
	}

	@Override
	public int getWorkYears() {
		return this.workyears;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getAddress() {
		return this.address ;
	}
	
}
