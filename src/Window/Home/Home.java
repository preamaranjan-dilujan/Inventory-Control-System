package Window.Home;

import Window.Equipment.Equipment;
import Window.Student.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class Home extends JFrame {

//    Variable Declaration

    JLabel title = new JLabel();
    JButton iconstudent = new JButton();
    JButton iconequipment = new JButton();
    JLabel student = new JLabel();
    JLabel equipment = new JLabel();
    Image imgstudent;
    Image imgequipment;


    public Home(){

        super("Inventory Control System");
        setBounds(750,350,600,400);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Home");
        title.setBounds(260,10,250,30);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(title);

//        Student Window

        iconstudent.setText("");
        iconstudent.setBounds(25,50,256,256);
        iconstudent.setForeground(Color.darkGray);
        iconstudent.setBackground(Color.lightGray);
        iconstudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
        imgstudent = new ImageIcon(this.getClass().getResource("/Images/student.png")).getImage();
        iconstudent.setIcon(new ImageIcon(imgstudent));
        add(iconstudent);

        iconstudent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) { studentButtonPressed(); }

        });

        student.setText("Student");
        student.setBounds(100,210,256,256);
        student.setForeground(Color.darkGray);
        student.setBackground(Color.lightGray);
        student.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(student);


//        Equipment window

        iconequipment.setText("");
        iconequipment.setBounds(326,50,250,256);
        iconequipment.setForeground(Color.darkGray);
        iconequipment.setBackground(Color.lightGray);
        iconequipment.setFont(new Font("Times New Roman", Font.BOLD, 20));
        imgequipment = new ImageIcon(this.getClass().getResource("/Images/equipment.png")).getImage();
        iconequipment.setIcon(new ImageIcon(imgequipment));
        add(iconequipment);

        iconequipment.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) { equipmentButtonPressed(); }

        });

        equipment.setText("Equipment");
        equipment.setBounds(400,210,256,256);
        equipment.setForeground(Color.darkGray);
        equipment.setBackground(Color.lightGray);
        equipment.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(equipment);

    }

    private void studentButtonPressed() {

        this.setVisible(false);

        Student studenttWindow = new Student();
        studenttWindow.setVisible(true);
    }

    private void equipmentButtonPressed() {

        this.setVisible(false);

        Equipment equipmentWindow = new Equipment();
        equipmentWindow.setVisible(true);
    }

}
