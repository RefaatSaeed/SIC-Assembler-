/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mahmoud
 */
public class Print {
        void printTable(String[][] data,String[] address,int row_1,int col,String Filename) throws FileNotFoundException, IOException,ArrayIndexOutOfBoundsException {
        ReadFile f=new ReadFile(Filename);
        String ar[][];
        ar=f.call();
        System.out.printf("%-15s%-15s%n", "address","code");
        System.out.println("=====================================");
        for(int i=0;i<row_1;i++){
            System.out.print(address[i]+"|"+"\t");
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]!=null){
                    System.out.print(ar[i][j]+"\t");
                }
                else{
                    break;
                }
            }
            System.out.println("\n");
        }
        
    }
}
