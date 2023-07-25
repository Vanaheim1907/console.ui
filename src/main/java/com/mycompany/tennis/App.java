package com.mycompany.tennis;

import com.mycompany.tennis.controller.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       /* JoueurController joueurController = new JoueurController();
        joueurController.displayPlayer();*/

       /* TournoiController tournoiController = new TournoiController();
        tournoiController.getTournoi();*/

        /*JoueurController joueurController = new JoueurController();
        joueurController.createPlayer();*/

       /* EpreuveController controller = new EpreuveController();
        controller.afficheDernierEpreuve();*/

        MatchController controller = new MatchController();
        controller.afficherMatch();
    }
}
