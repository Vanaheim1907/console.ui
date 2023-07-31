package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.*;
import com.mycompany.tennis.core.entity.Match;
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
        System.out.println("Il s'agit d'un match de : " + match.getEpreuve().getAnnee() + " qui s'est déroulé à " + match.getEpreuve().getTournoi().getNom());
        System.out.println("Les sets sont du score ");
        System.out.println("SET 1 : " + match.getScore().getSet1());
        System.out.println("SET 2 : " + match.getScore().getSet2());
        if (match.getScore().getSet3() != null)System.out.println("SET 3 : " + match.getScore().getSet3());
        if (match.getScore().getSet4() != null)System.out.println("SET 4 : " + match.getScore().getSet4());
        if (match.getScore().getSet5() != null)System.out.println("SET 5 : " + match.getScore().getSet5());

    }

    public void tapisVert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id du match dont vous voulez annuler?");
        Long id = scanner.nextLong();
        this.matchService.tapisVert(id);

    }

    public void createMatch(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'épreuve");
        Long epreuveId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est l'identifiant du vainqueur");
        Long vainqueurId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est l'identifiant du finaliste");
        Long finalisteId = scanner.nextLong();
        scanner.nextLine();
        MatchDto matchDto = new MatchDto();
        matchDto.setEpreuve(new EpreuveFullDto());
        matchDto.getEpreuve().setId(epreuveId);

        matchDto.setFinaliste(new JoueurDto());
        matchDto.getFinaliste().setId(finalisteId);

        matchDto.setVainqueur(new JoueurDto());
        matchDto.getVainqueur().setId(vainqueurId);

        System.out.println("Quel est le résultat du Set 1");
        byte set1 = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Quel est le résultat du Set 2");
        byte set2 = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Quel est le résultat du Set 3");
        byte set3 = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Quel est le résultat du Set 4");
        byte set4 = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Quel est le résultat du Set 5");
        byte set5 = scanner.nextByte();
        scanner.nextLine();

        ScoreFullDto scoreDto = new ScoreFullDto();

        scoreDto.setSet1(set1);
        scoreDto.setSet2(set2);
        scoreDto.setSet3(set3);
        scoreDto.setSet4(set4);
        scoreDto.setSet5(set5);
        matchDto.setScore(scoreDto);
        scoreDto.setMatch(matchDto);


        this.matchService.createMatch(matchDto);
    }

    public void deleteMatch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match a supprimer?");
        Long id = scanner.nextLong();
        scanner.nextLine();
        this.matchService.deleteMatch(id);
    }

}
