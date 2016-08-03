
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
public class MainGUI extends JFrame implements ActionListener {
 
    arrayStack<Integer> arrayStack = new arrayStack<>();
    linkedStack<Integer> listStack = new linkedStack<>();
    arrayQueue<Integer> arrayQueue = new arrayQueue<>();
    LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
    cArrayQueue<String> cArray = new cArrayQueue<>();
    /**
     * Buttons for arrayStack
     */
    private JButton arrayStackButton = null;
    private JButton arrayQueueButton = null;
    private JButton linkedQueueButton = null;
    private JButton linkedStackButton = null;
    private JButton carrayQueueButton = null;
    
    
    /**
     * A temporary GUI component for validating data
     */
  //  protected JTextArea verifyArea = new JTextArea(20, 35);
    
    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
       
        MainGUI frame = new MainGUI();
        frame.setSize(1500, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Constructor creates the SimpleGUI frame with a title
     */
    public MainGUI() {
        super("Data Structures");
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
        
       // JScrollPane p = new JScrollPane(verifyArea);
        
        c.add(buttonPanel, BorderLayout.CENTER);
        //c.add(p, BorderLayout.SOUTH);

        arrayStackButton = new JButton("ArrayStack");
        arrayQueueButton = new JButton("ArrayQueue");
        linkedStackButton = new JButton("LinkedStack");
        linkedQueueButton = new JButton("LinkedQueue");
        carrayQueueButton = new JButton("Circular Array Queue");
        
        buttonPanel.add(arrayStackButton);
        buttonPanel.add(arrayQueueButton);
        buttonPanel.add(linkedStackButton);
        buttonPanel.add(linkedQueueButton);
        buttonPanel.add(carrayQueueButton);
        
        
        arrayStackButton.addActionListener(this);
        arrayQueueButton.addActionListener(this);
        linkedStackButton.addActionListener(this);
        linkedQueueButton.addActionListener(this);
        carrayQueueButton.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        Object object = ev.getSource();
       if (object == arrayStackButton) {
        ArrayStackGUI arrayStackFrame = new ArrayStackGUI();
        arrayStackFrame.setSize(550, 700);
        
       }
    }
}
