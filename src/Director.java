
public class Director {
	private Product1Builder product1Builder = new Product1Builder();
	private Product2Builder product2Builder = new Product2Builder();
	public Product1 getProduct1() {
		System.out.println("制造product1");
		return product1Builder.getProduct(new int[]{0,1,2,3});
	}
	public Product2 getProduct2() {
		System.out.println("制造product2");
		return product2Builder.getProduct(new int[]{2,3,1,0});
	}
}
