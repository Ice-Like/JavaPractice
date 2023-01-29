/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinalexam;
import java.util.*;
import java.io.*;
/**
 *
 * @author ☆愛冰漾★
 */

class Product_Class{
        String name;
        List<Product> products;
        Product_Class(String name){
            this.name = name;
            this.products = new ArrayList<Product>();
        }
        public void addProduct(int num, String name, int price, int per){
            Product prod = new Product(num, name, price, per);
            System.out.println(prod);
            this.products.add(prod);
        }
        public void printList(){
            for(int i=0; i<products.size(); i++){
                System.out.println(products.get(i).Info());
            }
        }
    }


class Product{
        int num;
        String name;
        int price;
        int per;
        Product(int num, String name, int price, int per){
            this.num = num;
            this.name = name;
            this.price = price;
            this.per = per;
        }
        public double PerPrice(){
            return price * per / 100;
        }
        public String Info(){
            return String.format("%d, %s, %d, %d%%", num, name, price, per);
        }
    }
public class JavaFinalExam {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileReader fr = new FileReader("C:/Users/user/Desktop/finalexam/product.txt");
        BufferedReader br = new BufferedReader(fr);
        
        Product_Class pos = new Product_Class("雜貨店");
        boolean c = true;
        while (br.ready()) {
            String[] arg = br.readLine().split("\\s+");
            if(c){c=false;}
            else if(arg.length>2){
                int num = Integer.parseInt(arg[0]);
                String name = arg[2];
                int price = Integer.parseInt(arg[3]);
                int per = Integer.parseInt(arg[4].split("%")[0]);
                System.out.println(num);
                System.out.println(name);
                System.out.println(price);
                System.out.println(per);
                pos.addProduct(num, name, price, per);
               // pos.printList();
            }
        }
        fr.close();
        pos.printList();
    }
    
}
