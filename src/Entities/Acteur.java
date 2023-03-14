package Entities;

public class Acteur
{
    private int idActeur;
    private String nomActeur;
    private int noteActeur;
    private String photoActeur;

    public Acteur(int unId, String unNom,int uneNote, String unePhoto)
    {
        idActeur = unId;
        nomActeur = unNom;
        noteActeur = uneNote;
        photoActeur = unePhoto;
    }

    public int getIdActeur() {
        return idActeur;
    }

    public String getNomActeur() {
        return nomActeur;
    }

    public int getNoteActeur() {
        return noteActeur;
    }

    public String getPhotoActeur() {
        return photoActeur;
    }

    public void setNoteActeur(int noteActeur) {
        this.noteActeur = noteActeur;
    }

    // Cette méthode permet d'additionner la note passée en paramètre
    // à la note de l'acteur. Il s'agit de faire un cumul.
    public void CalculerNoteActeur(int uneNote)
    {
        // A compléter ici
        noteActeur = uneNote + noteActeur;
    }
}
