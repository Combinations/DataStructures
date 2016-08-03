
package GUI;



import Implementations.arrayQueue;
import Implementations.arrayStack;
import Implementations.cArrayQueue;
import Implementations.LinkedQueue;
import Implementations.linkedStack;
import exceptions.EmptyCollectionException;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;

/**
 * SimpleGUI.java This program uses variety of GUI objects and it allows the
 * user to interact with the objects.
 */
public class GUI extends JFrame implements ActionListener {
 
    arrayStack<Integer> arrayStack = new arrayStack<>();
    linkedStack<Integer> listStack = new linkedStack<>();
    arrayQueue<Integer> arrayQueue = new arrayQueue<>();
    LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
    cArrayQueue<String> cArray = new cArrayQueue<>();
    /**
     * Buttons for arrayStack
     */
    private JButton arrayStackPush = null;
    private JButton arrayStackPop = null;
    private JButton arrayStackPeek = null;
    private JButton arrayStackSize = null;
    private JButton arrayStackDisplay = null;
    /**
     * Buttons for listStack
     */
    private JButton listStackPush = null;
    private JButton listStackPop = null;
    private JButton listStackPeek = null;
    private JButton listStackSize = null;
    private JButton listStackDisplay = null;
    
    /**
     * Buttons for arrayQueue
     */
    private JButton arrayQueueEnqueue = null;
    private JButton arrayQueueDequeue = null;
    private JButton arrayQueueFirst = null;
    private JButton arrayQueueSize = null;
    private JButton arrayQueueDisplay = null;
    
    /**
     * Buttons for listQueue
     */
    private JButton listQueueEnqueue = null;
    private JButton listQueueDequeue = null;
    private JButton listQueueFirst = null;
    private JButton listQueueSize = null;
    private JButton listQueueDisplay = null;
    
    
    /**
     * Buttons for cArrayQueue
     */
    private JButton cArrayQueueEnqueue = null;
    private JButton cArrayQueueDequeue = null;
    private JButton cArrayQueueFirst = null;
    private JButton cArrayQueueSize = null;
    private JButton cArrayQueueDisplay = null;
   
    /**
     * A temporary GUI component for validating data
     */
    protected JTextArea verifyArea = new JTextArea(20, 35);
    
    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
       
