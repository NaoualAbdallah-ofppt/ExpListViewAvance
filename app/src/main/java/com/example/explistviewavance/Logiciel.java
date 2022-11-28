package com.example.explistviewavance;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class Logiciel {
String nom;
String editeur;
int photo;
static  ArrayList<Logiciel> AL = new ArrayList<>(Arrays.asList(
        new Logiciel("Word","Microsoft",R.drawable.word),
        new Logiciel("Android","Google",R.drawable.excel),
        new Logiciel("Access","Microsoft",R.drawable.access)
));
    public Logiciel(String nom, String editeur, int photo) {
        this.nom = nom;
        this.editeur = editeur;
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public static ArrayList<Logiciel> getLstLog()
    {
        return  AL;
    }
    public static  Logiciel getLog(String PNom)
    {
        Log.i("aa","ok classe");
        for (Logiciel L:AL) {
            if (L.nom.equals(PNom))
                return L;
        }
        return  null;
    }
}
