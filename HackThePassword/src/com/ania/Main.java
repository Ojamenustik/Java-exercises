package com.ania;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numberOfCases = Integer.parseInt(bf.readLine());
            for(int i = 0; i < numberOfCases; ++i){
                String input = bf.readLine();
                ArrayDeque<Character> stack1 = new ArrayDeque<>();
                ArrayDeque<Character> stack2 = new ArrayDeque<>();
                for(char a : input.toCharArray()) {
                    if (a == '<') {
                        if (!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                    } else if (a == '>') {
                        if ( !stack2.isEmpty()) {
                            stack1.push(stack2.pop());
                        }
                    } else if (a == '-') {
                        if (!stack1.isEmpty()) {
                            stack1.pop();
                        }
                    }
                    else{
                        stack1.push(a);
                    }
                }

                StringBuilder builder = new StringBuilder(stack1.size() + stack2.size());
                int sizeOfStack= stack1.size();
                for(int it = 0; it< sizeOfStack; ++it){
                    stack2.push(stack1.pop());
                }
                sizeOfStack = stack2.size();
                for(int it = 0; it< sizeOfStack; ++it){
                    builder.append(stack2.pop());
                }
                System.out.println(builder.toString());

        }
    }
}
//<<--C<D<AKC->>49
//AKDC49
//--------DDDD------e223wz----<<<----322332<<<<------