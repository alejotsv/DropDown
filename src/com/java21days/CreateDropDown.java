package com.java21days;

public class CreateDropDown {
    public static void main(String[] args) {
        String[] options = { "Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0" };
        DropDown dropDown = new DropDown("Choose an Output Format", "Choose an output format", options);
    }
}
