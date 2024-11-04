/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NITRO V 15
 */
public class tugas10 {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}


