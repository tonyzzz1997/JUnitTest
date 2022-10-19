package test;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul (int a, int b) {
		return a * b;
	}
	public int dev (int a, int b) throws Exception {
		if(b == 0) {
			throw new Exception("by zero");
		}
		return Math.ceilDiv(a, b);
	}
}

