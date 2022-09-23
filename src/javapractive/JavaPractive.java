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
        Practive2();
    } 
    
    public static String input(String text) //輸入函式
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String str = sc.next();
        return str;
    }
    
    // 第一題
    public static void Practive1() {
        String str = input("請輸入正整數");
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
    public static boolean Prime(int num) //質數判斷函式
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
    
    
    
    //第二題
    public static void Practive2()
    {
        /*
        String str = input("");
        String SpendsStr = "0,120,330,500,700";
        String SummerCostStr = "2.10,3.02,4.39,4.97,5.63";
        String NonSummerCostStr = "2.10,2.68,3.61,4.01,4.50";
        ArrayList Spends = new ArrayList();
        ArrayList SummerCost = new ArrayList();
        ArrayList NonSummerCost = new ArrayList();
        for(String retval: SpendsStr.split(","))
        {
            Spends.add(retval);
        }
        for(String retval: SummerCostStr.split(","))
        {
            SummerCost.add(retval);
        }
        for(String retval: NonSummerCostStr.split(","))
        {
            NonSummerCost.add(retval);
        }
        
        
        int spend = Integer.parseInt(str);
        int sum=0,s,c=0;
        for (int i=0; i<Spends.size(); i++)
        {
            System.out.println(Spends.get(i));
            s = Integer.parseInt((String)Spends.get(i));
            if(spend>s)
            {
                sum += spend;
                c = s;
            }else{
                sum += Integer.parseInt((String)SummerCost.get(i))*(spend - c);
                
            }
        }
                */
        String str = input("");
        float spend = Float.parseFloat(str);
        float sum=0,nsum=0;
       
        if (spend>120)
        {
            sum += 120 * 2.10f;
            nsum += 120 * 2.10f;
            if (spend>330)
            {
                sum += (330 - 120) * 3.02f;
                nsum += (330 - 120) * 2.68f;
                if (spend>500)
                {
                    sum += (500 - 330) * 4.39f;
                    nsum += (500 - 330) * 3.61f;
                    if (spend>700)
                    {
                        sum += (700 - 500) * 4.97f;
                        nsum += (700 - 500) * 4.01f;
                        sum += (spend - 700) * 5.63f;
                        nsum += (spend - 700) * 4.50f;
                    }
                    else
                    {
                        sum += (spend - 500) * 4.97f;
                        nsum += (spend - 500) * 4.01f;
                    }
                }
                else
                {
                    sum += (spend - 330) * 4.39f;
                    nsum += (spend - 330) * 3.61f;
                }
            }
            else
            {
                sum += (spend - 120) * 3.02f;
                nsum += (spend - 120) * 2.68f;
            }
        }
        else
        {
            sum += spend * 2.10f;
            nsum += spend * 2.10f;
        }
        System.out.println("Summer months:"+sum);
        System.out.println("Non-Summer months:"+nsum);
    }
    
    
    
    //第三題
    public static void Practive3()
    {
    }
}


