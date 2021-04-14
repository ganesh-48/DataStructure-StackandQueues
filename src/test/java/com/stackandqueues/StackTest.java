package com.stackandqueues;

import com.stackandqueues.com.stackandqueues.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*@Description-To create a stack of 56->30->70
*peak and pop from stack till is empty
 */
public class StackTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        Stack myStack = new Stack();
        MyNode<Integer> myFirstNode= new MyNode<>(70);
        MyNode<Integer> mySecondNode= new MyNode<>(30);
        MyNode<Integer> myThirdNode= new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, peak);
    }

    @Test
    public void given3NumbersInStackWhenPopShouldMatchWithLastAddedNode() {
        Stack myStack = new Stack();
        MyNode<Integer> myFirstNode= new MyNode<>(70);
        MyNode<Integer> mySecondNode= new MyNode<>(30);
        MyNode<Integer> myThirdNode= new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, pop);
    }
}
