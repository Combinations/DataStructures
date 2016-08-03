
package Implementations;

import exceptions.EmptyCollectionException;

/**
 *
 * @author James
 */
public class LinkedQueue<T> implements QueueADT<T> {
    /**
     * counter variable that keeps track of the number of elements in the queue
     */
    int count = 0;
    /**
     * reference to the most recently added element to 
     * the queue
     */
    SinglyLinkedNode<T> rear = new SinglyLinkedNode<>();
    /**
     * reference to the element that is at the front of the queue
     */
    SinglyLinkedNode<T> front = new SinglyLinkedNode<>();

    /**
     * default constructor initializes the references of rear and front to null
     */
    public LinkedQueue() {
        front = rear = null;
    }
    /**
     * adds a new element to the queue. In the case that the queue is empty 
     * front is referenced to the new element and rear is referenced to temp. 
     * Else rear next variable is set to temp and rear is referenced to temp. 
     * count is incremented. Complexity is O(1). 
     * @param element the element to be added to the queue.  
     */
    @Override
    public void enqueue(T element) {
        SinglyLinkedNode temp = new SinglyLinkedNode<>(element);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.setNext(temp);
        }
        rear = temp;
        count++;
    }
    /**
     * Removes the element referenced by the front node. Complexity is O(1). In 
     * the case that the queue is empty after removing the element rear is 
     * referenced to null. 
     * @return the value stored in the element variable referenced by front.
     * @throws EmptyCollectionException if the queue is empty. 
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        T returnValue = front.getElement();
        front = front.getNext();
        count--;

        if (isEmpty()) {
            rear = null;
        }

        return returnValue;
    }
    /**
     * Checks the element at the front of the queue. Complexity is O(1). 
     * @return the value in the element variable referenced by front. 
     * @throws EmptyCollectionException if the queue is empty. 
     */
    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        return front.getElement();
    }
    /**
     * Determines if the queue is empty. Complexity is O(1). 
     * @return true or false if empty or not 
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    /**
     * Determines the amount of elements stored in the queue. Complexity is 
     * O(1)
     * @return the counter variable. 
     */
    @Override
    public int size() {
        return count;
    }
    /**
     * Gives a string representation of the elements stored in the Queue. 
     * Complexity is O(n). 
     * @return a string representation of the elements in the queue.
     */
    public String toString() {
        String returnValue = "";
        SinglyLinkedNode<T> current = front;
        for(int i =0; i < count; i++) {
           if(current.getElement() != null) {
            returnValue = returnValue + current.getElement() + " ";
           current = current.getNext();
           } 
        }
        return returnValue;
    }

}
