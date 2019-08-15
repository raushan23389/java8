import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        
        //using java 7
        
        TreeMap<String, Integer> treeMap=new TreeMap<>(unsortMap);
       // treeMap.forEach((k,v)->System.out.println(k+" "+v));
        
        //using java 8
        
        unsortMap.entrySet().parallelStream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x->System.out.println(x.getKey()+" "+x.getValue()));
        
        Map<String, Employee> unsortMapEmployee = new HashMap<>();
        unsortMapEmployee.put("z", new Employee(25, "kundan"));
        unsortMapEmployee.put("b", new Employee(21, "RAushan"));
        unsortMapEmployee.put("a", new Employee(33, "xyz"));
        unsortMapEmployee.put("c", new Employee(35, "wps"));
        
        unsortMapEmployee.values().parallelStream().sorted((e1,e2)->{ return e1.getAge()-e2.getAge();}).forEachOrdered(System.out::println);
        
  
        
        
	}

}
