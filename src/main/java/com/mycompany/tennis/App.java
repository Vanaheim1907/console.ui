package com.mycompany.tennis;

import com.mycompany.tennis.controller.EpreuveController;
import com.mycompany.tennis.controller.JoueurController;
import com.mycompany.tennis.controller.ScoreController;
import com.mycompany.tennis.controller.TournoiController;

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

        EpreuveController controller = new EpreuveController();
        controller.afficheDernierEpreuve();

    }
}
