package com.java21days;

import javax.swing.*;
import java.awt.*;

public class DropDown extends JFrame {
    Dimension dim = new Dimension(300,200);

    DropDown(String title, String message, String[] options){
        super(title);
        setSize(dim);
        JPanel panel = new JPanel();
        JLabel messageLabel = new JLabel(message);


        panel.add(messageLabel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}
