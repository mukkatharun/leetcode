package com.company.practice;

public class StackImplementationUsingArray {
  int size;
    int stack[];
    int top;

    StackImplementationUsingArray(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if(size -2 != top) {
            top++;
            stack[top] = value;
            System.out.println("Pushed element" + value);
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if(top != -1 ) {
            int topValue = stack[top];
            top--;
            System.out.println("the popped element " + topValue);
        }
        else {
            System.out.println("the stack is empty");
        }
    }

    public void top() {
        int topEkement = stack[top];
        System.out.println("the top element us " + topEkement);
    }

    public static void main(String args[]) {
        StackImplementationUsingArray stackImplementationUsingArray = new StackImplementationUsingArray(5);
        stackImplementationUsingArray.pop();
        stackImplementationUsingArray.push(5);
        stackImplementationUsingArray.push(1);
        stackImplementationUsingArray.push(2);
        stackImplementationUsingArray.pop();
        stackImplementationUsingArray.top();
        stackImplementationUsingArray.push(6);
        stackImplementationUsingArray.push(4);
        stackImplementationUsingArray.top();
    }
}
