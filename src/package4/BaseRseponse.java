package package4;

public abstract class BaseRseponse {
	static int TYPE_TYPE1 = 1;
	static int TYPE_TYPE2 = 2;
	static int TYPE_TYPE3 = 3;

	private int type ;
	private BaseRseponse next = null ;
	public BaseRseponse(int type) {
		this.type = type ;
	}
	public abstract void action(Message message);
	
	public final void handler(Message message) {
		if(message.getType() == this.type){
			action(message);
		}else if(this.next != null){
			this.next.handler(message);
		}else {
			System.out.println("到达责任链末尾！");
		}
	}
	
	public void setNext(BaseRseponse next) {
		this.next = next;
	}
}
