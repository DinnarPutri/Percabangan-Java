/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.luaslingkaran;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lobu8
 */
public class Luaslingkaran {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in).useLocale(Locale.US);
        
    System.out.println("## Program Java menghitung Luas Lingkaran ##");
    System.out.println("==============================================");
    System.out.println();
    
    double r, luas;
    
    System.out.print("Input jari-jari lingkaran");
    r = input.nextDouble();
    
    luas = 3.14 * r * r;
    
    System.out.println("Luas Lingkaran: "+luas);
    }
}
