package com.company.easy;

import java.util.Scanner;
import java.util.Stack;

public class Question20ValidParentheses {
    public static boolean checkChars(char a, char b)
    {
        if(a == '(' && b== ')') return true;
        else if (a == '{' && b== '}') return true;
        else if (a == '[' && b== ']') return true;
        else return false;
    }
    public static boolean validate(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        char c;
        for(int i=0;i<s.length();i++)
        {
            c = s.charAt(i);

            if(c==')' || c == '}' || c == ']')
            {
                char topElement = stack.empty() ? '#' : stack.pop(); // # just a random char when stack is empty

                if(!checkChars(topElement, c)) return false;
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        boolean result  = validate(s);
        System.out.println((result));
    }
}
