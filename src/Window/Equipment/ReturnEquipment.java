package Window.Equipment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class ReturnEquipment extends JFrame {


//    Variable Decleration

    JLabel title = new JLabel();
    JLabel id = new JLabel();
    JLabel name = new JLabel();
    JLabel quantity = new JLabel();
    JTextArea stid = new JTextArea();
    String[] items={"Item 01","Item 02","Item 03","Item 04","Item 05"};
    JComboBox eqname = new JComboBox(items);
    JTextArea eqquantity = new JTextArea();
    JButton returneq = new JButton();
    JButton cancel = new JButton();

    public ReturnEquipment(){

        super("Inventory Control System");
        setBounds(750,350,600,430);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Return Equipment");
        title.setBounds(170,20,320,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);


//        Student Id

        id.setText("Student ID:");
        id.setBounds(50,100,250,20);
        id.setForeground(Color.darkGray);
        id.setBackground(Color.lightGray);
        id.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(id);

        stid.setBounds(300,100,250,25);
        stid.setForeground(Color.darkGray);
        stid.setBackground(Color.white);
        stid.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stid);
        stid.requestFocus();

//        Equipment Name

        name.setText("Equipment Name:");
        name.setBounds(50,170,250,20);
        name.setForeground(Color.darkGray);
        name.setBackground(Color.lightGray);
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(name);

        eqname.setBounds(300,170,250,25);
        eqname.setForeground(Color.darkGray);
        eqname.setBackground(Color.white);
        eqname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(eqname);

//        Equipment Quantity

        quantity.setText("Quantity:");
        quantity.setBounds(50,240,250,20);
        quantity.setForeground(Color.darkGray);
        quantity.setBackground(Color.lightGray);
        quantity.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(quantity);

        eqquantity.setBounds(300,240,250,25);
        eqquantity.setForeground(Color.darkGray);
        eqquantity.setBackground(Color.white);
        eqquantity.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(eqquantity);

//        Return

        returneq.setText("Return");
        returneq.setBounds(100,320,150,30);
        returneq.setForeground(Color.darkGray);
        returneq.setBackground(Color.lightGray);
        returneq.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(returneq);

        returneq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnButtonPressed();
            }
        });

//        Cancel

        cancel.setText("Cancel");
        cancel.setBounds(350,320,150,30);
        cancel.setForeground(Color.darkGray);
        cancel.setBackground(Color.lightGray);
        cancel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(cancel);

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelButtonPressed();
            }
        });

    }

    public void returnButtonPressed(){

        //add issued equipment details to database

        this.setVisible(false);

        Equipment equipment_window = new Equipment();
        equipment_window.setVisible(true);

    }

    public void cancelButtonPressed(){

        this.setVisible(false);

        Equipment equipment_window = new Equipment();
        equipment_window.setVisible(true);

    }
}
