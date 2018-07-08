package com.example.demo.data.structure;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ZhangGR
 * @created on 2018/5/20
 **/
public class CorrenBinaryTreeTest {
    /**
     * @verifies test
     * @see CorrenBinaryTree#insert(Integer)
     */
    @Test
    public void insert_shouldTest() throws Exception {

        CorrenBinaryTree correnBinaryTree = new CorrenBinaryTree();

        correnBinaryTree.insert(7);
        correnBinaryTree.insert(5);
        correnBinaryTree.insert(8);
        correnBinaryTree.insert(3);
        correnBinaryTree.insert(4);
        correnBinaryTree.insert(9);
        correnBinaryTree.insert(2);
        correnBinaryTree.insert(6);
        correnBinaryTree.insert(1);

        correnBinaryTree.preOrder_display();
    }
}
