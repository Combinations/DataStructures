package GUI;

import Implementations.ArrayStackDraw;
import Implementations.arrayQueue;
import Implementations.arrayStack;
import Implementations.cArrayQueue;
import Implementations.LinkedQueue;
import Implementations.linkedStack;
import exceptions.EmptyCollectionException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author James
 */
public class ArrayStackGUI extends JFrame implements ActionListener {

    private JPanel drawPanel;

    private JTextField stackField;

    private Graphics g;

    protected JTextArea verifyArea = new JTextArea("\nMethods and commands\n "
            + "-----------------------------------------"
            + "-------------------------------------------------"
            + "--------------------" + "\n", 15, 20);

    private JButton pushButton, popButton, clearButton, createButton;
    private ArrayStackDraw<Integer> array;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStackGUI frame = new ArrayStackGUI();
        frame.setSize(550, 700);

    }

    public ArrayStackGUI() {
        super("ArrayStack");
        createGUI();

    }

    private void createGUI() {

        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        drawPanel = new JPanel();
        drawPanel.setPreferredSize(new Dimension(500, 300));
        drawPanel.setBackground(Color.white);
        window.add(drawPanel);

        createButton = new JButton("create array");
        pushButton = new JButton("Push");
        popButton = new JButton("Pop");
        clearButton = new JButton("Clear");

        stackField = new JTextField(5);
        window.add(stackField);

        window.add(stackField);
        window.add(createButton);
        window.add(pushButton);
        window.add(popButton);
        window.add(clearButton);

        createButton.addActionListener(this);
        popButton.addActionListener(this);
        pushButton.addActionListener(this);
        clearButton.addActionListener(this);

        window.add(drawPanel);
        window.add(verifyArea);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object object = ae.getSource();

        if (object == createButton) {
            createArray();
        }

        if (object == pushButton) {
            push();

        }
        if (object == popButton) {
            pop();
        }

    }

    public void createArray() {

        array = new ArrayStackDraw<>(5, g, drawPanel,
                verifyArea);

    }

    public void push() {

        array.push(Integer.parseInt(stackField.getText()), g,
                drawPanel, verifyArea);

    }

    public void pop() {
        
        array.pop(g, drawPanel, verifyArea);
    }

}
