import java.util.stream.Stream;

public class ReuseStreamExample {
	
	public static void main(String[] args) {
		String[] array = {"raushan","kundan","sumit"};
		
		Stream<String> stream = Stream.of(array);
		
		stream.forEach(System.out::println);
		
		//reusing same stream
		
		stream.forEach(System.out::println);
		
	}

}
