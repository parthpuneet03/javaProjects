/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bank.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CardDetails extends JFrame{

    public CardDetails(String formNo) {
        setLayout(null);
        Conn c= new Conn();
        
        JLabel bankDetails =new JLabel("Your Account Details are as follows: ");
        bankDetails.setFont(new Font("Raleway", Font.BOLD,30));
        bankDetails.setBounds(140,20,600,40);
        add(bankDetails);
        
        Random rnd=new Random();
        Long accNo=(Math.abs(rnd.nextLong()%900000000000000000L));
        
        JLabel accNumLabel =new JLabel("Account Number:");
        accNumLabel.setFont(new Font("Raleway", Font.BOLD,18));
        accNumLabel.setBounds(100,100,600,40);
        add(accNumLabel);
        
        JLabel accNum =new JLabel(""+accNo);
        accNum.setFont(new Font("Raleway", Font.BOLD,20));
        accNum.setBounds(300,100,600,40);
        add(accNum);
        
        Random rnd1=new Random();
        Long cardNo=(Math.abs(rnd1.nextLong()%9000000000000000L));
        String cardNumber="";
        int i=0;
            while(true){
                int lastDig=(int) (cardNo%10);
                if(i!=0 && i%4==0){
                    cardNumber="-"+cardNumber;
                }
                i++;
                cardNumber= lastDig+cardNumber;
                cardNo=(cardNo-lastDig)/10;
                if (cardNo == 0) {
                    break;
                }
            }
            System.out.println(""+cardNumber);
        
        JLabel cardNumLabel =new JLabel("Card Number:");
        cardNumLabel.setFont(new Font("Raleway", Font.BOLD,18));
        cardNumLabel.setBounds(100,200,600,40);
        add(cardNumLabel);
        
        JLabel cardNum =new JLabel(""+cardNumber);
        cardNum.setFont(new Font("Raleway", Font.BOLD,20));
        cardNum.setBounds(250,200,600,40);
        add(cardNum);
        
        JLabel cardPin =new JLabel(""+cardNumber);
        cardPin.setFont(new Font("Raleway", Font.BOLD,20));
        cardPin.setBounds(250,250,600,40);
        add(cardPin);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850, 600);
        setLocation(350, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CardDetails("");
    }
    
}
