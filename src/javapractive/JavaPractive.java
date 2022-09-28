/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractive;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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
        Practive6();
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
        String str = input("");
        float spend = Float.parseFloat(str);
        float sum=0f,nsum=0f;
       
        if (spend>120)
        {
            sum += 120f * 2.10f;
            nsum += 120f * 2.10f;
            if (spend>330)
            {
                sum += (330f - 120f) * 3.02f;
                nsum += (330f - 120f) * 2.68f;
                if (spend>500f)
                {
                    sum += (500f - 330f) * 4.39f;
                    nsum += (500f - 330f) * 3.61f;
                    if (spend>700)
                    {
                        sum += (700f - 500f) * 4.97f;
                        nsum += (700f - 500f) * 4.01f;
                        sum += (spend - 700f) * 5.63f;
                        nsum += (spend - 700f) * 4.50f;
                    }
                    else
                    {
                        sum += (spend - 500f) * 4.97f;
                        nsum += (spend - 500f) * 4.01f;
                    }
                }
                else
                {
                    sum += (spend - 330f) * 4.39f;
                    nsum += (spend - 330f) * 3.61f;
                }
            }
            else
            {
                sum += (spend - 120f) * 3.02f;
                nsum += (spend - 120f) * 2.68f;
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
        String[] zodiac = {"rat","ox","tiger","rabbit","dragon","snake","horse","sheep","monkey","rooster","dog","pig"};
        short year = (short)Integer.parseInt(input(""));
        year -= (short)2008;
        byte c=0;
        if(year<(short)0)
        {
            c = (byte)((byte)(year%(short)12) + (byte)12);
        }
        else
        {
            c = (byte)(year % (short)12);
        }
        System.out.println(zodiac[c]);
        
    }
    
    
    
    //第四題
    public static void Practive4()
    {
        int x=Integer.parseInt(input("X 軸座標：")),y=Integer.parseInt(input("Y 軸座標："));
        if(x>0)
        {
            if (y>0)
            {
                System.out.println("該點位於第一象限，離原點距離為根號 " + (x*x+y*y));
            }
            else if(y<0)
            {
                System.out.println("該點位於第四象限，離原點距離為根號 " + (x*x+y*y));
            }
            else
            {
                System.out.println("該點位於右半平面 X 軸上，離原點距離為根號 " + (x*x+y*y));
            }
        }
        else if(x<0)
        {
            if (y>0)
            {
                System.out.println("該點位於第二象限，離原點距離為根號 " + (x*x+y*y));
            }
            else if(y<0)
            {
                System.out.println("該點位於第三象限，離原點距離為根號 " + (x*x+y*y));
            }
            else
            {
                System.out.println("該點位於左半平面 X 軸上，離原點距離為根號 " + (x*x+y*y));
            }
        }
        else
        {
            if (y>0)
            {
                System.out.println("該點位於上半平面 Y 軸上，離原點距離為根號 " + (x*x+y*y));
            }
            else if(y<0)
            {
                System.out.println("該點位於下半平面 Y 軸上，離原點距離為根號 " + (x*x+y*y));
            }
            else
            {
                System.out.println("該點位於原點");
            }
        }
    }
    
    
    
    //第五題
    public static void Practive5()
    {
        int m=Integer.parseInt(input("請輸入階乘值 M："));
        int n=1,sum=1;
        while(sum<=m)
        {
            n++;
            sum *= n;
        }
        System.out.println("超過 M 為 " + m + " 的最小階層 N 值為：" + n);
    }
    
    
    
    //第六題
    public static void Practive6()
    {
        String str = input("輸入值為：");
        ArrayList list = new ArrayList(); 
        for(String retval: str.split(","))
        {
            list.add(retval);
        }
        int[] num = new int[list.size()];
        for (int i=0;i<list.size();i++)
        {
            num[i] = Integer.parseInt((String)list.get(i));
        }
        Arrays.sort(num);
        String s="";
        for(int i=0;i<num.length;i++)
        {
            s += num[i];
        }
        int min = Integer.parseInt(s);
        s = "";
        for(int i=num.length-1;i>=0;i--)
        {
            s += num[i];
        }
        int max = Integer.parseInt(s);
        System.out.println("最大值數列與最小值數列差值為：" + (max-min));
    }
}


