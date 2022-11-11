package com.java21days;

import javax.swing.*;
import java.awt.*;

public class DropDown extends JFrame {
    Dimension dim = new Dimension(200,200);

    DropDown(String title, String message, String[] options){
        super(title);
        JPanel panel = new JPanel();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}
