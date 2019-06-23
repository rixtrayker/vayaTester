/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tester4;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Tester {

    

    public static void main(String[] args) {
        
        String in = "";
        Scanner sc = new Scanner(System.in);
       /*
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("echo 'amr 129988' |sudo rm /123321.txt");
            }
        } catch (IOException ex) {
        }
        */
        
        Cmds cmd = new Cmds();
        cmd.setUsername("0xAmr4@gmail.com");
        cmd.setPassword("1210776780@nohack");
        //System.out.println(in);
        //try{Thread.sleep(2000);}catch(Exception e){}
        while(true){
            System.out.println("Input : ");
            in = sc.nextLine();
            cmd.res(in);
        }
    }
}
