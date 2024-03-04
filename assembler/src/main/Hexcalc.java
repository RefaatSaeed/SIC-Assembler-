/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mahmoud
 */
public class Hexcalc {
        String addHex(String hexNum1, String hexNum2) {
        int decimal1 = Integer.parseInt(hexNum1, 16);
        int decimal2 = Integer.parseInt(hexNum2, 16);
        int result = decimal1 + decimal2;
        return Integer.toHexString(result).toUpperCase();
    }
}
