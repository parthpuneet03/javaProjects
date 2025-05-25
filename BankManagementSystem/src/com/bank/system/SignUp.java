package com.bank.system;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SignUp extends JFrame implements ActionListener{
    long l;
    JTextField pinField,stateField,nameField, fNameField, emailField, addressField, cityField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser date;
        
    
    SignUp(){
        setLayout(null);
        Random rnd=new Random();
         l=(Math.abs(rnd.nextLong()%9000L)+ 1000l);
        
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
        
        nameField=new JTextField();
        nameField.setFont(new Font("Arial", Font.BOLD, 18));
        nameField.setBounds(360, 150, 300, 20);
        add(nameField);
        
        JLabel fatherName=new JLabel("Father Name: ");
        fatherName.setFont(new Font("Raleway", Font.BOLD,20));
        fatherName.setBounds(190,170,200,40);
        add(fatherName);
        
        fNameField=new JTextField();
        fNameField.setFont(new Font("Arial", Font.BOLD, 18));
        fNameField.setBounds(360, 180, 300, 20);
        add(fNameField);
        
        JLabel DOB=new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(190,200,200,40);
        add(DOB);
        
        date = new JDateChooser();
        date.setBounds(360, 210, 150, 20);
        date.setForeground(Color.black);
        add(date);
        
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(190,230,200,40);
        add(gender);
        
        male= new JRadioButton("Male");
        male.setBounds(360, 240, 80, 20);
        male.setBackground(Color.white);
        add(male);

         female= new JRadioButton("Female");
        female.setBounds(450, 240, 100, 20);
        female.setBackground(Color.white);
        add(female);
        
         other= new JRadioButton("Other");
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
        
        emailField=new JTextField();
        emailField.setFont(new Font("Arial", Font.BOLD, 18));
        emailField.setBounds(360, 270, 300, 20);
        add(emailField);
        
        JLabel maritalStatus=new JLabel("Marital Status: ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD,20));
        maritalStatus.setBounds(190,290,200,40);
        add(maritalStatus);
        
         married= new JRadioButton("Marrried");
        married.setBounds(360, 300, 80, 20);
        married.setBackground(Color.white);
        add(married);

        unmarried= new JRadioButton("Unmarrried");
        unmarried.setBounds(450, 300, 100, 20);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        ButtonGroup marriedGrp= new ButtonGroup();
        marriedGrp.add(married);
        marriedGrp.add(unmarried);
        
        JLabel Address=new JLabel("Address: ");
        Address.setFont(new Font("Raleway", Font.BOLD,20));
        Address.setBounds(190,320,200,40);
        add(Address);
        
        addressField=new JTextField();
        addressField.setFont(new Font("Arial", Font.BOLD, 18));
        addressField.setBounds(360, 330, 300, 20);
        add(addressField);
        
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(190,350,200,40);
        add(city);
        
        cityField=new JTextField();
        cityField.setFont(new Font("Arial", Font.BOLD, 18));
        cityField.setBounds(360, 360, 300, 20);
        add(cityField);
        
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(190,380,200,40);
        add(state);
        
        stateField=new JTextField();
        stateField.setFont(new Font("Arial", Font.BOLD, 18));
        stateField.setBounds(360, 390, 300, 20);
        add(stateField);
        
        JLabel pinCode=new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Raleway", Font.BOLD,20));
        pinCode.setBounds(190,410,200,40);
        add(pinCode);
        
        pinField=new JTextField();
        pinField.setFont(new Font("Arial", Font.BOLD, 18));
        pinField.setBounds(360, 420, 300, 20);
        add(pinField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(450, 500, 100, 25);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
        setSize(850, 600);
        setLocation(350, 100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo=""+ l;
        String name=nameField.getText();
        String fname=fNameField.getText();
        String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
        String gender=male.isSelected()?"Male":(female.isSelected()?"Female":"other");
        String email= emailField.getText();
        String maritalStatus=married.isSelected()?"Married":"Unmarried";
        String address=addressField.getText();
        String city= cityField.getText();
        String state=stateField.getText();
        String pin=pinField.getText();
        
        try{
            if( name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is mandatory");
                
            }else{
                Conn c= new Conn();
                String query="insert into bankmanagementsystem  values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+maritalStatus+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"');";
                JOptionPane.showMessageDialog(null, query);
                c.s.executeUpdate(query);
            }
        }catch( Exception | Error er){
            er.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SignUp();
    }

    
}
