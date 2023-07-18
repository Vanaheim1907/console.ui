package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.EpreuveLightDto;
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

    public void afficheDernierEpreuve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id de l'épreuve dont vous voulez afficher les informations");
        Long id = scanner.nextLong();
        EpreuveFullDto epreuve = this.epreuveService.getEpreuveAvecTournoi(id);
        System.out.println("Le nom du tournoi est :" + epreuve.getTournoi().getNom());
    }
    public void afficheRollandGarros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id de l'épreuve dont vous voulez afficher les informations");
        Long id = scanner.nextLong();
        EpreuveLightDto epreuve = this.epreuveService.getEpreuveSansTournoi(id);
    }

}
