package Window.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class AddStudent extends JFrame {

//    Variable Declaration

    JLabel title = new JLabel();
    JLabel name = new JLabel();
    JLabel id = new JLabel();
    JLabel faculty = new JLabel();
    JTextArea stname = new JTextArea();
    JTextArea stid = new JTextArea();
    JTextArea stfaculty = new JTextArea();
    JButton add = new JButton();
    JButton cancel = new JButton();

    public AddStudent(){

        super("Inventory Control System");
        setBounds(750,350,600,430);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Add Student");
        title.setBounds(180,20,300,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);


//        Name

        name.setText("Student Name:");
        name.setBounds(50,100,250,20);
        name.setForeground(Color.darkGray);
        name.setBackground(Color.lightGray);
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(name);

        stname.setBounds(300,100,250,25);
        stname.setForeground(Color.darkGray);
        stname.setBackground(Color.white);
        stname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stname);
        stname.requestFocus();

//        Id

        id.setText("Student ID:");
        id.setBounds(50,170,250,20);
        id.setForeground(Color.darkGray);
        id.setBackground(Color.lightGray);
        id.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(id);

        stid.setBounds(300,170,250,25);
        stid.setForeground(Color.darkGray);
        stid.setBackground(Color.white);
        stid.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stid);

//        Quantity

        faculty.setText("Faculty :");
        faculty.setBounds(50,240,250,20);
        faculty.setForeground(Color.darkGray);
        faculty.setBackground(Color.lightGray);
        faculty.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(faculty);

        stfaculty.setBounds(300,240,250,25);
        stfaculty.setForeground(Color.darkGray);
        stfaculty.setBackground(Color.white);
        stfaculty.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stfaculty);

//        Add

        add.setText("Add");
        add.setBounds(100,320,150,30);
        add.setForeground(Color.darkGray);
        add.setBackground(Color.lightGray);
        add.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(add);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addButtonPressed();
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

    public void addButtonPressed(){

        //add student details to database

        this.setVisible(false);

        Student student_window = new Student();
        student_window.setVisible(true);

    }

    public void cancelButtonPressed(){

        this.setVisible(false);

        Student student_window = new Student();
        student_window.setVisible(true);

    }

}
