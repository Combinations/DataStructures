package Implementations;

import exceptions.EmptyCollectionException;

/**
 * Stack.java
 * This program defines the methods to be used when implementing a stack
 * @author James Leahy
 * @version
 */

public interface Stack<T> {
    
    void push(T element);
    
    T pop() throws EmptyCollectionException;
    
    T peek() throws EmptyCollectionException;
    
    Boolean isEmpty();
    
    int size();
         
     
}