import java.util.*;
import java.util.Map;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "kundan");
		map.put(2, "raushan");
		map.put(3, "sumit");
		map.put(4, "janesh");
		map.put(5, "kundan");
		
//		for(Map.Entry<Integer, String> mp : map.entrySet()) {
//			
//			System.out.println("key" + mp.getKey()+ "value" + mp.getValue());
		
		map.forEach((k,v)->{
			System.out.println(k);
			
		});
		
		//return  a list of array having names only
		
		
		}
	}


