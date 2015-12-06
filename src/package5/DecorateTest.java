package package5;

public class DecorateTest {

	public static void main(String[] args) {
		Computer computer = new LenoveComputer();
		computer = new RealDecorate1(computer);
		computer = new RealDecorate2(computer);
		computer.introduce();
	}

}
