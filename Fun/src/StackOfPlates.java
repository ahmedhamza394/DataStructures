import java.util.ArrayList;

public class StackOfPlates {
	int maxsize;
	int size = 0;
	int index = 0;
	ArrayList<Hstack> StackList = new ArrayList<>();

	public StackOfPlates(int capacity) {
		this.maxsize = capacity;
	}

	public void push(int data) {
		if (StackList.isEmpty() || size >= maxsize) {
			if (size >= maxsize) {
				index++;
				size = 0;
			}
			Hstack stack = new Hstack();
			StackList.add(stack);
			stack.push(data);
			size++;

		} else {
			StackList.get(index).push(data);
			size++;
		}

	}

	public int pop() {
		int x = StackList.get(index).pop();
		size--;
		if (StackList.get(index).isEmpty()) {
			StackList.remove(index);
			index--;
			size = maxsize;
		}
		return x;

	}

	public int popAt(int i) {
		int x = StackList.get(i).pop();
		return x;
	}

	public void print() {

		for (int i = 0; i <= index; i++) {
			StackList.get(i).print();
		}

	}
}
