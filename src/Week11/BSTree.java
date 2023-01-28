/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

/**
 *
 * @author ☆愛冰漾★
 */
public class BSTree {
    public TreeNode head;
    public BSTree(){
        this.head = null;
    }
    public BSTree(int data){
        head.data = data;
    }
    
    public void insertTreeNode(int data){
        if(head == null){
            head = new TreeNode(data);
        }else{
            insertTreeNode(data, head);
        }
    }
    void insertTreeNode(int data, TreeNode current){
        if(data > current.data){
            if(current.right == null){
                current.right = new TreeNode(data);
            }else{
                insertTreeNode(data, current.right);
            }
        }else if((data < current.data)){
            if(current.left == null){
                current.left = new TreeNode(data);
            }else{
                insertTreeNode(data, current.left);
            }
        }else{
            System.out.println("已存在此元素");
        }
    }
    
    //public TreeNode deleteTreeNode(int data, TreeNode node){
        
    //}
    
    public void preOrderString(TreeNode node){
        if(node != null){
            System.out.print("[" + node.data + "]");
            preOrderString(node.left);
            preOrderString(node.right);
        }
    }
    public void inOrderString(TreeNode node){
        if(node != null){
            preOrderString(node.left);
            System.out.print("[" + node.data + "]");
            preOrderString(node.right);
        }
    }
    public void postOrderString(TreeNode node){
        if(node != null){
            preOrderString(node.left);
            preOrderString(node.right);
            System.out.print("[" + node.data + "]");
        }
    }
    
}
