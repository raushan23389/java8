import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorGroupingByExample {
	
	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("raushan","kundan","jdhjd","raushan","kundan","jdhjd");
		
		Map<String,Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
	}
}
