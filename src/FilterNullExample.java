import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullExample {

	public static void main(String[] args) {
		
		Stream<String> st = Stream.of("java","ruby","python","rail",null,null);
		
		//Without filtering null
		//List<String> list = st.collect(Collectors.toList());
		
		//filtering null value
		//List<String> list = st.filter(x->x!=null).collect(Collectors.toList());
		
		//another approach of filtering
		List<String> list = st.filter(Objects::nonNull).collect(Collectors.toList());
		
		list.forEach(System.out::println);

	}

}
