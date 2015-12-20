import org.junit.Assert;
import org.junit.Test;
import java.util.*;
public class ElementaryTests {
	
	@Test
	public void testSizeofCollection() {
		List<Object> obj = new ArrayList<Object>();
		Assert.assertEquals(0, obj.size());	
	}
	
	@Test
	public void testSynchronizedListHasSameContents() {
	       List<String> list = new ArrayList<String>();
	       list.add("Rick");
	       list.add("John");
	       list.add("Matt");

	       List<String> synchronizedList = Collections.synchronizedList(list);
	       for (int i = 0; i < list.size(); i++) {
	           Assert.assertEquals(list.get(i), synchronizedList.get(i));
	       }
	   }
	
	@Test
	public void testListAdd() {
        List<String> list = new ArrayList<String>();
        Assert.assertFalse(list.contains("hello"));
        list.add("hello");
        Assert.assertTrue(list.contains("hello"));
    }
	
	@Test
	public void testListIsNull() {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		Assert.assertNotNull("Collection is not empty", list);
	}
	
	@Test(expected = Throwable.class)
	public void exceptionThrows() throws Exception{
		if(true) throw new Exception();
	}
}
