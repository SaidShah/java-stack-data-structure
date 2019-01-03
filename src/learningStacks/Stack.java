package learningStacks;

public class Stack {

	private int maxSize;
	private int letterMaxSize;
	private int letterTop;
	private long[] stackArray;
	private char[] letterArray;
 	private int top;

	public Stack(int size,int lettersSize) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
		letterMaxSize = lettersSize;
		this.letterArray = new char[letterMaxSize];
		this.letterTop = -1;
		
	}
	
	public Stack(int size) {
		letterMaxSize = size;
		this.letterArray = new char[letterMaxSize];
		this.letterTop = -1;
		
	}
	
	public void pushLetter(char a) {
		if(isLetterFull()) {
			System.out.println("the Stack is full");
		}else {
		letterTop++;
		letterArray[letterTop]=a;
		}
	}
	
	public char popLetter() {
		if(isLetterEmpty()) {
			System.out.println(" letter array is empty ");
			return '0';
		}else {
		int oldLetterTop = letterTop;
		letterTop--;
		return letterArray[oldLetterTop];
		}
	}
	
	
	public void push(long j) {
		if(isFull()) {
			System.out.println("the Stack is full");
		}else {
		top++;
		stackArray[top]=j;
		}
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
			return top;
		}else {
		int oldTop = top;
		top--;
		return stackArray[oldTop];
		}
	}
	
	public long peek() {
		if(isEmpty()) {
			System.out.println(" the stack is empty ");
			return top;
		}else {
		return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isLetterEmpty() {
		return (letterTop==-1);
	}
	
	public boolean isFull() {
		return (maxSize-1==top);
	}
	
	public boolean isLetterFull() {
		return (letterMaxSize-1==top);
	}

}

















