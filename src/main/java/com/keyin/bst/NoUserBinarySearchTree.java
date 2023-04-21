package com.keyin.bst;

public class NoUserBinarySearchTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public NoUserBinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = insertNode(this.root, value);
    }

    private Node insertNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertNode(node.left, value);
        } else if (value > node.value) {
            node.right = insertNode(node.right, value);
        }

        return node;
    }

    public void printTree() {
        printNode(this.root, 0);
    }

    private void printNode(Node node, int level) {
        if (node == null) {
            return;
        }

        printNode(node.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
        System.out.println(node.value);
        printNode(node.left, level + 1);
    }
}






