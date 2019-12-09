package Window.Equipment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class UpdateEquipment extends JFrame {

//    Variable Decleration

    JLabel title = new JLabel();
    JLabel name = new JLabel();
    JLabel oldquantity = new JLabel();
    JLabel quantity = new JLabel();
    String[] items={"Item 01","Item 02","Item 03","Item 04","Item 05"};
    JComboBox eqname = new JComboBox(items);
    JTextArea oldeqquantity = new JTextArea();
    JTextArea eqquantity = new JTextArea();
    JButton update = new JButton();
    JButton cancel = new JButton();

    public UpdateEquipment(){

        super("Inventory Control System");
        setBounds(750,350,600,430);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Update Equipment");
        title.setBounds(155,20,350,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);


//        Username

        name.setText("Equipment Name:");
        name.setBounds(50,100,250,20);
        name.setForeground(Color.darkGray);
        name.setBackground(Color.lightGray);
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(name);

        eqname.setBounds(300,100,250,25);
        eqname.setForeground(Color.darkGray);
        eqname.setBackground(Color.white);
        eqname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(eqname);
        eqname.requestFocus();

        eqname.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) { getSetDetails(); }

        });

//        Old Quantity

        oldquantity.setText("Old Quantity:");
        oldquantity.setBounds(50,170,250,20);
        oldquantity.setForeground(Color.darkGray);
        oldquantity.setBackground(Color.lightGray);
        oldquantity.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(oldquantity);

        oldeqquantity.setBounds(300,170,250,25);
        oldeqquantity.setForeground(Color.darkGray);
        oldeqquantity.setBackground(Color.white);
        oldeqquantity.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(oldeqquantity);

//        Quantity

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

//        Update

        update.setText("Update");
        update.setBounds(100,320,150,30);
        update.setForeground(Color.darkGray);
        update.setBackground(Color.lightGray);
        update.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(update);

        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateButtonPressed();
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

    public void updateButtonPressed(){

        //add updated equipment details to database

        this.setVisible(false);

        Equipment equipment_window = new Equipment();
        equipment_window.setVisible(true);


    }

    public void cancelButtonPressed(){

        this.setVisible(false);

        Equipment equipment_window = new Equipment();
        equipment_window.setVisible(true);

    }

    private void getSetDetails() {

//        update equipment old quantity


    }

}
