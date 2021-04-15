import java.util.Stack;

public class ErroBobo {

	public static void main(String args[]) {
		int a, b, c;

		Stack<Integer> pilha = new Stack<Integer>();

		a = 2;
		b = 0;
		c = 0;

		try {
			//c = a / b;
			pilha.pop();
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			c = 0;
		} catch (EmptyStackException ese) {
		}



		System.out.println(c);

	}
}
