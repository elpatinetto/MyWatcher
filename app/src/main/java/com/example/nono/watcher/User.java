package com.example.nono.watcher;

/**
 * Created by nono on 27/11/16.
 */

public class User {
    public String nom;
    public String prenom;
    public String adresse;
    public String email;
    public String tel;
    public String password;
    private String latitude;
    private String longitude;


    public User(){

    }
    public User(String nom, String email, String prenom, String adresse, String tel){
        this.nom= nom;
        this.prenom = prenom;
        this.email=email;
        this.tel=tel;
        this.adresse=adresse;
    }
    public User(String nom, String email, String password){
        this.email = email;
        this.nom = nom;
        this.password = password;
    }



}
