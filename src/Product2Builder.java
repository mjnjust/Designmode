
public class Product2Builder {
	private Product2 product = new Product2();
	public Product2 getProduct(int[] order) {
		this.product.createProduct(order);
		return this.product;
	}
}
