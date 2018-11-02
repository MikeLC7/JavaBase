package JavaBase.DataStructure.Stack;


import JavaBase.DataStructure.Stack.implement.optimizeMode.ArrayStack;
import org.junit.Test;

/**
 * Project:
 *
 * File: StackDemoListA
 *
 * Description:
 *
 * @author: MikeLC
 *
 * @date: 2018/11/2 上午 09:30
 *
 * Copyright ( c ) 2018
 *
 */
public class StackDemoListA {


    @Test
    public void testStringReversal(){
        ArrayStack stack = new ArrayStack();
        String str = "how are you";
        char[] cha = str.toCharArray();
        for(char c : cha){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    @Test
    public void testMatch(){
        ArrayStack stack = new ArrayStack(3);
        String str = "12<a[b{c}>]";
        char[] cha = str.toCharArray();
        for(char c : cha){
            switch (c) {
                case '{':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    if(!stack.isEmpty()){
                        char ch = stack.pop().toString().toCharArray()[0];
                        if(c=='}' && ch != '{'
                                || c==']' && ch != '['
                                || c==')' && ch != '('){
                            System.out.println("Error:"+ch+"-"+c);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }


}