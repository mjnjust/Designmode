package package4;

public class Response3 extends BaseRseponse{
	public Response3(int type) {
		super(type);
	}
	
	public Response3() {
		super(TYPE_TYPE3);
	}
	
	@Override
	public void action(Message message) {
		System.out.println("由第三责任人处理信息："+message.getMessage());
	}
}
