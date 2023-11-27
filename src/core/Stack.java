package core;

public class Stack implements IStack {
	
	private int elm;
	private int maxTop;
	private Object values[];
	
	public Stack() {
		elm = -1;
		maxTop = elm;
	}
	
	Stack(int size){
		values = new Object[size];
		elm = -1;
		maxTop = size + elm;
	}

	@Override
	public int getSize() {
		return maxTop+1 ;
	}

	@Override
	public boolean isEmpty() {
		return elm == -1 ;
	}

	@Override
	public boolean isFull() {
		return elm == maxTop;
	}

	@Override
	public void push(Object A) throws Exception {
		if (isFull()) {
            throw new Exception("Error: the stack is full.");
        } 
		else {
            if (elm == -1 || values[elm].getClass().equals(A.getClass())) {
                values[++elm] = A;
            } 
            else {
                throw new Exception("All elements in the stack must be of the same type.");
            }
        }
	}

	@Override
	public Object pop() {
		return values[elm--];
	}

	@Override
	public Object top() {
		if (isEmpty()) {
			System.out.println("Error: the stack is empty.");
			return -1;
		} else
			return values[elm];
	}

}
