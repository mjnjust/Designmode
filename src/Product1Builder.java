
public class Product1Builder {
	private Product1 product = new Product1();
	public Product1 getProduct(int[] order) {
		product.createProduct(order);
		return this.product;
	}
}
