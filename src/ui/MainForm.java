package ui;

import business.ContactBusiness;
import entity.ContactEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

    private ContactBusiness mContactBusiness;

    //construtor
    public MainForm(){
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
        //abrir no meio da tela
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width / 2, dim.height/ 2 - getSize().height / 2);
        //quando fechar
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mContactBusiness = new ContactBusiness();

        setListeners();
        loadContacts();
    }

    private void loadContacts(){
        List<ContactEntity> contactList = mContactBusiness.getList();

    }

    private void setListeners(){
        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //abre formulario
                new ContactForm();
                //fecha formulario
                dispose();
            }
        });

        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
