import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = {"A","b","c","d","e"};
		
		//converting stream into Array
		
		Stream<String> stream1 = Stream.of(array);
		
		//2nd way
		
		Stream<String> stream2 = Arrays.stream(array);
		
		stream2.forEach(x->System.out.println(x));
		
		stream1.forEach(System.out::println);
		
		//fitering "b"
		List<String> list = stream1.filter(x->x!="b").collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
