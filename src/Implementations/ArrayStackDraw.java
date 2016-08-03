/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations;

import exceptions.EmptyCollectionException;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author James
 */
public class ArrayStackDraw<T> extends arrayStack {

    public ArrayStackDraw(int size, Graphics g, JPanel drawPanel,
            JTextArea verifyArea) {

        
        super(size);
        g = drawPanel.getGraphics();
        int shift = 50;
        for (int i = 0; i < size; i++) {
            g.drawRect(shift, 70, 50, 50);
            shift += 50;
            g.drawString(Integer.toString(i), shift - 25, 140);
        }
        verifyArea.append("\n" + "array = "
                + "(T[ ]) new Object[DEFAULT];");
        g.drawString("top: " + Integer.toString(top), 20, 20);

    }

    public void push(T element, Graphics g, JPanel drawPanel,
            JTextArea verifyArea) {

        g = drawPanel.getGraphics();

        
        if(top == array.length) {
            JOptionPane.showMessageDialog(null, "Array is full.");
        } else {
        
        g.setColor(Color.WHITE);
        g.fillRect(210, 10, 10, 10);
        g.setColor(Color.BLACK);
        g.drawString("Recently pushed value: " + element, 80, 20);
        g.drawString(element.toString(), 75 + top * 50, 95);
        g.setColor(Color.WHITE);
        g.fillRect(40, 10, 10, 10);
        g.setColor(Color.BLACK);
        super.push(element);
        g.drawString("top: " + Integer.toString(top), 20, 20);
        }

    }

    public void pop(Graphics g, JPanel drawPanel, JTextArea verifyArea) {

        g = drawPanel.getGraphics();

        try {

            g.setColor(Color.WHITE);
            g.fillRect(25 + top * 50, 85, 15, 15);
            g.fillRect(380, 10, 10, 10);
            g.setColor(Color.BLACK);
            g.drawString("Recently popped value: " + (T) super.pop(), 250, 20);
            g.setColor(Color.WHITE);
            g.fillRect(40, 10, 10, 10);
            g.setColor(Color.BLACK);
            g.drawString("top: " + Integer.toString(top), 20, 20);

        } catch (EmptyCollectionException e) {

        }
        
    }
    
    public void clear(Graphics g, JPanel drawPanel, JTextArea verifyArea) {
        
        
    }
}
