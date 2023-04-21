package com.keyin.bst;

public class NoUserBinarySearchTreeDemo {

    public static void main(String[] args) {
        NoUserBinarySearchTree tree = new NoUserBinarySearchTree();
        tree.insert(7);
        tree.insert(3);
        tree.insert(10);
        tree.insert(0);
        tree.insert(2);
        tree.insert(6);
        tree.insert(9);

        tree.printTree();
    }
}
