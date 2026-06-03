package org.testleaf.week2.day1;

public class LearnMethods {

    // creating a method

    public void makeCall() {
        System.out.println("makecall");
    }

    // creating one more method
    public void sendMessage() {
        System.out.println("sendMessage");
    }

    public static void main(String[] args) {

        // create object to call the method
        // ClassName objName=new ClassName();
        // objName.methodName();

        LearnMethods mobileOptions = new LearnMethods();
        mobileOptions.makeCall();
        mobileOptions.sendMessage();

    }

}
