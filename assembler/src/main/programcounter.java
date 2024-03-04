/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author mahmoud
 */
public class programcounter {
    String ar[][];
    String arrayofaddress[];
    int row;
    int col;
    int index;
    int valueofstart;
    String filename;
    
    programcounter(String filename) throws FileNotFoundException, IOException{
        ReadFile f=new ReadFile(filename);
        ar=f.call();
        index=f.getIndex(1, 2);
        row=f.get_row();
        col=f.get_col();  
        valueofstart=Integer.parseInt(ar[0][index]);
        arrayofaddress=new String[row];
        this.filename=filename;
        
    }
    void address()throws FileNotFoundException, IOException{
        Hexcalc h=new Hexcalc();
        CountString s=new CountString();
        String k;
        int l;
        Print p=new Print();
        arrayofaddress[0]="0";
        arrayofaddress[1]=Integer.toString(valueofstart);
        for(int i=1;i<row-1;i++){
            for(int j=1;j<col;j++){
                if(ar[i][1].equalsIgnoreCase("byte")){
                    k=Integer.toString(s.countCharacter(ar[i][2]));
                    arrayofaddress[i+1]=h.addHex(arrayofaddress[i],k);
                }
                else if(ar[i][1].equalsIgnoreCase("resw")){
                    l=Integer.parseInt(ar[i][2])*3;
                    k=Integer.toHexString(l);
                    arrayofaddress[i+1]=h.addHex(arrayofaddress[i], k);
                }
                else if(ar[i][1].equalsIgnoreCase("resb")){
                    l=Integer.parseInt(ar[i][2]);
                    k=Integer.toHexString(l);
                    arrayofaddress[i+1]=h.addHex(arrayofaddress[i], k);
                }
                else{
                    arrayofaddress[i+1]=h.addHex(arrayofaddress[i],Integer.toString(3));
                }
                
            }
        }
        p.printTable(ar, arrayofaddress,row,col,filename);
    }
}

