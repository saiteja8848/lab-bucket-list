package service;



import java.util.HashMap;
import java.util.Map;

import model.TouristPlace;

public class MapOperations{

	private static int i=0;
	private static Map<Integer,TouristPlace> map = new HashMap<Integer,TouristPlace>(); 
	
	public Map<Integer,TouristPlace> add(TouristPlace places) {
		
	 	  map.put(Integer.parseInt(places.getRank()),places);
	 	  System.out.println(map);
	 	  return map;
	 }
		
		
	public Map<Integer,TouristPlace> remove(TouristPlace places) {
		map.remove(Integer.parseInt(places.getRank()));
		return map;
	}
//	public Object sortByDestination(List places) {
//		
//	}
//	public Object sortByRank(List places) {
//		
//	}
//	public Object reset(List places) {
//		
//	}
	
	
}