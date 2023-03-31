package com.one_task_sticky_note;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Hello world!
 */
public final class Main {
    private Main() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // create a new frame
        JFrame frame = new JFrame("Sticky Note");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // create a panel to hold the label and button
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 80));
        panel.setBackground(Color.green);
        panel.setLayout(new FlowLayout());

        // create a label for the task
        JLabel label = new JLabel("Task Name");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(label);

        // create a button to mark the task as complete
        JButton button = new JButton("Complete");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code to mark the task as complete and show the next task
                // TODO: implement this part
            }
        });
        panel.add(button);

        // add the panel to the frame and show it
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
