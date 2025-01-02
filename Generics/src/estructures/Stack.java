package estructures;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

	private List<T> stack = new ArrayList<>();
	
	public void push(T item) {
		stack.add(item);
	}

	@Override
	public String toString() {
		return stack.toString();
	}
}
