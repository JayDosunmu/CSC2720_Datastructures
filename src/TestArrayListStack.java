import java.util.Arrays;
import java.util.EmptyStackException;


public class TestArrayListStack {

	public static void test() {
		System.out.println("====================================\n");
		System.out.println("==== Testing Stack Operations... ===\n");
		System.out.println("====================================\n");

		// Create new stack
		System.out.println("Create stack:");
		ArrayListStack stack1 = new ArrayListStack();
		System.out.println("Stack created: "+stack1.list().toArray());
		// ArrayListStack stack2 = new ArrayListStack();
		
		// Test push method
		System.out.println("\nPush to stack:");
		stack1.push(5);
		System.out.println("Pushed 5");
		System.out.println(Arrays.toString(stack1.list().toArray()));
		stack1.push(10);
		System.out.println("Pushed 10");
		stack1.push(3);
		System.out.println("Pushed 3");
		System.out.println(Arrays.toString(stack1.list().toArray()));
		
		// Test peek and pop
		System.out.println("\nPeek top of stack and pop:");
		System.out.println("Current top of stack: " + stack1.peek());
		int popped = stack1.pop();
		System.out.println("Popped item: " + popped);
		System.out.println("New top of stack: " + stack1.peek());
		
		try {
			System.out.println("Testing behavior on popping empty stack");
			stack1.pop();
			stack1.pop();
			stack1.pop();
			
		} catch(EmptyStackException e) {
			System.out.println(e.getMessage());
			System.out.println("Successfully raised EmptyStackException");
		}

		System.out.println("\nArrayListStack test complete");
	}

}
