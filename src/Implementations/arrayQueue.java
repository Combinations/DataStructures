
package Implementations;

import exceptions.EmptyCollectionException;

/**
 *
 * @author James
 */
public class arrayQueue<T> implements QueueADT<T>{
    /**
     * integer variable that keeps count of the number of elements in the queue
     * and provides the index for added an element to the queue
     */
    int rear = 0;
    /**
     * declare the array that will store elements 
     */
    T[] arrayQueue;
  
    /**
     * Default constructor that initializes an array with 100 spaces. 
     */
    public arrayQueue () {
         arrayQueue = (T[]) new Object[100];
    }
    /**
     * Adds a new element to the queue. The elements position in the array is
     * determined by the rear value. Complex is generally O(1). In the case 
     * where the array is full complexity is O(n). 
     * @param element 
     */
    @Override
    public void enqueue(T element) {
        
        if(rear == arrayQueue.length) {
            T[] temp = (T[]) new Object[rear*2];
            for(int i =0; i < rear; i++) {
                temp[i] = arrayQueue[i];
            }
            arrayQueue = temp;
            arrayQueue[rear] = element;
            rear++;
        }
        arrayQueue[rear] = element;
        rear++;
        
    }
    /**
     * Removes an element from the queue and returns its value. Elements are
     * shifted back to the 'front' thus complexity is O(n). 
     * @return the value stored in front (first index of the array). 
     * @throws EmptyCollectionException 
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException();
        }
        T returnVariable = arrayQueue[0];
        arrayQueue[0] = null;
        for(int i =0; i < rear; i++) {
            arrayQueue[i] = arrayQueue[i+1];
        }
        rear--;
        return returnVariable;
    }
    /**
     * checks what is stored in the front of the queue. complexity is O(1). 
     * @return the value stored in the front of the queue
     * @throws EmptyCollectionException if queue is empty. 
     */
    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException();
        }
        return arrayQueue[0];
    }
    /**
     * checks if the queue is empty. Complexity is O(1). 
     * @return true or false depending if empty or not. 
     */
    @Override
    public boolean isEmpty() {
        return rear == 0;
    }
    /**
     * Checks the amount of elements in the queue. Complexity i O(1).
     * @return the amount of elements in the queue. 
     */
    @Override
    public int size() {
        return rear;
    }
    /**
     *  a string representation of the queue. Complexity is O(n). 
     * @return a string representation of the elements in the queue. 
     */
    public String toString() {
        String returnValue = "";
        for(int i =0; i < rear; i++) {
            returnValue = returnValue + arrayQueue[i] + " ";
        }
      return returnValue;
    }
}
