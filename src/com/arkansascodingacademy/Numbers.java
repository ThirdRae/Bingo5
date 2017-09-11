package com.arkansascodingacademy;

// TODO: 9/11/2017 Square and Diagonal 

import java.util.ArrayList;
import java.util.Random;

public class Numbers
{
    private ArrayList <Integer> uncalledNumbers;
    private ArrayList <Integer> calledNumbers;
    Random random;

    public Numbers()
    {
       uncalledNumbers = new ArrayList<>();

       for (int i = 1; i <=75; i++)
       {
           uncalledNumbers.add(i);
       }
       calledNumbers = new ArrayList<>();

       random = new Random();
    }

    public int draw()
    {
        //Get a random number from 0 to (number of remaining cards -1)
        int randomNumber = random.nextInt(uncalledNumbers.size());

        //Get a number from the list of numbers using the randomNumber position
        int calledNumber = uncalledNumbers.remove(randomNumber);

        //Keep track of the numbers call so far
        calledNumbers.add(calledNumber);

        return calledNumber;
    }

    public void printCalledNumbers()
    {
        for (int number : calledNumbers)
        {
            System.out.print(number + " ");
        }

        System.out.println(); //to print a blank line after printCalledNumbers is ru
    }

    public void printUncalledNumbers()
    {
        for (int number : uncalledNumbers)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main (String [] args)
    {
        Numbers numbers = new Numbers();
        numbers.draw();
        numbers.draw();
        numbers.printCalledNumbers();
        numbers.printUncalledNumbers();
        numbers.draw();
        numbers.draw();
        numbers.printCalledNumbers();
        numbers.printUncalledNumbers();

    }
}
