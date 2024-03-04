/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.regex.*;
/**
 *
 * @author mahmoud
 */
public class Numbercheck {
    Numbercheck(){
        
    }
    boolean Number_check(String ar[][],int x,int y){
        String regex="\\d+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(ar[x][y]);
        return matcher.matches();
    }
}
