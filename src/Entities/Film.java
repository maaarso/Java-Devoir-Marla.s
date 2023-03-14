package Entities;

import java.util.ArrayList;

public class Film
{
    private int idFilm;
    private String nomFilm;
    private int nbVotes;
    private int totalVotes;

    private ArrayList<Acteur> lesActeurs;
    public Film(int unId, String unNom,int unNbVotes, int unTotal)
    {
        idFilm = unId;
        nomFilm = unNom;
        nbVotes = unNbVotes;
        totalVotes = unTotal;
        lesActeurs = new ArrayList<>();
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public int getNbVotes() {
        return nbVotes;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public ArrayList<Acteur> getLesActeurs() {
        return lesActeurs;
    }

    public void AjouterUnActeur(Acteur unActeur)
    {
        lesActeurs.add(unActeur);
    }

    // Cette méthode permet de calculer la note d'un film
    // En cumulant chaque note de tous les acteurs du film
    public int CalculerNote()
    {
        int note = 0;

        // A compléter ici

        for (Acteur act : lesActeurs)
        {
            note = note + act.getNoteActeur();
        }
        return note;
    }

    // Cette méthode permet de déterminer le meilleur acteur du film.
    // Le meilleur acteur est celui qui possède la meilleure note
    public Acteur getBestActeur()
    {
        Acteur bestActeur = null;
        int noteMax = 0;

        for (Acteur act : lesActeurs)
        {
            if (act.getNoteActeur()>noteMax)
            {
                noteMax = act.getNoteActeur();
                bestActeur = act;
            }

        }
        return bestActeur;
    }
}
