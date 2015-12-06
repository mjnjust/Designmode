package package4;

public class Response2 extends BaseRseponse{

	public Response2(int type) {
		super(type);
	}
	
	public Response2() {
		super(TYPE_TYPE2);
	}
	
	@Override
	public void action(Message message) {
		System.out.println("由第二责任人处理信息："+message.getMessage());
	}
	
}
