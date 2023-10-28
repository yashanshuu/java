package generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("one", "two", "three");
		strings.set(0, "adsgad");
		System.out.println(strings);
//		strings.add(0,"zero");//run time err
		// Can you use Arrays.asList to create a growable AL/LinkedLIst/Vector : YES
		LinkedList<String> list = new LinkedList<String>
		(Arrays.asList("1", "2", "3"));
		list.add(0,"1234");
		System.out.println(list);

	}

}
