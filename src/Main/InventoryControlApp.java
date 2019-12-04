package Main;

import javax.swing.*;
import java.awt.*;

/**
*@author Kesavan(K7)
**/

public class InventoryControlApp extends JFrame {

//    Variable Decleration

    JLabel title = new JLabel();
    JLabel username = new JLabel();
    JLabel password = new JLabel();
    JTextArea uname = new JTextArea();
    JPasswordField pword = new JPasswordField();
    JButton login = new JButton();
    JButton signup = new JButton();

    public InventoryControlApp(){

        super("Inventory Control System");
        setBounds(750,350,500,350);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Login");
        title.setBounds(200,20,100,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);

//        Username

        username.setText("Username:");
        username.setBounds(50,100,200,20);
        username.setForeground(Color.darkGray);
        username.setBackground(Color.lightGray);
        username.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(username);

        uname.setBounds(200,100,250,25);
        uname.setForeground(Color.darkGray);
        uname.setBackground(Color.white);
        uname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(uname);

//        Password

        password.setText("Password :");
        password.setBounds(50,170,200,20);
        password.setForeground(Color.darkGray);
        password.setBackground(Color.lightGray);
        password.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(password);

        pword.setBounds(200,170,250,25);
        pword.setForeground(Color.darkGray);
        pword.setBackground(Color.white);
        pword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(pword);

//        Signup

        signup.setText("Signup");
        signup.setBounds(80,240,150,30);
        signup.setForeground(Color.darkGray);
        signup.setBackground(Color.lightGray);
        signup.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(signup);

//        Login

        login.setText("Login");
        login.setBounds(270,240,150,30);
        login.setForeground(Color.darkGray);
        login.setBackground(Color.lightGray);
        login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(login);
    }
}
