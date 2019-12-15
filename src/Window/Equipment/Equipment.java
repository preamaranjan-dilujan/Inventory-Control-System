package Window.Equipment;

import Window.Home.Home;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *@author Kesavan(K7)
 **/

public class Equipment extends JFrame {

//    Variable Declaration

    JButton home = new JButton();
    Image img;
    JLabel title = new JLabel();
    JPanel selectpanel = new JPanel();
    JPanel actionpanel = new JPanel();
    JPanel detailspanel = new JPanel();
    String[] items={"Item 01","Item 02","Item 03","Item 04","Item 05"};
    JComboBox selecteq = new JComboBox(items);
    JButton searcheq = new JButton("Search");
    JButton addeeq = new JButton("Add Equipment");
    JButton issueeq = new JButton("Issue Equipment");
    JButton returneq = new JButton("Return Equipment");
    JTable details = new JTable();
    Border greyline = BorderFactory.createLineBorder(Color.darkGray);


    public Equipment(){

        super("Inventory Control System");
        setBounds(550,350,850,430);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setForeground(Color.darkGray);
        getContentPane().setBackground(Color.lightGray);

//        Home

        home = new JButton("");
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

        title.setText("Equipment");
        title.setBounds(350,20,300,50);
        title.setForeground(Color.darkGray);
        title.setBackground(Color.lightGray);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(title);

//        Select Equipment

        selecteq.setBounds(40,105,250,30);
        selecteq.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(selecteq);

//        Search Equipment

        searcheq.setBounds(90,145,150,30);
        searcheq.setForeground(Color.darkGray);
        searcheq.setBackground(Color.lightGray);
        searcheq.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(searcheq);

        searcheq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { searchButtonPressed(); }
        });

//        Add Equipment

        addeeq.setBounds(40,230,250,25);
        addeeq.setForeground(Color.darkGray);
        addeeq.setBackground(Color.lightGray);
        addeeq.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(addeeq);

        addeeq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { addButtonPressed(); }
        });

//        Issue Equipment

        issueeq.setBounds(40,280,250,25);
        issueeq.setForeground(Color.darkGray);
        issueeq.setBackground(Color.lightGray);
        issueeq.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(issueeq);

        issueeq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { issueButtonPressed(); }
        });

//        Return Equipment

        returneq.setBounds(40,330,250,25);
        returneq.setForeground(Color.darkGray);
        returneq.setBackground(Color.lightGray);
        returneq.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(returneq);

        returneq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { returnButtonPressed(); }
        });

//        Details Table

        add(details);

//        Select Panel

        selectpanel.setBackground(Color.lightGray);
        selectpanel.setBounds(20,90,290,100);
        selectpanel.setBorder(greyline);
        add(selectpanel);


//        Action Panel

        actionpanel.setBackground(Color.lightGray);
        actionpanel.setBounds(20,210,290,165);
        actionpanel.setBorder(greyline);
        add(actionpanel);


//        Details Panel

        detailspanel.setBackground(Color.lightGray);
        detailspanel.setBounds(330,90,500,285);
        detailspanel.setBorder(greyline);
        add(detailspanel);

    }

    public void searchButtonPressed(){

    }

    public void addButtonPressed(){

        this.setVisible(false);

        UpdateEquipment updateequipment_window = new UpdateEquipment();
        updateequipment_window.setVisible(true);

    }

    public void issueButtonPressed(){

        this.setVisible(false);

        IssueEquipment issueequipment_window = new IssueEquipment();
        issueequipment_window.setVisible(true);
    }

    public void returnButtonPressed(){

        this.setVisible(false);

        ReturnEquipment returnequipment_window = new ReturnEquipment();
        returnequipment_window.setVisible(true);
    }

    public void homeButtonPressed(){

        this.setVisible(false);

        Home home_window = new Home();
        home_window.setVisible(true);
    }

}
