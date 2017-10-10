package ucl.cs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;


public class RecentlyUsedListTest {
	
	@Test
	public void initialisedListIsEmpty(){
		assertThat(new RecentlyUsedList().length(), is(0));
	
	}
	
	@Test
	public void addedElementToList(){
		
		RecentlyUsedList bob = new RecentlyUsedList();
		Object obj = new Object();
		bob.addElement(obj);
		assertThat(bob.list.isEmpty(), is(false));
		
	}
	
	@Test
	public void retrievesElementFromTheGivenList(){
		RecentlyUsedList jon = new RecentlyUsedList();
		Object objs = new Object();
		jon.addElement(objs);
		assertThat(jon.retrieveElement(0), is(jon.list.get(0)));
	
	}


}
