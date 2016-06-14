import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence = input.nextLine();
		Stack<String> stack = new Stack<String>();
		String[] temp;
		temp = sentence.split(" ");
		for (int i = 0; i < temp.length; i++) {
			stack.push(temp[i]);
		}
		System.out.println("\nOriginal string: " + sentence);
		System.out.print("Reverse word string: ");
		while (!stack.empty()) {
			System.out.print(stack.pop());
			System.out.print(" ");
		}
		input.close();
	}
}
