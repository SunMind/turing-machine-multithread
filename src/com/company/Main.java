package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        RunnableTuringMachine R1 = new RunnableTuringMachine("Turing machine number 1");
        R1.start();

        RunnableTuringMachine R2 = new RunnableTuringMachine("Turing machine number 2");
        R2.start();
    }
}
