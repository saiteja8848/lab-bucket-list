package service;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import model.TouristPlace;

public class ListOperations{
	
	private static List<TouristPlace> list = new ArrayList<>();
	
	  public List<TouristPlace> add(TouristPlace places) {
		  list.add(places);
		  return list;
	  }
	  
	  public List<TouristPlace> remove(TouristPlace places) {
	      if(list.size()!=0) 
		  list.remove(list.size()-1);
		  return list;
	  }
	  
	  public Object sortByDestination() {
	     
		  Set<String> places = new LinkedHashSet<>();
		  for(int i=0;i<list.size();i++)
		  {
			  places.add(list.get(i).getDestination());
		  }
		  System.out.println(places);
		  
		  return null;
	  }
	  
	  public Object sortByRank(List places) {
	   return null;
	  }
	  
	  public Object reset(List places) {
	  return null;
	  }
	 
}