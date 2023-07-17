package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.service.JoueurService;

import java.util.Scanner;

public class JoueurController {

    private JoueurService joueurService;

    public JoueurController() {
        this.joueurService = new JoueurService();
    }

    public void displayPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'id du joueur dont vous voulez afficher les informations");
        Long id = scanner.nextLong();

        Joueur joueur = this.joueurService.getJoueur(id);
        System.out.printf("Le joueur est %s %s \n",joueur.getNom(), joueur.getPrenom());

    }
    public void createPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le nom du nouveau joueur ? ");
        String nom = scanner.nextLine();
        System.out.println("Quel est le prénom du nouveau joueur? ");
        String prenom = scanner.nextLine();
        System.out.println("Quel est le sexe du nouveau joueur?[F/H] ");
        Character sex = scanner.nextLine().charAt(0);
        Joueur newPlayer = new Joueur();
        newPlayer.setNom(nom);
        newPlayer.setPrenom(prenom);
        newPlayer.setSexe(sex);
        joueurService.createJoueur(newPlayer);
    }

    public void renommerJoueur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du  joueur que vous souhaitez renommer? ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est le nouveau nom du nouveau joueur? ");
        String nom = scanner.nextLine();

        joueurService.renamePlayer(id, nom);
    }

    public void sexChange(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du  joueur ? ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Quel est le nouveau sexe du nouveau joueur? ");
        char sex = scanner.nextLine().charAt(0);

        joueurService.sexeChange(id, sex);
    }
    public void supprimerJoueur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du  joueur à supprimer? ");
        long id = scanner.nextLong();


        joueurService.removePlayer(id);
    }


}
