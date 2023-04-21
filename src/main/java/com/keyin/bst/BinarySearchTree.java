package com.keyin.bst;

import java.awt.*;

import java.util.Scanner;

public class BinarySearchTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void printTree(Node root, String prefix, boolean isLeft) {
        if (root == null) {
            return;
        }

        if (root.right != null) {
            printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
        }

        System.out.print(prefix);
        System.out.print(isLeft ? "└── " : "┌── ");
        System.out.println(root.value);

        if (root.left != null) {
            printTree(root.left, prefix + (isLeft ? "    " : "│   "), true);
        }
    }
}