        GUI frame = new GUI();
        frame.setSize(1500, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Constructor creates the SimpleGUI frame with a title
     */
    public GUI() {
        super("Data types");
        createGUI();
    }

    /**
     * method createGUI creates GUI objects and adds them to the frame
     */
    private void createGUI() {
        
       
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout(0, 0)); // 5 pixels hor and vert gap
    
        JPanel buttonPanel = new JPanel();  //contains buttons
        buttonPanel.setLayout(new GridLayout(5, 5, 0, 0));
        
        JScrollPane p = new JScrollPane(verifyArea);
        
        c.add(buttonPanel, BorderLayout.CENTER);
        c.add(p, BorderLayout.SOUTH);

        arrayStackPush = new JButton("ArrayStack: Push");
        arrayStackPop = new JButton("ArrayStack: Pop");
        arrayStackPeek = new JButton("ArrayStack: Peek");
        arrayStackSize = new JButton("ArrayStack: Size");
        arrayStackDisplay = new JButton("ArrayStack: Display");
        
        listStackPush = new JButton("ListStack: Push");
        listStackPop = new JButton("ListStack: Pop");
        listStackPeek = new JButton("ListStack: Peek");
        listStackSize = new JButton("ListStack: Size");
        listStackDisplay = new JButton("ListStack: Display");
        
        arrayQueueEnqueue = new JButton("ArrayQueue: Enqueue");
        arrayQueueDequeue = new JButton("ArrayQueue: Dequeue");
        arrayQueueFirst = new JButton("ArrayQueue: First");
        arrayQueueSize = new JButton("ArrayQueue: Size");
        arrayQueueDisplay = new JButton("ArrayQueue: Display");
        
        listQueueEnqueue = new JButton("listQueue: Enqueue");
        listQueueDequeue = new JButton("listQueue: Dequeue");
        listQueueFirst = new JButton("listQueue: First");
        listQueueSize = new JButton("listQueue: Size");
        listQueueDisplay = new JButton("listQueue: Display");
        
        cArrayQueueEnqueue = new JButton("Circular ArrayQueue: Enqueue");
        cArrayQueueDequeue = new JButton("Circular ArrayQueue: Dequeue");
        cArrayQueueFirst = new JButton("Circular ArrayQueue: First");
        cArrayQueueSize = new JButton("Circular ArrayQueue: Size");
        cArrayQueueDisplay = new JButton("Circular ArrayQueue: Display");
        
        
        buttonPanel.add(arrayStackPush);
        buttonPanel.add(listStackPush);
        buttonPanel.add(arrayQueueEnqueue);
        buttonPanel.add(listQueueEnqueue);
        buttonPanel.add(cArrayQueueEnqueue);
        
        buttonPanel.add(arrayStackPop);
        buttonPanel.add(listStackPop);
        buttonPanel.add(arrayQueueDequeue);
        buttonPanel.add(listQueueDequeue);
        buttonPanel.add(cArrayQueueDequeue);
        
        buttonPanel.add(arrayStackPeek);
        buttonPanel.add(listStackPeek);
        buttonPanel.add(arrayQueueFirst);
        buttonPanel.add(listQueueFirst);
        buttonPanel.add(cArrayQueueFirst);
        
        buttonPanel.add(arrayStackSize);
        buttonPanel.add(listStackSize);
        buttonPanel.add(arrayQueueSize);
        buttonPanel.add(listQueueSize);
        buttonPanel.add(cArrayQueueSize);
        
        buttonPanel.add(arrayStackDisplay);
        buttonPanel.add(listStackDisplay);
        buttonPanel.add(arrayQueueDisplay);
        buttonPanel.add(listQueueDisplay);
        buttonPanel.add(cArrayQueueDisplay);
        
        arrayStackPush.addActionListener(this);
        arrayStackPop.addActionListener(this);
        arrayStackPeek.addActionListener(this);
        arrayStackSize.addActionListener(this);
        arrayStackDisplay.addActionListener(this);
        
        listStackPush.addActionListener(this);
        listStackPop.addActionListener(this);
        listStackPeek.addActionListener(this);
        listStackSize.addActionListener(this);
        listStackDisplay.addActionListener(this);
        
        arrayQueueEnqueue.addActionListener(this);
        arrayQueueDequeue.addActionListener(this);
        arrayQueueFirst.addActionListener(this);
        arrayQueueSize.addActionListener(this);
        arrayQueueDisplay.addActionListener(this);
        
        listQueueEnqueue.addActionListener(this);
        listQueueDequeue.addActionListener(this);
        listQueueFirst.addActionListener(this);
        listQueueSize.addActionListener(this);
        listQueueDisplay.addActionListener(this);
        
        cArrayQueueEnqueue.addActionListener(this);
        cArrayQueueDequeue.addActionListener(this);
        cArrayQueueFirst.addActionListener(this);
        cArrayQueueSize.addActionListener(this);
        cArrayQueueDisplay.addActionListener(this);
        
        

        
        setVisible(true);
    }

