package org.testleaf.week2.day1;

public class InputArguments {

    public void takeHqPhotos(int numberOfPhotos) {
        System.out.println(numberOfPhotos);
    }

    public static void main(String[] args) {
        InputArguments iphoneClarity = new InputArguments();
        iphoneClarity.takeHqPhotos(10);
        iphoneClarity.takeHqPhotos(20);

    }

}
