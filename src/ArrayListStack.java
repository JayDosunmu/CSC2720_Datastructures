import java.util.ArrayList;
import java.util.EmptyStackException;


public class ArrayListStack {
	
	private ArrayList<Integer> stack;

	public ArrayListStack() {
		this.stack = new ArrayList<Integer>();
		
	}
	
	public int peek() {
		if (this.stack.size() == 0) {
			throw new EmptyStackException();
		}
		int top = this.stack.size()-1;
		int output = this.stack.get(top);
		
		return output;
		
	}
	
	public int pop() {
		if (this.stack.size() == 0) {
			throw new EmptyStackException();
		}
		int top = this.stack.size()-1;
		int output = this.stack.get(top);
		this.stack.remove(top);
		
		return output;
		
	}
	
	public void push(int num) {
		this.stack.add(num);
		
	}
	
	public ArrayList<Integer> list() {
		return this.stack;
		
	}

}
