/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractive;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ☆愛冰漾★
 */
public class JavaPractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Practive1();
    } 
    public static void Practive1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入正整數:");
        String str = sc.next();
        ArrayList pm = new ArrayList();
        for(int c=1;c<=str.length();c++)
        {
            for(int i=0;i<=str.length()-c;i++)
            {
                String s="";
                for(int j=i;j<i+c;j++){s += str.charAt(j);}
                int cc = Integer.parseInt(s);
                if(Prime(cc)){pm.add(cc);}
            }
        }
        System.out.print("子字串中最大的質數值為:");
        if (pm.isEmpty()){System.out.println("No prime found");}
        else {System.out.println(Collections.max(pm));}
        
    }
    public static boolean Prime(int num)
    {
        int i=2;
        if(num>1){}else{return false;}
        while(num>i)
        {
            if(num%i==0){return false;}
            if(i==2){i++;}else{i+=2;}
        }
        return true;
    }
}


