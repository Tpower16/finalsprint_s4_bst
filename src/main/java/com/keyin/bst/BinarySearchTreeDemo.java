package com.keyin.bst;

import java.util.Scanner;

import static com.keyin.bst.BinarySearchTree.insert;
import static com.keyin.bst.BinarySearchTree.printTree;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree.Node root = null;

        while (true) {
            System.out.print("Enter a value 1 at a time to insert into the tree, or 'q' to quit: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                root = insert(root, value);
                printTree(root, "", false);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit: ");
            }
        }
    }
}
