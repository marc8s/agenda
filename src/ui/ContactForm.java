package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        //abrir no meio da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width / 2, dim.height/ 2 - getSize().height / 2);
        //quando fechar
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();
    }

    private void setListeners(){
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });

    }
}
