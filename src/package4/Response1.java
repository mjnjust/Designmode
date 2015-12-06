package package4;

public class Response1 extends BaseRseponse{

	public Response1(int type) {
		super(type);
	}
	public Response1() {
		super(TYPE_TYPE1);
	}
	@Override
	public void action(Message message) {
		System.out.println("由第一责任人处理信息："+message.getMessage());
	}
	
}
