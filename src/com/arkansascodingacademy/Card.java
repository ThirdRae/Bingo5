package com.arkansascodingacademy;

import java.util.ArrayList;
import java.util.Random;

public class Card
{
    private Square square[][];
    private boolean covered;
    //private int[][] bingoCard = new int[5][5];
    //private Random randomNumber;


    public Card()
    {
        square = new Square[5][5];
        covered = false;
        //square[2][2] = 0;
        //fillCardSquares();

        square[0][0] = new Square(13);
        square[0][1] = new Square(16);
        square[0][2] = new Square(33);
        square[0][3] = new Square(47);
        square[0][4] = new Square(67);

        square[1][0] = new Square(15);
        square[1][1] = new Square(17);
        square[1][2] = new Square(38);
        square[1][3] = new Square(51);
        square[1][4] = new Square(61);

        square[2][0] = new Square(3);
        square[2][1] = new Square(25);
        square[2][2] = new Square(0);
        square[2][2].cover();
        square[2][3] = new Square(46);
        square[2][4] = new Square(66);

        square[3][0] = new Square(14);
        square[3][1] = new Square(19);
        square[3][2] = new Square(39);
        square[3][3] = new Square(56);
        square[3][4] = new Square(65);

        square[4][0] = new Square(2);
        square[4][1] = new Square(24);
        square[4][2] = new Square(44);
        square[4][3] = new Square(55);
        square[4][4] = new Square(69);
    }


    public void print()
    {
        //Go through rows 0 to 4
        for (int row = 0; row < 5; row++)
        {
            //For the current row go through columns 0 to 4
            for (int column = 0; column < 5; column++)
            {
                //print out the square
                square[row][column].print();
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    public void play(int number)
    {
        for (int row = 0; row < 5; row++)
        {

            for (int column = 0; column < 5; column++)

            {
                //check for the number
                if (square[row][column].getNumber() == number)
                {
                    square[row][column].cover();
                }
            }

        }
    }


    public boolean bingo()
    {
        boolean bingo = false;
        //check for row
        for (int row = 0; row < 5; row++)
        {       //check to see if the square is covered
            if (square[row][0].isCovered() &&
                    square[row][1].isCovered() &&
                    square[row][2].isCovered() &&
                    square[row][3].isCovered() &&
                    square[row][4].isCovered())
            {
                bingo = true;
            }
        }

        for (int column = 0; column < 5; column++)
            {
                if (square[column][0].isCovered() &&
                        square[column][1].isCovered() &&
                        square[column][2].isCovered() &&
                        square[column][3].isCovered() &&
                        square[column][4].isCovered())


                {
                    bingo = true;
                }
            }
            return bingo;

        }





    public static void main(String[] args)
    {
        Card card = new Card();
        card.print();
    }

}


