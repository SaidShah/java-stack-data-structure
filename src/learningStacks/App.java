package learningStacks;



public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(4,50);
		
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		theStack.push(120);
		theStack.push(220);
		
		
		System.out.println(theStack.isEmpty());
		System.out.println(theStack.isFull());
		System.out.println(theStack.peek());
		System.out.println();
		
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
		
		System.out.println(theStack.peek());
		
		theStack.pushLetter('h');
		theStack.pushLetter('e');
		theStack.pushLetter('l');
		theStack.pushLetter('l');
		theStack.pushLetter('o');
		
		while(!theStack.isLetterEmpty()) {
			char lett  = theStack.popLetter();
			System.out.print(lett);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("The word Peanuts in reverse is " + reverseString("Peanuts"));

	}
	
	
	
	
	
	public static String reverseString(String str) {
		
		int stackSize = str.length();
		Stack myStack2 = new Stack(stackSize);
		for(int j =0;j<str.length();j++) {
			char ch = str.charAt(j);
			myStack2.pushLetter(ch);
		}
		
		String result = "";
		while(!myStack2.isLetterEmpty()) {
			char tempLetter = myStack2.popLetter();
			result = result + tempLetter;			
		}
		return result;
	}
	

}
























