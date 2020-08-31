package com.company.orzelowski;

import javax.print.attribute.standard.Media;

public class Main {

    public static void main(String[] args) {
        int maxRandomNumber = 20;
        int minRandomNumber = -20;
        Median median = new Median();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
        median.addNumber((int) (Math.random() * (maxRandomNumber -minRandomNumber + 1) + minRandomNumber));
        median.printMedian();
    }
}
