import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
	public static void main(String[] args) {
		
		//sort by name then age if name is same Employee using comparator
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(20, "Kundan"));
		list.add(new Employee(21, "raushan"));
		list.add(new Employee(22, "sumit"));
		list.add(new Employee(23, "janesh"));
		list.add(new Employee(19, "Kundan"));
		list.add(new Employee(25, "rahul"));
		
		//using java 7 way
		
		/*
		 * Collections.sort(list,new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { // TODO
		 * Auto-generated method stub if(o1.getName().compareTo(o2.getName())==0) {
		 * return o1.getAge()-o2.getAge();
		 * 
		 * }else return o1.getName().compareTo(o2.getName());
		 * 
		 * } });
		 */
		
		//how to sort in current stream
		list.stream().sorted((e1,e2)->{return e1.getName().compareTo(e2.getName());} ).forEach(System.out::println);
		
		list.forEach(System.out::println);
		
		//using java 8 comparator
		Collections.sort(list,(e1,e2)->{
			
			return e1.getName().compareTo(e2.getName());
			
			
				});
		
		
		
		
		list.forEach(System.out::println);
		
		List<String> listnew=list.stream().map(p->p.getName()).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		//is equivalent
		
		list.forEach(p->System.out.println(p));
		
	}


	
}

 class Employee{
	private int age;
	private  String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
}

