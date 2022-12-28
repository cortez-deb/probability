package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //calling call frontend which has all the code for the Giu and prolog
        database database = new database();
        frontend frontend = new frontend();
        if(  database.createdatabase()==1){
            new frontend();
        frontend.main();
        }else
        {
            JOptionPane.showMessageDialog(frontend.frame,"Error Occurred");
            frontend.frame.getDefaultCloseOperation();
        }


        // write your code here
    }

}


