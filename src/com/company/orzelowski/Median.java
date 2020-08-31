package com.company.orzelowski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {
    private double medianValue; //stores the actual value of median
    private ArrayList<Integer> numbers = new ArrayList<>(); // arraylist of numbers used to calculate median.

    public double getMedianValue() {
        return medianValue;
    }

    public void printMedian() {
        System.out.println("Inserted number: " + numbers + "\n" + "Median value: " + medianValue);
    }

    public Median() {
        this.medianValue = 0.0;
    }

    public void addNumber(int number) {
        this.numbers.add(number);
        calculateMedian();
    }

    private void calculateMedian() {
        Collections.sort(numbers);
        if(this.numbers.size() % 2 == 0)
            this.medianValue = ((double)this.numbers.get(this.numbers.size() / 2) + (double)this.numbers.get(this.numbers.size() / 2 - 1))/2;
        else
            this.medianValue = (double)this.numbers.get(this.numbers.size()/2);
    }
}
