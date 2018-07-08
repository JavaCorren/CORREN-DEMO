package com.example.demo.data.structure;

import lombok.Data;

/**
 * 二叉树
 *
 * @author ZhangGR
 * @created on 2018/5/20
 **/
@Data
public class CorrenBinaryTree {

    private CorrenNode root;


    @Data
    public static class CorrenNode{

        private Integer value;

        private CorrenNode left;

        private CorrenNode right;

        public CorrenNode(Integer value) {
            this.value = value;
        }

    }

    /**
     * 插入元素
     * @param value
     * @return
     * @should test
     */
    public boolean insert(Integer value) {

        if (root == null) {
            root = new CorrenNode(value);
            return true;
        }


        CorrenNode parent = findInsertingLocation(value);

        if (parent == null) {
            System.out.println("The value "+value+" already exists, hence it can't be inserted into the binary tree again");
            return false;
        }

        if (value.compareTo(parent.value) < 0) {
            parent.left = new CorrenNode(value);
        }

        if (value.compareTo(parent.value) > 0) {
            parent.right = new CorrenNode(value);
        }

        return true;
    }

    /**
     * 查找元素
     * @param value
     * @return
     */
    public CorrenNode find(Integer value) {

        if (root == null) {
            return null;
        }

        return find(value, root);
    }

    /**
     * 找到插入位置的父节点
     * @param value
     * @return
     */
    public CorrenNode findInsertingLocation(Integer value) {

        return findLocation(value, root);

    }

    /**
     * 递归查找元素
     * @param value
     * @param root
     * @return
     */
    private CorrenNode findLocation(Integer value, CorrenNode root) {

        if (value.equals(root.value)) {
            System.out.println("The value already exists!");
            return null;
        }


        if (value.compareTo(root.value) < 0) {
            if (root.left == null) {
                return root;
            } else {
                return findLocation(value, root.left);
            }
        } else {
            if (root.right == null) {
                return root;
            }else {
                return findLocation(value, root.right);
            }
        }

    }


    /**
     * 递归查找元素
     * @param value
     * @param root
     * @return
     */
    private CorrenNode find(Integer value, CorrenNode root) {

        if (value.equals(root.value)) {
            return root;
        }

        if (value.compareTo(root.value) < 0) {
            root = root.left;
        }

        if (value.compareTo(root.value) > 0) {
            root = root.right;
        }

        if (root == null) {
            System.out.println("Target value : " + value +" cannot be found!");
            return null;
        }

        return find(value, root);
    }


    public void preOrder_display() {

        preOrderIterate(root);

    }

    /**
     * 前序遍历二叉树
     */
    public void preOrderIterate(CorrenNode root) {

        System.out.println("value" + root.value);

        if (root.left != null) {
            preOrderIterate(root.left);
        }

        if (root.right != null) {
            preOrderIterate(root.right);
        }
    }

    /**
     * 删除节点
     * @param value
     */
    public void deleteNode(Integer value) {
        
    }

}
