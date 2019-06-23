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
        System.out.println("Input : ");
        in = sc.nextLine();
        Cmds cmd = new Cmds();
        System.out.println(in);
        //try{Thread.sleep(2000);}catch(Exception e){}
        cmd.res(in);
    }
}
