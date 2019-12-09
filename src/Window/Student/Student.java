package Window.Student;

import Window.Home.Home;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class Student extends JFrame {

//    Variable Declaration

    JButton home = new JButton();
    Image img;
    JLabel title = new JLabel();
    JLabel stname = new JLabel();
    JLabel stid = new JLabel();
    JLabel stfaculty = new JLabel();
    JPanel actionpanel = new JPanel();
    JPanel detailspanel = new JPanel();
    JTextField search = new JTextField();
    JButton searchst = new JButton("Search");
    JButton addst = new JButton("Add Student");
    JTable details = new JTable();
    Border greyline = BorderFactory.createLineBorder(Color.darkGray);


    public Student(){

        super("Inventory Control System");
        setBounds(550,350,850,430);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Home

        home.setBounds(50,20,50,50);
        home.setForeground(Color.DARK_GRAY);
        home.setBackground(Color.LIGHT_GRAY);
        img = new ImageIcon(this.getClass().getResource("/Images/home.png")).getImage();
        home.setIcon(new ImageIcon(img));
        add(home);

        home.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) { homeButtonPressed(); }
        });

//        Title

        title.setText("Student");
        title.setBounds(350,20,300,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);

//        Search Student

        search.setBounds(40,105,250,30);
        search.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(search);

        searchst.setBounds(90,155,150,30);
        searchst.setForeground(Color.darkGray);
        searchst.setBackground(Color.lightGray);
        searchst.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(searchst);

        searchst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { searchButtonPressed(); }
        });

//        Student Details

        stname.setText("Name: XXXXXXXXXXX");
        stname.setBounds(40,200,250,30);
        stname.setForeground(Color.darkGray);
        stname.setBackground(Color.lightGray);
        stname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stname);

        stid.setText("ID: XXXXXXXXXXXXX");
        stid.setBounds(40,240,250,30);
        stid.setForeground(Color.darkGray);
        stid.setBackground(Color.lightGray);
        stid.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stid);

        stfaculty.setText("Faculty: XXXXXXXXXX");
        stfaculty.setBounds(40,280,250,30);
        stfaculty.setForeground(Color.darkGray);
        stfaculty.setBackground(Color.lightGray);
        stfaculty.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(stfaculty);

//        Add Student

        addst.setBounds(40,330,250,30);
        addst.setForeground(Color.darkGray);
        addst.setBackground(Color.lightGray);
        addst.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(addst);

        addst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { addButtonPressed(); }
        });

//        Details Table

        add(details);

//        Action Panel

        actionpanel.setBackground(Color.lightGray);
        actionpanel.setBounds(20,90,290,285);
        actionpanel.setBorder(greyline);
        add(actionpanel);

//        Details Panel

        detailspanel.setBackground(Color.lightGray);
        detailspanel.setBounds(330,90,500,285);
        detailspanel.setBorder(greyline);
        add(detailspanel);

    }

    public void searchButtonPressed(){

//        return borrowed equipment results

    }

    public void addButtonPressed(){

        this.setVisible(false);

        AddStudent addstudent_window = new AddStudent();
        addstudent_window.setVisible(true);

    }

    public void homeButtonPressed(){

        this.setVisible(false);

        Home home_window = new Home();
        home_window.setVisible(true);
    }

}
