import java.util.concurrent.ThreadLocalRandom;

public class App {

	public static void main(String[] args) {
		ThreadLocalRandom.current()
		                 .ints(1,60)
		                 .distinct()
		                 .limit(6)
		                 .sorted()
		                 .forEach(System.out::println);
	}

}
