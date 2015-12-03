package package3;

public class ButiCommond extends Command{

	public ButiCommond(Receiver receiver) {
		super(receiver);
	}
	public ButiCommond() {
		super(new ButiReceiver());
	}
	@Override
	public void execute() {
		super.receiver.execute();
	}
}
