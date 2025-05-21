package com.bank.system;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class SignUp extends JFrame {
    
    SignUp(){
        setLayout(null);
        Random rnd=new Random();
        Long l=(Math.abs(rnd.nextLong()%9000L)+ 1000l);
        
        JLabel formNo=new JLabel("Application Form Number: "+ l);
        formNo.setFont(new Font("Raleway", Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD,28));
        personalDetails.setBounds(260,80,400,40);
        add(personalDetails);
        
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(190,140,100,40);
        add(name);
        
        JTextField nameField=new JTextField();
        nameField.setFont(new Font("Arial", Font.BOLD, 18));
        nameField.setBounds(360, 150, 300, 20);
        add(nameField);
        
        JLabel fatherName=new JLabel("Father Name: ");
        fatherName.setFont(new Font("Raleway", Font.BOLD,20));
        fatherName.setBounds(190,170,200,40);
        add(fatherName);
        
        JTextField fNameField=new JTextField();
        fNameField.setFont(new Font("Arial", Font.BOLD, 18));
        fNameField.setBounds(360, 180, 300, 20);
        add(fNameField);
        
        JLabel DOB=new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(190,200,200,40);
        add(DOB);
        
        JDateChooser date= new JDateChooser();
        date.setBounds(360, 210, 150, 20);
        date.setForeground(Color.black);
        add(date);
        
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(190,230,200,40);
        add(gender);
        
        JRadioButton male= new JRadioButton("Male");
        male.setBounds(360, 240, 80, 20);
        male.setBackground(Color.white);
        add(male);

        JRadioButton female= new JRadioButton("Female");
        female.setBounds(450, 240, 100, 20);
        female.setBackground(Color.white);
        add(female);
        
        JRadioButton other= new JRadioButton("Other");
        other.setBounds(550, 240, 100, 20);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup genderGrp= new ButtonGroup();
        genderGrp.add(male);
        genderGrp.add(female);
        genderGrp.add(other);
        
        JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(190,260,200,40);
        add(email);
        
        JTextField emailField=new JTextField();
        emailField.setFont(new Font("Arial", Font.BOLD, 18));
        emailField.setBounds(360, 270, 300, 20);
        add(emailField);
        
        JLabel maritalStatus=new JLabel("Marital Status: ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD,20));
        maritalStatus.setBounds(190,290,200,40);
        add(maritalStatus);
        
        JRadioButton marrried= new JRadioButton("Marrried");
        marrried.setBounds(360, 300, 80, 20);
        marrried.setBackground(Color.white);
        add(marrried);

        JRadioButton unmarrried= new JRadioButton("Unmarrried");
        unmarrried.setBounds(450, 300, 100, 20);
        unmarrried.setBackground(Color.white);
        add(unmarrried);
        
        ButtonGroup marriedGrp= new ButtonGroup();
        marriedGrp.add(marrried);
        marriedGrp.add(unmarrried);
        
        JLabel Address=new JLabel("Address: ");
        Address.setFont(new Font("Raleway", Font.BOLD,20));
        Address.setBounds(190,320,200,40);
        add(Address);
        
        JTextField addressField=new JTextField();
        addressField.setFont(new Font("Arial", Font.BOLD, 18));
        addressField.setBounds(360, 330, 300, 20);
        add(addressField);
        
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(190,350,200,40);
        add(city);
        
        JTextField cityField=new JTextField();
        cityField.setFont(new Font("Arial", Font.BOLD, 18));
        cityField.setBounds(360, 360, 300, 20);
        add(cityField);
        
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(190,380,200,40);
        add(state);
        
        JTextField stateField=new JTextField();
        stateField.setFont(new Font("Arial", Font.BOLD, 18));
        stateField.setBounds(360, 390, 300, 20);
        add(stateField);
        
        JLabel pinCode=new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Raleway", Font.BOLD,20));
        pinCode.setBounds(190,410,200,40);
        add(pinCode);
        
        JTextField pinField=new JTextField();
        pinField.setFont(new Font("Arial", Font.BOLD, 18));
        pinField.setBounds(360, 420, 300, 20);
        add(pinField);
        
        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(450, 500, 100, 25);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
        setSize(850, 600);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SignUp();
    }
}
