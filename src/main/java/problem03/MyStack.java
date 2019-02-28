package problem03;

import java.util.Stack;

public class MyStack {
	
	private String[] buffer;
	
	protected Integer top;      //필드 추가.
	protected String [] stack;  //필드 추가.
	protected Integer size;     //필드 추가.
	
	public MyStack( int size ) {
		top = -1;
		stack = new String[size+3];
		this.size = size + 3;		
	}
	
	public void push(String item) {		
		stack[top++] = item;
	}

	public String pop() {
		String strRtn = stack[top];
		top--;
		return strRtn;
	}

	public boolean isEmpty() {
		boolean bRnt;
		if (stack.length == 0)
			bRnt = true;
		else
			bRnt = false;
		
		return bRnt;
	}
	
	public int size() {
		return 0;
	}
}