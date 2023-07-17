package com.mycompany.tennis.controller;

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
        Score score = scoreService.getScore(id);

        System.out.println("Les sets sont du score " + score.getId());
        System.out.println("SET 1 : " + score.getSet1());
        System.out.println("SET 2 : " + score.getSet2());
        if (score.getSet3() != null)System.out.println("SET 3 : " + score.getSet3());
        if (score.getSet4() != null)System.out.println("SET 4 : " + score.getSet4());
        if (score.getSet5() != null)System.out.println("SET 5 : " + score.getSet5());
    }
}
