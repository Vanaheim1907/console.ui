package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.TournoiDto;
import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.repository.TournoiDatabaseRepositoryInterface;
import com.mycompany.tennis.core.repository.TournoiRepositoryImpl;
import com.mycompany.tennis.core.service.TournoiService;

import java.util.Scanner;

public class TournoiController {

    TournoiService tournoiService;

    public TournoiController(){
        this.tournoiService = new TournoiService();
    }

    public void getTournoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id du tournoi dont vous voulez afficher les informations");
        Long id = scanner.nextLong();

        TournoiDto tournoi = this.tournoiService.getTournoi(id);
        System.out.printf("Le tournioi est %s %s \n",tournoi.getNom(), tournoi.getCode());
    }

    public void createTournament(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le nom du nouveau tournoi ? ");
        String nom = scanner.nextLine();
        System.out.println("Quel est le code du nouveau tournoi? ");
        String code = scanner.nextLine();

        TournoiDto tournoi = new TournoiDto();
        tournoi.setNom(nom);
        tournoi.setCode(code);
        tournoiService.createTournoi(tournoi);
    }

    public void removeTournament(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id du tournoi que vous souhaitez supprimer?");
        Long id = scanner.nextLong();
        tournoiService.removeTournoi(id);
    }
}
