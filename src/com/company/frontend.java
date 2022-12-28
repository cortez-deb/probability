package com.company;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.InputMismatchException;

class frontend {
    //setting Jframe properties as global variables in class frontend
    JFrame frame = new JFrame("Probability");

    JButton run = new JButton("check");
    JButton cancel = new JButton("clear");
    JButton insert = new JButton("Insert");
    JButton delete = new JButton("Delete * data");
    JButton name = new JButton("insert");




    final  JTextField  day = new JTextField("Day");
    final JLabel forDay=new JLabel("Integer Day");

    final  JTextField weather = new JTextField("Weather");
    final JLabel forWeather=new JLabel("Weather");
    final JTextField party = new JTextField("1 or 0");
    final JLabel forParty = new JLabel("Boolean Party");
    final JLabel label1 = new JLabel("Finding all possible probability given a set of data");
    final  TextField txt1 = new TextField();
    final JLabel label2 = new JLabel("Insert Data");
    final TextField txt2 = new TextField();
    final JLabel label3 = new JLabel(" probabilityOfYesGivenSunny:");
    final TextField txt3 = new TextField();
    final  JLabel label4 = new JLabel("probabilityOfNoGivenSunny:");
    final TextField txt4 = new TextField();
    final JLabel label5 = new JLabel("probabilityOfYesGivenRainy:");
    final TextField txt5 = new TextField();

    final JLabel label6 = new JLabel("probabilityOfNoGivenRainy:");
    final TextField txt6 = new TextField();
    final JLabel label7 = new JLabel("probabilityOfYesGivenCloudy:");
    final  JLabel label8 = new JLabel("probabilityOfNoGivenCloudy:");

    JTextArea terminal = new JTextArea();

    void createFrame() {

        Image icon = Toolkit.getDefaultToolkit().getImage("");
        frame.setIconImage(icon);

        label1.setBounds(10, 0, 400, 30);
        label3.setBounds(10, 50, 250, 30);
        label4.setBounds(10, 75, 250, 30);
        label5.setBounds(10, 100, 250, 30);
        label6.setBounds(10, 130, 250, 30);
        label7.setBounds(10, 150, 250, 30);
        label8.setBounds(10, 180, 250, 30);
        label2.setBounds(600, 30, 200, 30);
        terminal.setBounds(200, 400, 500, 100);
        run.setBounds(500, 500, 80, 40);
        cancel.setBounds(300, 500, 80, 40);
        insert.setBounds(800,500,80,40);
        delete.setBounds(800,600,100,30);


        txt1.setBounds(250, 50, 200, 30);
        txt2.setBounds(250, 75, 200, 30);
        txt3.setBounds(250, 100, 200, 30);
        txt4.setBounds(250, 130, 200, 30);
        txt5.setBounds(250, 150, 200, 30);
        txt6.setBounds(250, 180, 200, 30);
        day.setBounds(800,20,70,30);
        forDay.setBounds(730,20,80,30);
        weather.setBounds(800,50,70,30);
        forWeather.setBounds(730,50,80,30);
        party.setBounds(800,80,80,30);
        forParty.setBounds(730,80,80,30);


        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        frame.add(txt4);
        frame.add(txt5);
        frame.add(txt6);
        frame.add(cancel);
        frame.add(insert);
        frame.add(day);
        frame.add(weather);
        frame.add(party);
        frame.add(forDay);
        frame.add(forParty);
        frame.add(forWeather);
        frame.add(delete);
        frame.add(name);

        frame.setSize(1000, 1000);
        frame.add(run);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(terminal);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                methods methods = new methods();
                double yesGivenSunny = methods.probabilityOfYesGivenSunny();
                double noGivenSunny = methods.probabilityOfNoGivenSunny();
                double yesGivenRainy = methods.probabilityOfYesGivenRainy();
                double noGivenRainy = methods.probabilityOfNoGivenRainy();
                double yesGivenCloudy = methods.probabilityOfYesGivenCloudy();
                double noGivenCloudy = methods.probabilityOfNoGivenCloudy();

                txt1.setText(String.valueOf(yesGivenSunny));
                txt2.setText(String.valueOf(noGivenSunny));
                txt3.setText(String.valueOf(yesGivenRainy));
                txt4.setText(String.valueOf(noGivenRainy));
                txt5.setText(String.valueOf(yesGivenCloudy));
                txt6.setText(String.valueOf(noGivenCloudy));
            }
        });
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt1.setText(null);
                txt2.setText(null);
                txt3.setText(null);
                txt4.setText(null);
                txt5.setText(null);
                txt6.setText(null);
                day.setText(null);
                weather.setText(null);
                party.setText(null);
            }
        });

        insert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer Day = 0,Party =0;
                try {
                     Day = Integer.parseInt(day.getText());
                    Party = Integer.parseInt(party.getText());
                }catch (IllegalArgumentException exception){
                    JOptionPane.showMessageDialog(frame,"Day Party is int");
                }
          
               
            String Weather= weather.getText();
                if( Weather.contains("cloudy")|| Weather.contains("sunny") || Weather.contains("rainy")){

             database database = new database();
             database.insert(Day,Weather,Party);

                }
                else {
                    JOptionPane.showMessageDialog(frame,"Use correct input");
                }
            }
        });
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(frame,"Are you sure")==0){
                    database database = new database();
                    database.delete();
                }
                else {
                    JOptionPane.showMessageDialog(frame,"canceled");
                }

            }
        });
    }

    void frameVisibility(){
        frame.setVisible(true);
    }
    public void appendText(String text) {

        terminal.append(text);
    }
    public void main() {
//this method redirect frontend terminal out-stream to RedirectingOutputStream class
        frontend gui = new frontend();
        gui.createFrame();
        System.setOut(new PrintStream(new RedirectingOutputStream(gui), true));
        System.setIn(System.in);
        gui.frameVisibility();

    }}
