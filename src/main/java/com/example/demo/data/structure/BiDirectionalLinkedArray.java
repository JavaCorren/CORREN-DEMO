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

    //头节点
    private Node<T> head;

    //数量
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

        @Override
        public String toString() {
            return "Node{" +
                    "previous t =" + previous.getT() +
                    ", next t =" + next.getT() +
                    ", current t=" + t +
                    '}';
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
        Node<T> end = head.previous;

        //插入目标元素
        end.next = target;
        head.previous = target;
        target.previous = end;
        target.next = head;

        //数组大小自增
        this.count++;
        return true;
    }

    /**
     * 在指定位置插入元素
     * @param t
     * @param index
     * @return
     */
    public boolean insert(T t, int index) {

        Node<T> target = new Node(t);

        Node<T> prev = get(index);

        if (prev == null) {
            System.out.println("指定位置不存在");
            return false;
        }

        Node<T> next = prev.next;

        prev.next = target;
        next.previous = target;
        target.previous = prev;
        target.next = next;

        this.count++;
        return true;
    }

    /**
     * 查找指定元素
     * @param t
     * @return
     */
    public Node<T> find(T t) {

        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }

        Node<T> current = head;

        Node<T> result = null;

        do {
            T val = current.t;

            if (val.equals(t)) {
                result = current;
                break;
            } else {
                current = current.next;
            }
        } while(current.next != current) ;

        return result;
    }

    /**
     * 获取指定位置的元素
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
                    current = current.next;
                }

            }
        }

        //在后半部分
        if (index > mid) {

            current = head.previous;

            for (int i = count -1 ; i > mid; i--) {

                if (i == index) {
                    return current;
                } else {
                    current = current.previous;
                }
            }
        }

        throw new RuntimeException("The target cannot be found");
    }

}
