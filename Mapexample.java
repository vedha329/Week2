package week3.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,2,1,3,2,5};
		int temp =1;
		
				Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
				for(int i =0; i < number.length; i++) {
					
				if(map.containsKey(number[i])){
					
				map.put(number[i], temp+1);
				}
				else
				{
				map.put(number[i], temp);
				}
				}
				System.out.println(map);
				
	for(Entry<Integer, Integer> entry :map.entrySet())
	{
	if(entry.getValue()==1)
	System.out.println(entry.getKey());
	}
	}
}
