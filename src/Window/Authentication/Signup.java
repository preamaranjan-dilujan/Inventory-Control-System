package Window.Authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class Signup extends JFrame {

//    Variable Declaration

    JLabel title = new JLabel();
    JLabel username = new JLabel();
    JLabel jobid = new JLabel();
    JLabel password = new JLabel();
    JLabel confpassword = new JLabel();
    JTextArea uname = new JTextArea();
    JTextArea jid = new JTextArea();
    JPasswordField pword = new JPasswordField();
    JPasswordField pwordc = new JPasswordField();
    JButton register = new JButton();

    public Signup(){

        super("Inventory Control System");
        setBounds(750,350,600,500);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Signup");
        title.setBounds(250,20,200,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);

//        Username

        username.setText("Username:");
        username.setBounds(50,100,250,20);
        username.setForeground(Color.darkGray);
        username.setBackground(Color.lightGray);
        username.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(username);

        uname.setBounds(300,100,250,25);
        uname.setForeground(Color.darkGray);
        uname.setBackground(Color.white);
        uname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(uname);
        uname.requestFocus();

//        JobId

        jobid.setText("Job ID:");
        jobid.setBounds(50,170,250,20);
        jobid.setForeground(Color.darkGray);
        jobid.setBackground(Color.lightGray);
        jobid.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(jobid);

        jid.setBounds(300,170,250,25);
        jid.setForeground(Color.darkGray);
        jid.setBackground(Color.white);
        jid.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(jid);

//        Password

        password.setText("Password :");
        password.setBounds(50,240,250,20);
        password.setForeground(Color.darkGray);
        password.setBackground(Color.lightGray);
        password.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(password);

        pword.setBounds(300,240,250,25);
        pword.setForeground(Color.darkGray);
        pword.setBackground(Color.white);
        pword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(pword);

//        Confirm Password

        confpassword.setText("Confirm Password :");
        confpassword.setBounds(50,310,250,20);
        confpassword.setForeground(Color.darkGray);
        confpassword.setBackground(Color.lightGray);
        confpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(confpassword);

        pwordc.setBounds(300,310,250,25);
        pwordc.setForeground(Color.darkGray);
        pwordc.setBackground(Color.white);
        pwordc.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(pwordc);

//        Register

        register.setText("Register");
        register.setBounds(250,380,150,30);
        register.setForeground(Color.darkGray);
        register.setBackground(Color.lightGray);
        register.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(register);

        register.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                registerButtonPressed();
            }
        });
    }


    public void registerButtonPressed(){

        this.setVisible(false);

        //database addition

        Login login_window = new Login();
        login_window.setVisible(true);

    }

}
