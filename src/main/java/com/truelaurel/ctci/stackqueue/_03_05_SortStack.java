package com.truelaurel.ctci.stackqueue;

import java.util.Stack;

/**
 * Write a program to sort a stack such that the smallest items are on the top.
 * You can use an additional temporary stack,
 * but you may not copy the elements into any other data structure (such as an array).
 * The stack supports the following operations: push, pop, peek, and isEmpty.
 */
class _03_05_SortStack {

    Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (!tmp.isEmpty() && top > tmp.peek()) {
                while (!tmp.isEmpty()) {
                    stack.push(tmp.pop());
                }
            }
            tmp.push(top);
        }
        return tmp;
    }
}
