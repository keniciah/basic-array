public class BasicArray {
	private int[] exampleArray;
	private int length;
	
	public BasicArray(int length) {
		this.setLength(length);
		exampleArray = new int[length];
		fillArray();
	}
	
	private void fillArray() {
		for(int i = 0; i < exampleArray.length; i++) {
			exampleArray[i] = (int)( Math.random() * 10) + 1;
		}
	}
	
	public void printArray() {
		System.out.println("Array:");
		for(int i = 0; i < exampleArray.length; i++) {
			System.out.print(exampleArray[i] + " ");
		}
		System.out.println("");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
