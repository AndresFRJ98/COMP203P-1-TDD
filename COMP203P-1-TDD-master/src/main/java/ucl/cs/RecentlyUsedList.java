package ucl.cs;

import java.util.ArrayList;

public class RecentlyUsedList {
	
	ArrayList<Object> list = new ArrayList<Object>();

	public int length() {
		
		return list.size();
	}
	
	public void addElement(Object i){
		
		list.add(i);
		

	}
	
	public Object retrieveElement(int i){
		return list.get(i);
	}
	


	
	
	
	

}
