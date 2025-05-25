package com.bank.system;

import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;
    public Conn(){
        try{
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "root");
            s=c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();;
        }
    }
}
