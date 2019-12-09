package Window.Authentication;

import Window.Home.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
*@author Kesavan(K7)
**/

public class Login extends JFrame {

//    Variable Declaration

    JLabel title = new JLabel();
    JLabel username = new JLabel();
    JLabel password = new JLabel();
    JTextArea uname = new JTextArea();
    JPasswordField pword = new JPasswordField();
    JButton login = new JButton();
    JButton signup = new JButton();

    public Login(){

        super("Inventory Control System");
        setBounds(750,350,600,350);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Title

        title.setText("Login");
        title.setBounds(250,20,100,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);

//        Username

        username.setText("Username:");
        username.setBounds(100,100,200,20);
        username.setForeground(Color.darkGray);
        username.setBackground(Color.lightGray);
        username.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(username);

        uname.setBounds(250,100,250,25);
        uname.setForeground(Color.darkGray);
        uname.setBackground(Color.white);
        uname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(uname);
        uname.requestFocus();

//        Password

        password.setText("Password :");
        password.setBounds(100,170,200,20);
        password.setForeground(Color.darkGray);
        password.setBackground(Color.lightGray);
        password.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(password);

        pword.setBounds(250,170,250,25);
        pword.setForeground(Color.darkGray);
        pword.setBackground(Color.white);
        pword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(pword);

//        Signup

        signup.setText("Signup");
        signup.setBounds(130,240,150,30);
        signup.setForeground(Color.darkGray);
        signup.setBackground(Color.lightGray);
        signup.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(signup);

        signup.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                    signupButtonPressed();
            }
        });

//        Login

        login.setText("Login");
        login.setBounds(320,240,150,30);
        login.setForeground(Color.darkGray);
        login.setBackground(Color.lightGray);
        login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(login);

        login.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                loginButtonPressed();
            }
        });
    }

    public void signupButtonPressed(){

        this.setVisible(false);

        Signup signup_window = new Signup();
        signup_window.setVisible(true);

    }

    public void loginButtonPressed(){

        this.setVisible(false);

        //password verification

        Home home_window = new Home();
        home_window.setVisible(true);

    }

}
