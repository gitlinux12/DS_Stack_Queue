package Stack_Queue;
import java.util.*;
public class PeakandPop {private class Node {

	int data;
	Node link;
}

Node top;

PeakandPop() {
	this.top = null;
}

@SuppressWarnings("unused")
public void push(int x) {
	Node temp = new Node();
	if (temp == null) {
		System.out.print("\nHeap Full");
		return;
	}
	temp.data = x;

	temp.link = top;
	top = temp;
}

public void display() {
	if (top == null) {
		System.out.printf("\nStack Empty");

	} else {
		Node temp = top;
		while (temp != null) {
			System.out.printf("Node-> %d  ", temp.data);
			temp = temp.link;
		}
	}
}

public void pop() {
	if (top == null) {
		System.out.print("\nStack Empty");
		return;
	}
	top = (top).link;
	System.out.println("\n");
}

public static void main(String[] args) {
	Stack<Integer> STACK = new Stack<Integer>();
	STACK.push(70);
	STACK.push(30);
	STACK.push(56);
	System.out.println("Initial Stack: " + STACK);
	System.out.println("The element at the top of the"+ " stack is: " + STACK.peek());
	STACK.pop();
	System.out.println("Final Stack: " + STACK);
	System.out.println("The element at the top after pop" + " stack is: " + STACK.peek());

}

}
