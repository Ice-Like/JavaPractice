/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RBTree;

/**
 *
 * @author ☆愛冰漾★
 */
public class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    // Node class representing a node in the tree
    class Node {
        int key;
        Node left, right;
        boolean color;

        Node(int key, boolean color) {
            this.key = key;
            this.color = color;
        }
    }

    // Initialize the root with null
    Node root = null;

    // A utility function to check if a given node is red or not
    boolean isRed(Node node) {
        if (node == null)
            return false;
        return node.color == RED;
    }

    // Left rotate the given node
    Node leftRotate(Node node) {
        Node right = node.right;
        node.right = right.left;
        right.left = node;
        right.color = node.color;
        node.color = RED;
        return right;
    }

    // Right rotate the given node
    Node rightRotate(Node node) {
        Node left = node.left;
        node.left = left.right;
        left.right = node;
        left.color = node.color;
        node.color = RED;
        return left;
    }

    // Flip the colors of the given node and its children
    void flipColors(Node node) {
        node.color = !node.color;
        node.left.color = !node.left.color;
        node.right.color = !node.right.color;
    }

    // Insert the key in the tree
    void insert(int key) {
        root = insert(root, key);
        root.color = BLACK;
    }

    // Insert the key in the subtree rooted at the given node
    Node insert(Node node, int key) {
        if (node == null)
            return new Node(key, RED);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        if (isRed(node.right) && !isRed(node.left))
            node = leftRotate(node);
        if (isRed(node.left) && isRed(node.left.left))
            node = rightRotate(node);
        if (isRed(node.left) && isRed(node.right))
            flipColors(node);

        return node;
    }
}
