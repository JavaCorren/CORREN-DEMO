package com.example.demo.data.structure;

import lombok.Data;

/**
 * 双向链表
 *
 * @author ZhangGR
 * @created on 2018/5/19
 **/
@Data
public class BiDirectionalLinkedArray<T> {

    private Node<T> head;

    private int count;

    public BiDirectionalLinkedArray(T t) {
        this.head = new Node(t);
        head.previous = head;
        head.next = head;
        this.count++;
    }

    @Data
    public static class Node<T> {

        private Node<T> previous;

        private Node<T> next;

        private T t;

        public Node(T param) {
            this.t = param;
        }
    }

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * 链表大小获取
     * @return
     */
    public int size() {
        return count;
    }

    /**
     * 尾部添加元素
     * @param t
     * @return
     */
    public boolean append(T t) {

        Node<T> target = new Node(t);

        //当元素为空的时候
        if (head == null) {
            head = target;
            head.next = head;
            head.previous = head;
            return true;
        }

        //链表不为空的时候
        Node<T> end = head.previous;

        //插入目标元素
        end.next = target;
        head.previous = target;
        end = target;

        //插入指定位置
        this.count++;
        return true;
    }

    /**
     * 查找指定元素
     * @param t
     * @return
     */
    public Node<T> find(T t) {

        if (head == null) {
            return null;
        }

        Node<T> current = head;
        Node<T> result = null;

        do {
            T val = current.t;

            if (val.equals(t)) {
                result = current;
            } else {
                current = current.next;
            }
        } while (current.next != null);

        return result;
    }

    /**
     *
     * @param index
     * @return
     * @should test
     */
    public Node<T> get(int index){

        if (isEmpty()) {
            return null;
        }

        int mid = count / 2;

        Node<T> current = head;

        //在前半部分
        if (index <= mid) {
            for (int i = 0; i <= mid; i++) {

                if (i == index) {
                    return current;
                } else {
                    current = head.next;
                }

            }
        }

        //在后半部分
        if (index > mid) {
            for (int i = count -1 ; i > mid; i--) {

                if (i == index) {
                    return current;
                } else {
                    current = head.previous;
                }
            }
        }

        throw new RuntimeException("The target cannot be found");
    }

}
