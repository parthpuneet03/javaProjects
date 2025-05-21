package com.bank.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, clear;
    JTextField cardNum;
    JPasswordField pinNum;
    Login(){
        setTitle("Automatic Teller Machine");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label= new JLabel(i3);
        setLayout(null);
        label.setBounds(20, 20, 100, 100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(150, 20, 400, 100);
        add(text);
        
        JLabel cardNo=new JLabel("Card No : ");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNo.setBounds(150, 120, 150, 30);
        add(cardNo);
        
        cardNum= new JTextField();
        cardNum.setFont(new Font("Arial", Font.BOLD, 15));
        cardNum.setBounds(320, 120, 250, 30);
        add(cardNum);
        
        JLabel pin=new JLabel("ATM Pin : ");
        pin.setFont(new Font("Osward", Font.BOLD, 28));
        pin.setBounds(150, 160, 400, 30);
        add(pin);
        
        pinNum= new JPasswordField();
        pinNum.setFont(new Font("Arial", Font.BOLD, 28));
        pinNum.setBounds(320, 160, 250, 30);
        add(pinNum);
        
        login = new JButton("LOGIN");
        login.setBounds(320, 200, 80, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        signup = new JButton("SIGNUP");
        signup.setBounds(420, 200, 80, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE); 
        signup.addActionListener(this);
        add(signup);
        
        clear = new JButton("CLEAR");
        clear.setBounds(320, 250, 180, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE); 
        clear.addActionListener(this);
        add(clear);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(1000, 400);
        setVisible(true);
        setLocation(450, 250);
    }
    
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            
        }
        else if(e.getSource()==signup){
            
        }
        else if(e.getSource()==clear){
            cardNum.setText("");
            pinNum.setText("");
        }
    }
    
}
