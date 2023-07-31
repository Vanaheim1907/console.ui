package com.mycompany.tennis;

import com.mycompany.tennis.controller.EpreuveController;
import com.mycompany.tennis.controller.JoueurController;
import com.mycompany.tennis.controller.MatchController;
import com.mycompany.tennis.controller.ScoreController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JoueurController controller = new JoueurController();
        controller.afficheListJoueur();



    }
}
