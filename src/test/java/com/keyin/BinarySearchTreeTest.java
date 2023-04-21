package com.keyin;

import com.keyin.bst.BinarySearchTree;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testInsert() {
        BinarySearchTree.Node root = null;
        root = BinarySearchTree.insert(root, 5);
        assertEquals(5, root.value);
        root = BinarySearchTree.insert(root, 3);
        assertEquals(3, root.left.value);
        root = BinarySearchTree.insert(root, 7);
        assertEquals(7, root.right.value);
        root = BinarySearchTree.insert(root, 2);
        assertEquals(2, root.left.left.value);
        root = BinarySearchTree.insert(root, 4);
        assertEquals(4, root.left.right.value);
        root = BinarySearchTree.insert(root, 6);
        assertEquals(6, root.right.left.value);
        root = BinarySearchTree.insert(root, 8);
        assertEquals(8, root.right.right.value);
    }

    @Test(expected = NumberFormatException.class)
    public void testInsertInvalidInput() {
        BinarySearchTree.Node root = null;
        root = BinarySearchTree.insert(root, Integer.parseInt("not a number"));
    }

    @Test
    public void testInsertDuplicateValue() {
        BinarySearchTree.Node root = null;
        root = BinarySearchTree.insert(root, 5);
        assertEquals(5, root.value);
        root = BinarySearchTree.insert(root, 3);
        assertEquals(3, root.left.value);
        root = BinarySearchTree.insert(root, 7);
        assertEquals(7, root.right.value);
        root = BinarySearchTree.insert(root, 7);
        assertEquals(7, root.right.value);
    }
}

