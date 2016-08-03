
package Implementations;

import exceptions.EmptyCollectionException;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Array implementation of a stack interface
 *
 * @author James
 */
public class arrayStack<T> implements Stack<T> {

    /*
    Top variable points to next open space in array. Is equal to the number 
    of elements in the array. 
    */
    protected int top = 0;
    /**
     * default array size for constructor.
     */
    private final int DEFAULT = 100;
    /**
     * declare array of type T to store objects.
     */
    protected T[] array;
    
    /*
    Default constructor 
    */
    public arrayStack() {
        array = (T[]) new Object[DEFAULT];
    }
    /**
     * Constructor that accepts a parameter to determine size of array
     * @param size provided by user to determine size of array.
     */
    public arrayStack(int size) {
        array = (T[]) new Object[size];
        
    }
    /**
     * pushes a new element to the stack at the index pointed to by top. 
     * Complexity of this method on average 0(1). Worst case is if the array 
     * is full it is O(n) because need to copy elements to a new array with
     * double the size.
     * @param pushvalue object pushed to the array.
     */
    @Override
     public void push(T pushvalue) {
        
        if (top == array.length) {
            T[] arraytemp = (T[]) new Object[array.length * 2];
            for (int i = 0; i < top; i++) {
                arraytemp[i] = array[i];
            }
            array = arraytemp;
            array[top] = pushvalue;
            top++;
        } else {
            array[top] = pushvalue;
            top++;

        }
    }
     /*
     Removes an element from the stack. Complexity is O(1). 
     @throws EmptyCollectionException if there are no elements in the stack. 
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException();
        }
        top--;
        T value = array[top];
        array[top] = null;
        return value;
    }

    /**
     * looks at the next value in the stack that is to be popped. Complexity 
     * is O(1). 
     * @return the object at the top of the stack
     * @throws EmptyCollectionException if the stack is empty
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException();
        }
        return array[top - 1];
        
    }
    /**
     * Checks to see if stack is empty. Complexity is O(1). 
     * @return true or false if stack is empty or full respectively. 
     */
    @Override
    public Boolean isEmpty() {
        return top == 0;
    }
    /**
     * Checks the number of elements in the stack. Complexity is O(1).
     * @return the number of elements in the stack
     */
    @Override
    public int size() {
        return top;
    }
    /**
     * produces a string representation of all the objects in the stack
     * Complexity is O(n). 
     * @return string representation of stack. 
     */
    public String toString() {
        String returnValue = "";
        for(int i = 0; i < top; i++) {
            returnValue = returnValue + array[i] + " ";
        }
        return returnValue;
    }
   
    }


