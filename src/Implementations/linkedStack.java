
package Implementations;

import exceptions.EmptyCollectionException;


/**
 *
 * @author James
 */
public class linkedStack<T> implements Stack<T>{
    /**
     * top variable of type SinglyLinkedNode that points to the most recently
     * added object to the stack.
     */
    SinglyLinkedNode<T> top = new SinglyLinkedNode<>();
    /**
     * Integer variable that keeps track of the number of elements in the stack. 
     */
    private int count = 0;
    
    
   /**
    * Pushes a new element to the stack by creating a new node. Complexity 
    * is O(1). 
    * @param element to be pushed to the top of the stack.  
    */ 
    @Override
    public void push(T element) {
        SinglyLinkedNode temp = new SinglyLinkedNode(element);
        temp.setNext(top);
        top = temp;
        count++;
        
    }
    /**
     * Removes the element that is referenced by top. Complexity is O(1). 
     * @return the object contained in the element variable referenced by top. 
     * @throws EmptyCollectionException if the stack is empty
     */
    @Override
    public T pop() throws EmptyCollectionException {
       T returnValue; 
        if(isEmpty()) {
            throw new EmptyCollectionException ();
        }  
          returnValue = top.getElement();
          top = top.getNext();
          count--;
          return returnValue;
    }
    /**
     * Looks at the element contained in the element variable referenced by top.
     * Complexity is O(1).
     * @return the element referenced by top 
     * @throws EmptyCollectionException if the stack is empty. 
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException();
        }
        T returnValue = top.getElement();
        return returnValue;
    }
    /**
     * Checks to see if the stack is empty. Complexity is O(1). 
     * @return the true or false depending on if the stack is empty or not. 
     */
    @Override
    public Boolean isEmpty() {
        return count == 0;
    }
    /**
     * returns the amount of elements stored in the stack. Complexity is O(1).
     * @return an integer value representing the number of elements in the stack
     */
    @Override
    public int size() {
        return count;
    }
    /**
     * Produces a string representation of a stack. Complexity is O(n). 
     * @return a string variable that contains the elements in the stack. 
     */
    public String toString() {
        SinglyLinkedNode current = top;
        String value = "";
        while(current.getElement() != null) {
            value = value + current.getElement() + " ";
            current = current.getNext();    
        }
     return value;
    }
}
