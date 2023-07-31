package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.EpreuveLightDto;
import com.mycompany.tennis.core.dto.JoueurDto;
import com.mycompany.tennis.core.entity.Epreuve;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.EpreuveService;
import com.mycompany.tennis.core.service.TournoiService;

import java.util.Scanner;

public class EpreuveController {

    EpreuveService epreuveService;

    public EpreuveController(){
        this.epreuveService = new EpreuveService();
    }

    public void afficheDetailsEpreuve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id de l'épreuve dont vous voulez afficher les informations");
        Long id = scanner.nextLong();
        EpreuveFullDto epreuve = this.epreuveService.getEpreuveDetaille(id);
        System.out.println("Le nom du tournoi est :" + epreuve.getTournoi().getNom());
        System.out.println("Liste des participants :");
        for (JoueurDto joueurDto : epreuve.getParticipants()) {
            System.out.println(joueurDto.getNom() + " " + joueurDto.getPrenom());

        }
    }
    public void afficheRollandGarros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id de l'épreuve dont vous voulez afficher les informations");
        Long id = scanner.nextLong();
        EpreuveLightDto epreuve = this.epreuveService.getEpreuveSansTournoi(id);
    }

    public void displayEpreuveList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le code de l'épreuve dont vous voulez afficher les informations");
        String code = scanner.nextLine();
        for (EpreuveFullDto epreuveFullDto : this.epreuveService.listEpreuve(code)){
            System.out.println(epreuveFullDto.getAnnee() + " " + epreuveFullDto.getType() + " " + epreuveFullDto.getTournoi().getNom());
        }
    }

}
