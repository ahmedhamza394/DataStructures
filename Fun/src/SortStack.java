import java.util.Stack;

public class SortStack {
	Hstack stack1 = new Hstack();
	Hstack stack2 = new Hstack();

	public void push(int data) {
		if (stack1.isEmpty()) {
			stack1.push(data);
		} else {
			if (data > (int) stack1.peek()) {
				while (data > (int) stack1.peek()) {
					stack2.push(stack1.pop());
					if (stack1.isEmpty()) {
						break;
					}
				}
				stack1.push(data);
				while (!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			}
			if (data <= (int) stack1.peek()) {
				stack1.push(data);
			}
		}
	}

	public void print() {
		stack1.print();
	}

}
