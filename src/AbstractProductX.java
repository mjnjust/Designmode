
public abstract class AbstractProductX {
	protected abstract void createa();
	protected abstract void createb();
	protected abstract void createc();
	protected abstract void created();
	protected void createProduct(int[] order){
		for(int i=0;i<order.length;i++){
			if(order[i] == 0){
				this.createa();
			}else if (order[i] == 1) {
				this.createb();
			}else if (order[i] == 2) {
				this.createc();
			}else if (order[i] == 3) {
				this.created();
			}
		}
	}
}
