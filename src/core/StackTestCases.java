package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	
	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		assertEquals(true, s1.isEmpty()); 
		assertEquals(0, s1.getSize());
	}
	
	//TC2
	public void testPushStack() throws Exception {
		Stack s2 = new Stack(10);
		try {
		    s2.push(1);
		    s2.push(2);
		} 
		catch (Exception e) {
		}
		assertEquals(2, s2.top()); 
	}
	
	//TC3
	public void testPushTypeInStack() throws Exception {
		Stack s3 = new Stack(10);
		try {
            s3.push(1);
            s3.push("A");
        } 
		catch (Exception e) {
			assertEquals("All elements in the stack must be of the same type.", e.getMessage());		}
        }
			
	//TC4
	public void testLastInFirstOut() throws Exception {
		Stack s4 = new Stack(10);
		try {
            s4.push(1);
            s4.push(2);
        } 
		catch (Exception e) {
        }
		assertEquals(2, s4.pop());
		assertEquals(1, s4.pop()); 
	}
	
	//TC5
	public void testFullStack() throws Exception {
		Stack s5 = new Stack(2);
		try {
            s5.push(1);
            s5.push(2);
            s5.push(3);
        } catch (Exception e) {
        	assertEquals("Error: the stack is full.", e.getMessage());
        }
		assertEquals(2, s5.pop()); 
	}

}
