package core;

public interface IStack {
	int getSize();
	boolean isEmpty();
	boolean isFull();
	void push(Object A) throws Exception;
	Object pop();
	Object top();

}
