/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mahmoud
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ReadFile {
    private String fileName;
    private int line_count_i;
    private int line_number_1;
    private String arr[][];
    ReadFile(String fileName){
        this.fileName=fileName;
    }
    private void get_lines() throws FileNotFoundException, IOException{
        BufferedReader Buffer=new BufferedReader(new FileReader(fileName));
        long line_count=Buffer.lines().count();
        line_count_i=(int)line_count;
        Buffer.close();
    }
    private void split_lines() throws FileNotFoundException, IOException{
        BufferedReader Buffer=new BufferedReader(new FileReader(fileName));
        int line_number=0;
        this.arr=new String[line_count_i][];
        String line;
        while((line=Buffer.readLine())!=null){
            line=line.trim();
            String[] elements=line.split(" ");
            arr[line_number]=elements;
            line_number++;
        }
        line_number_1=line_number;
        Buffer.close();
    }
    String[][] call() throws FileNotFoundException, IOException{
        get_lines();
        split_lines();
        return arr;
    }
    int get_row(){
        return line_count_i;
    }
    int get_col(){
        return line_number_1;
    }
    private boolean check(int x,int y){
    boolean t=false;
    Numbercheck n=new Numbercheck();
    if(n.Number_check(arr, x, y)==true){
        t=true;
    }
    return t;
    }
    int getIndex(int x,int y){
        if(check(0,x)){
            return x;
        }
        else {
         return y;
        }
    }
}