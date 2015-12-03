package package3;

public class CodeCommond extends Command {

	public CodeCommond(Receiver receiver) {
		super(receiver);
	}
	public CodeCommond() {
		super(new CodeReceiver());
	}
	@Override
	public void execute() {
		super.receiver.execute();
	}

}
