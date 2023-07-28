package com.mycompany.tennis;

import com.mycompany.tennis.controller.ScoreController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ScoreController controller = new ScoreController();
        controller.scoreById();

    }
}
