package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.ScoreFullDto;
import com.mycompany.tennis.core.entity.Score;
import com.mycompany.tennis.core.service.ScoreService;

import java.util.Scanner;

public class ScoreController {

    private ScoreService scoreService;

    public ScoreController(){
        this.scoreService = new ScoreService();
    }

    public void scoreById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du score à récupérer?");
        long id = scanner.nextLong();
        ScoreFullDto score = scoreService.getScore(id);

        System.out.println("Les sets sont du score " + score.getId());
        System.out.println("SET 1 : " + score.getSet1());
        System.out.println("SET 2 : " + score.getSet2());
        if (score.getSet3() != null)System.out.println("SET 3 : " + score.getSet3());
        if (score.getSet4() != null)System.out.println("SET 4 : " + score.getSet4());
        if (score.getSet5() != null)System.out.println("SET 5 : " + score.getSet5());

        System.out.println("Tournament name : " + score.getMatch().getEpreuve().getTournoi().getNom() + " passé en " + score.getMatch().getEpreuve().getAnnee());
        System.out.println("Il s'agissait d'une épreuve de type " + (score.getMatch().getEpreuve().getType().charValue() == 'H' ? "Homme" : "Femme"));
        System.out.println("Le vainqueur du match est : " + score.getMatch().getVainqueur().getNom() + score.getMatch().getVainqueur().getPrenom());
        System.out.println("Le finaliste du match est : " + score.getMatch().getFinaliste().getNom() + score.getMatch().getFinaliste().getPrenom());


    }
}
