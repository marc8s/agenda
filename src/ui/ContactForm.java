package ui;

import javax.swing.*;

public class ContactForm extends JFrame {


    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textFone;
    private JButton buttonSave;
    private JButton buttonCancel;

    //construtor
    public ContactForm(){
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
    }
}
