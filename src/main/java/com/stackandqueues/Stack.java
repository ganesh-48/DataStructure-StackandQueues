package com.stackandqueues;

public class Stack {

    private final MyLinkedList myLinkedList;

    public Stack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack(){
        myLinkedList.printMyNodes();
    }
    /*it is used to peak  the element from the stack.
    * */
    public INode peak(){
        return myLinkedList.head;
    }
    /*  it is used to pop the element.
    * */
    public INode pop() {
        return myLinkedList.pop();
    }
}
