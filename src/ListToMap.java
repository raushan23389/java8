import java.util.*;
import java.util.stream.Collectors;


public class ListToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(27, "raushan"));
		list.add(new Employee(22, "kundan"));
		list.add(new Employee(28, "sumit"));
		list.add(new Employee(23, "rahul"));
		list.add(new Employee(25, "chumma"));
		list.add(new Employee(26, "raus"));
		
		
		//first way
		//Map<Integer,String> map1 = list.stream().collect(Collectors.toMap(Employee::getAge,Employee::getName));
		
		
		//2nd way to convert into map
		Map<Integer,String> map1 = list.stream().collect(Collectors.toMap(x->x.getAge(),x->x.getName()));
		
		
		System.out.println(map1);

	}

}




