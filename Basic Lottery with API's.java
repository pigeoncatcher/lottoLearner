package com.example.console;

import java.util.Random;

import java.util.Set;

import java.util.TreeSet;

/**
 *
 * @author KAPLAN 
 */
public class LotteryCollections {
    private static final int SIZE = 6;
    private static Random random;
    public static void main(String[] args) {
        random = new Random();
        Set<Byte> numbers= new TreeSet<>();
        while (numbers.size()<SIZE){
           numbers.add((byte) (random.nextInt(49) + 1));//0-50 between numbers using -->General using
        }
        System.out.println(numbers);
    }
}