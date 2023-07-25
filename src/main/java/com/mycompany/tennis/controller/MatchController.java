package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.EpreuveLightDto;
import com.mycompany.tennis.core.dto.MatchDto;
import com.mycompany.tennis.core.service.EpreuveService;
import com.mycompany.tennis.core.service.MatchService;

import java.util.Scanner;

public class MatchController {

    MatchService matchService;

    public MatchController(){
        this.matchService = new MatchService();
    }

    public void afficherMatch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id du match dont vous voulez afficher les informations");
        Long id = scanner.nextLong();
        MatchDto match = this.matchService.getMatchById(id);
        System.out.println("Le vainqueur du match est :" + match.getVainqueur().getNom());
        System.out.println("Le finaliste du match est :" + match.getFinaliste().getNom());

    }

}
