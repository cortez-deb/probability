package com.company;
import javax.swing.*;
import java.sql.*;
public class database {
  frontend frontend = new frontend();
  public int createdatabase()
  {

    int result =0;

    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
/*
        stmt.executeQuery("CREATE DATABASE IF NOT EXISTS 'probability';");
        stmt.execute("use probability;create table IF NOT EXISTS 'weather'(day int(2) not null,weather varchar(7) not null,party boolean not null);");


        JOptionPane.showMessageDialog(frontend.frame,"Failed to create db");
        result=0;*/
      result =1;
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwable) {
      JOptionPane.showMessageDialog(frontend.frame,"Db connection failed");
      frontend.frame.getDefaultCloseOperation();
    }
    return result;
  }

  public int cloudyTrue()
  {

  int result =0;

    try {

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/probability","deh","bedrock");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select count(\"party\") from weather where weather=\"cloudy\" and party =true;");
    while(rs.next())
      result =rs.getInt(1);
     // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
    con.close();
  }
  catch (SQLException | ClassNotFoundException throwables) {
    throwables.printStackTrace();
  }
  return result;
}


  public int cloudyFlase()
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select count(\"party\") from weather where weather=\"cloudy\" and party =false;");
      while(rs.next())
        result =rs.getInt(1);
      // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
    return result;
  }


  public int sunnyTrue()
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select count(\"party\") from weather where weather=\"sunny\" and party =true;");
      while(rs.next())
        result =rs.getInt(1);
      // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
    return result;
  }
  public int sunnyFalse()
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select count(\"party\") from weather where weather=\"sunny\" and party =false;");
      while(rs.next())
        result =rs.getInt(1);
      // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
    return result;
  }
  public int rainyTrue()
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select count(\"party\") from weather where weather=\"rainy\" and party =true;");
      while(rs.next())
        result =rs.getInt(1);
      // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
    return result;
  }
  public int rainyFalse()
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select count(\"party\") from weather where weather=\"rainy\" and party =false;");
      while(rs.next())
        result =rs.getInt(1);
      // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
    return result;
  }
  public int totalCount()
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select count(\"party\") from weather;");
      while(rs.next())
        result =rs.getInt(1);
      // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
    return result;
  }
  public void insert(int day, String weather, int party)
  {

    int result =0;
    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      ResultSet check=stmt.executeQuery("select * from weather where day='"+day+"';");
      while(check.next()) {
        result =check.getInt(1);
      }
      if(result==day){

        JOptionPane.showMessageDialog(frontend.frame,"Day '"+day+"' already exists");
      }
      else {
        stmt.execute("insert into weather values('" + day + "','" + weather + "','" + party + "')");
        JOptionPane.showMessageDialog(frontend.frame,"New data inserted");
      }


      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
  }
  public void delete()
  {

    try {

      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/probability","deh","bedrock");
      Statement stmt=con.createStatement();
      stmt.execute("delete from weather where party=1 or party =0 ");
      con.close();
    }
    catch (SQLException | ClassNotFoundException throwables) {
      throwables.printStackTrace();
    }
  }
}



