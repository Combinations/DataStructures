
package Implementations;

import exceptions.EmptyCollectionException;

/**
 *
 * @author James
 */
public class cArrayQueue<T> implements QueueADT<T> {
    /**
     * Default capacity used for default constructor
     */
    private final int DEFAULT_CAPACITY = 100;
    /**
     * count: represents the number of elements in the queue
     * rear: used to index the last element in the queue. 
     * front: used to index the first element in the queue
     */
    private int count, rear, front;
    /**
     * declare the array that will store the elements for the queue. 
     */
    private T[] queue;
    
    /**
     * default constructor creates an array with default capacity and sets
     * front rear and count to zero. 
     */
    public cArrayQueue() {
        queue = (T[]) new Object[DEFAULT_CAPACITY];
        front = rear = count = 0;
    }
    /**
     * constructor creates an array with a capacity specified by the user
     * front, rear, and count set to zero.
     * @param INITAL_CAPACITY integer amount specified by the user to represent
     * the number of elements in the queue
     */
    public cArrayQueue(int INITAL_CAPACITY) {
        queue = (T[]) new Object[INITAL_CAPACITY];
        front = rear = count = 0;
    }
    /**
     * adds a new element to the queue indexed by rear. Checks to see if the
     * queue is full. 
     * In the case where the queue is full Complexity is O(n). Generally 
     * complexity is O(n). 
     * @param element 
     */
    @Override
    public void enqueue(T element) {
        if(size() == queue.length) {
            T[] temp = (T[]) new Object[queue.length * 2];
            for(int i = 0; i < count; i++) {
                temp[i] = queue[front];
                front = (front+1) % queue.length;
            }
            front = 0;
            rear = count;
            queue = temp;
        }
        queue[rear] = element;
        rear = (rear+1) % queue.length;
        count++;
    }
    /**
     * Removes an element from the indexed by front. Complexity is O(1).
     * @return the value stored in the variable index by front. 
     * @throws EmptyCollectionException if queue is empty. 
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if(isEmpty()) {
            throw new EmptyCollectionException ();
        }
        T result = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
        count--;
        
        return result;
    }
    /**
     * Checks the value stored in the element index by front. Complexity is O(1)
     * @return the value stored in the element indexed by front
     * @throws EmptyCollectionException if the collection is empty
     */
    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException ();
        } else {
        return queue[front];
        }
    }
    /**
     * checks to see if the queue is empty. Complexity is O(1). 
     * @return true or false if empty or not. 
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    /**
     * Checks the amount of elements in the queue. Complexity is O(1). 
     * @return an integer variable representing the amount of elements in
     * a queue
     */
    @Override
    public int size() {
        return count;
    }
    /**
     * String representation of the elements in the queue. Complexity is O(n)
     * 
     * @return a string representation of the elements in the queue. 
     */
    public String toString() {
        String returnValue = "";
        for(int i =0; i < queue.length; i++) {
            if(queue[i] != null) {
            returnValue = returnValue + queue[i] + " ";
            }
        }
        return returnValue;
    
}
}
