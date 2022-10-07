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
        Practive16();
    } 
    
    public static String input(String text) //輸入函式
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String str = sc.nextLine();
        return str;
    }
    
    
    // 第一題  找出數字字串中的最大質數
    public static void Practive1()
    {
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
    
    
    
    //第二題  計算電費
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
    
    
    
    //第三題  生肖
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
    
    
    
    //第四題  2D 座標判斷及計算離原點距離
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
    
    
    
    //第五題  階層判斷
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
    
    
    
    //第六題  兩數差值
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
    
    
    
    //第七題  通話費率
    public static void Practive7()
    {
        int[] cost = {186, 386, 586, 986};
        float[] rate = {0.09f, 0.08f, 0.07f, 0.06f};
        String str = input("輸入月租費型式及通話時間為：");
        int[] num = splitInt(str,",");
        int option = 0;
        for(int i=0;i<cost.length;i++)
        {
            if((float)num[0]==cost[i]) {option=i;}
        }
        int total = Math.round(rate[option] * num[1]);
        if(total > cost[option]*3) {total = Math.round(total * (0.8f - (0.1f * option)));}
        else if(total > cost[option]*2) {total = Math.round(total * (0.9f - (0.1f * option)));}
        else if(total > cost[option]) {}
        else {total = cost[option];}
        System.out.println("通話費為：" + total);
    }
    
    public static int[] splitInt(String str, String s) //字串分割為整數陣列
    {
        ArrayList list = new ArrayList(); 
        for(String retval: str.split(s))
        {
            list.add(retval);
        }
        int[] num = new int[list.size()];
        for (int i=0;i<list.size();i++)
        {
            num[i] = Integer.parseInt((String)list.get(i));
        }
        return num;
    }
    
    
    
    //第八題  檢查數值是否重複
    public static void Practive8()
    {
        String str = input("輸入第一行正整數為：");
        byte[] num = new byte[Integer.parseInt(str)];
        str = input("第二行中數列中的數字為：");
        int c = 0;
        for(String retval: str.split("\\s+"))
        {
            num[c] = (byte)Integer.parseInt(retval);
            c++;
        }
                
        c=0;
        byte[] maxCount = new byte[num.length];
        byte[] maxNum = new byte[num.length];
        for(int i=0;i<num.length;i++)
        {
            boolean singleNum = true;
            for(int j=0;j<maxNum.length;j++)
            {
                if(num[i]==maxNum[j])
                {
                    maxCount[j]++;
                    singleNum = false;
                    break;
                }
            }
            if(singleNum)
            {
                maxCount[c] = 1;
                maxNum[c] = num[i];
                c++;
            }
            
        }
        c = 0;
        for(int i=0;i<maxCount.length;i++)
        {
            if(maxCount[i]>maxCount[c]){c=i;}
        }
        if(maxCount[c]==1)
        {
            System.out.println("每個數字剛好只出現 1 次");
        }
        else
        {
            str = "";
            for(int i=0;i<maxNum.length;i++)
            {
                if(maxCount[i]==maxCount[c]){str+=Integer.toString((int)maxNum[i])+" ";}
            }
            System.out.println("最大出現次數的數字為：" + str);
            System.out.println("出現次數為：" + maxCount[c]);
        }
    }
    
    
    
    //第九題  字根與子字串
    public static void Practive9()
    {
        String str1 = input("輸入 s1 為：");
        String str2 = input("輸入 s2 為：");
        if(str2.contains(str1)){System.out.println("YES");}
        else{System.out.println("NO");}
    }
    
    
    
    //第十題  轉置矩陣
    public static void Practive10()
    {
        String str = input("輸入 N 及 M 為：");
        String[] NM = str.split("\\s+");
        byte[][] nmList = new byte[Integer.parseInt(NM[0])][Integer.parseInt(NM[1])];
        for(int n=0;n<nmList.length;n++)
        {
            str = input("輸入矩陣數值第 " + (n+1) + " 列為：");
            int m=0;
            for(String retval: str.split("\\s+"))
            {
                nmList[n][m]=(byte)Integer.parseInt(retval);
                m++;
            }
        }
        
        for(int m=0;m<Integer.parseInt(NM[1]);m++)
        {
            str = "";
            for(int n=0;n<Integer.parseInt(NM[0]);n++){str += nmList[n][m]+" ";}
            System.out.println("輸出矩陣數值第 " + (m+1) + "列為：" + str);
        }
        
    }
    
    
    
    //第十一題  星座查詢
    public static void Practive11()
    {
        byte[] day = {0,31,28,31,30,31,30,31,31,30,31,30};
        short[] conDay = {21,50,80,111,142,173,204,236,267,297,327,356};
        String[] conName = {"水瓶Aquarius","雙魚Pisces","牡羊Aries","金牛Taurus","雙子Gemini","巨蟹Cancer","獅子Leo","處女Virgo","天秤Libra","Scorpio天蠍","射手Sagittarius","魔羯Capricorn"};
        String str = input("輸入月及日為：");
        String[] md = str.split("\\s+");
        short days = (short)Integer.parseInt(md[1]);
        for(int i=0;i<Integer.parseInt(md[0]);i++)
        {
            days += day[i];
        }
        byte conNum=(byte)(conDay.length-1);
        for(int i=0;i<conDay.length;i++)
        {
            if(days>=conDay[i]){conNum = (byte)i;}
        }
        System.out.println(conName[conNum]);
    }
    
    
    
    //第十二題  過半元素
    public static void Practive12()
    {
        String[] list = input("輸入一整數序列為：").split(" ");
        System.out.print("過半元素為：");
        boolean c = true;
        for(int i=0;i<list.length-1;i++)
        {
            int count = 1;
            for(int j=i+1;j<list.length;j++)
            {
                if(list[i].equals(list[j])){count++;}
            }
            
            if(count>list.length/2){System.out.print(list[i] + " ");c=false;break;}
        }
        if(c){System.out.println("NO");}else{System.out.println();}
    }
    
    
    
    //第十三題  迴文問題
    public static void Practive13()
    {
        String str = input("輸入一字元為：");
        StringBuilder strb = new StringBuilder(str);
        if(str.equals(strb.reverse().toString())){System.out.println("YES");}
        else{System.out.println("NO");}
    }
    
    
    
    //第十四題  輸入字串算字元
    public static void Practive14()
    {
        System.out.println("There are " + input("輸入一字串為：").length() + " characters");
    }
    
    
    
    //第十五題  數字加密
    public static void Practive15()
    {
        String str = input("輸入一組四位數字為：");
        String outStr = "";
        for(int i=2;i<str.length()+2;i++)
        {
            outStr += ((int)(str.charAt(i%4))+7-(int)'0')%10;
        }
        System.out.println(outStr);
    }
    
    
    
    //第十六題  撲克遊戲 (暫時跳過)
    public static void Practive16()
    {
        String[] str1 = input("").split(" ");
        //String[] str2 = input("").split(" ");
        int score1,score2;

        System.out.println(ScoreCount(str1));
        
        
    }
    
    public static int ScoreCount(String[] str)
    {
        int score=0;
        int[] num = new int[5];
        for(int i=0;i<str.length;i++)
        {
            num[i] = Integer.parseInt(str[i].substring(1, str[i].length()));
        }
        int[] num1 = num;
        Arrays.sort(num1);
        for(int i=0;i<num.length;i++) //高牌花色分數
        {
            if(num1[4]==num[i]){score+=ColorScore(str[i].charAt(0));}
        }
        if(Sum(num1)/num1.length==(double)num[2]) //順子
        {
            score+=5000;
            boolean color = true;
            for(int i=1;i<str.length;i++){if(str[i].charAt(0)!=str[i-1].charAt(0)){color=false;}}
            if(color){score+=2000;} //同花
        }
        int[] other = MaxCounter(num);
        System.out.println(Arrays.toString(other));
        switch(other[1])
        {
            case 4:
                score += 6000;
            case 5:
                score += 5000;
            case 3:
                score += 3000;
            case 8:
                score += 2000;
            case 2:
                score += 1000;                
        }
        if(other[0]==1){score+=20;}
        else{score+=other[0];}
        
        return score;
    }
    
    public static int Sum(int[] list)
    {
        int total=0;
        for(int i=0;i<list.length;i++)
        {
            total += list[i];
        }
        return total;
    }
    
    public static int ColorScore(char color)
    {
        switch(color)
        {
            case 'S':
                return 400;
            case 'H':
                return 300;
            case 'D':
                return 200;
            case 'C':
                return 100;
        }
        return 0;
    }

    public static int[] MaxCounter(int[] list)
    {
        int[] count = new int[5];
        int[] num = new int[5];
        for(int i=0;i<list.length;i++)
        {
            boolean a =true;
            for(int j=0;j<num.length;j++)
            {
                if(list[i]==num[j]){a=false;count[j]++;}
            }
            if(a){num[i]=list[i];count[i]=1;}
        }
        int[] counter = {0,1};
        int[] sort = {0,0};
        boolean haveA = false;
        for(int i=0;i<num.length;i++)
        {
            if(count[i]==4){counter[0]=num[i];counter[1]=4;return counter;}
            if(count[i]==3){counter[0]=num[i];counter[1]=3;}
            if(count[i]==2)
            {   
                counter[1]=2;
                if(num[i]==1){counter[0]=1;}
                else{if(sort[0]==0){sort[0]=num[i];}else{sort[1]=num[i];}}
            }
            if(num[i]==1){haveA=true;}
        }
        if(counter[1]==3 && sort[0]!=0){counter[1]=5;return counter;}
        if(sort[1]!=0){counter[1]=8;}
        Arrays.sort(sort);
        Arrays.sort(num);
        if(counter[0]==0){if(haveA){counter[0]=num[4];}else{counter[0]=1;}}
        else if(counter[0]==1){}
        else{counter[0]=sort[1];}
        
        return counter;
    }
    
    
    
    //第十七題  矩陣相加
    public static void Practive17()
    {
    
    }
}