    /**
     * Responds to the "Display" and "Add" buttons
     *
     * @param ev Returns the command string associated with this action.
     */
    public void actionPerformed(ActionEvent ev) {
        Object object = ev.getSource();

       if (object == arrayStackPush) {
        int pushValue = Integer.parseInt(JOptionPane.showInputDialog
        ("Input value to be pushed:"));
         arrayStack.push(pushValue);
       }
       else if (object == arrayStackPop) {
           int poppedValue;
           try { 
            poppedValue = arrayStack.pop();
            verifyArea.append("Array Stack Value popped: " + poppedValue + "\n");
          
          }catch(EmptyCollectionException e) {
              JOptionPane.showMessageDialog(null, 
                      "There are no elements in stack array");
          }
          
       } else if (object == arrayStackPeek) {
           try { 
               verifyArea.append("Array Stack peek value: " + 
                       arrayStack.peek() + "\n");
           
           } catch(EmptyCollectionException e) {
             JOptionPane.showMessageDialog(null, "Array Stack has no "
                     + "elements!");    
                   }
       } 
       else if (object == arrayStackSize) {
           verifyArea.append("Stack Array number of elements: " + 
                   arrayStack.size() + "\n");
       }
       

        else if (object == arrayStackDisplay) {
           verifyArea.append("Array Stack: " + arrayStack.toString() + "\n");
         
            
        } else if (object == listStackPush) {
            int pushValue = Integer.parseInt(JOptionPane.showInputDialog
        ("Input value to be pushed:"));
            listStack.push(pushValue);
        } else if (object == listStackPop) {
            int poppedValue;
            try {
                poppedValue = listStack.pop();
                verifyArea.append("Value popped: " + poppedValue + "\n");
                
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, 
                      "There are no elements in stack array");
            }
            
           
        } else if (object == listStackPeek) {
            try {
                verifyArea.append("List Stack peek value: " + listStack.peek()
                        + "\n");
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, "List Stack is empty!");
            }
        }else if (object == listStackSize) {
            verifyArea.append("List Stack Size: " + listStack.size());
        }
        
        
        else if (object == listStackDisplay) {
            verifyArea.append("List Stack: " + listStack.toString() + "\n");
        }
       
        else if(object == arrayQueueEnqueue) {
            int value = Integer.parseInt(JOptionPane.showInputDialog
        ("Input value you want to add: "));
            arrayQueue.enqueue(value);
        }
        else if (object == arrayQueueDequeue) {
            
            try {
                verifyArea.append("Array Queue value dequeued: " + 
                        arrayQueue.dequeue() +" \n");
                
                
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, "No Element in Queue");
            }
        }
        else if (object == arrayQueueFirst) {
            try {
            verifyArea.append("Array Queue First: " + arrayQueue.first() + "\n");
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, "No elements in queue");
            }
        }
        else if (object == arrayQueueSize) {
            verifyArea.append("Array Queue Size:" + arrayQueue.size() + "\n");
        }
        else if(object == arrayQueueDisplay) {
            verifyArea.append("Array Queue: " + arrayQueue.toString() + "\n");
        }
        else if(object == listQueueEnqueue) {
            int enqueueValue = Integer.parseInt(JOptionPane.showInputDialog
        ("Input value: "));
            linkedQueue.enqueue(enqueueValue);
        }
        else if(object == listQueueDequeue) {
            try {
            verifyArea.append("Linked Queue value dequeued: " + 
                    linkedQueue.dequeue()+ "\n");
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, "Linked Queue is empty!" + "\n");
            }
        }
        else if(object == listQueueFirst) {
            try {
            verifyArea.append("Linked Queue First: " + linkedQueue.first() + "\n");
            }
            catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, "Linked Queue is empty!" + "\n");
            }
        }
        else if (object == listQueueSize) {
            verifyArea.append("Linked Queue Size: " + linkedQueue.size() + "\n");
                    
                    }
        
        else if (object == listQueueDisplay) {
            verifyArea.append("Linked Queue: " + linkedQueue.toString() + "\n");
        }
        else if (object == cArrayQueueEnqueue) {
            String value = JOptionPane.showInputDialog
        ("Enter input string: ");
            cArray.enqueue(value);
        }
        else if(object == cArrayQueueDequeue) {
            try {
            verifyArea.append("Circular Array string dequeued: " + 
                    cArray.dequeue() + "\n");
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null,
                        "Circular Array Queue is empty!");
            }
        }
        else if(object == cArrayQueueFirst) {
            try {
            verifyArea.append("Circular Array string first: " + cArray.first()
                    + "\n");
            }catch(EmptyCollectionException e) {
                JOptionPane.showMessageDialog(null, "Array is empty!");
            }
        }
        else if(object == cArrayQueueSize) {
            verifyArea.append("Circular Array size: " + cArray.size() + "\n");
        }
        else if(object == cArrayQueueDisplay) {
            verifyArea.append("Circular Array: " + cArray.toString() + "\n");
        }
    }

}


