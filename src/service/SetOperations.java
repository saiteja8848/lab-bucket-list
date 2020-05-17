package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations {
	
	private static TreeSet<TouristPlace> set = new TreeSet<>(); 
	
	 public List<TouristPlace> add(TouristPlace places) {
	    set.add(places);
	    List<TouristPlace> list = new ArrayList<>();
	    
	    Iterator<TouristPlace> itr = set.iterator();
	 while(itr.hasNext()){
	   list.add(itr.next());
	 }    
		 return list;
	 }
	 
	 
	 public TreeSet<TouristPlace> remove(TouristPlace places) {
		 set.remove(places);
		 return set;
	 }
	 
	 /* public Object sortByDestination(HashSet places) 
	 * public Object sortByRank(HashSet places) 
	 * public Object reset(HashSet places)
	 */
}