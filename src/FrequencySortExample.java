import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencySortExample {
	
	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,2,4);
	
	Map<Integer,Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	System.out.println(result);

}
}
