package com.planisense.test.dto;

import com.planisense.test.entity.Point;

public class TreeApiDto {
    private long id;
    private Long idbase;
    private String typeemplacement;
    private String domanialite;
    private String arrondissement;
    private String complementadresse;
    private String numero;
    private String adresse;
    private String idemplacement;
    private String libellefrancais;
    private String genre;
    private String espece;
    private String varieteoucultivar;
    private float circonferenceencm;
    private float hauteurenm;
    private String stadedeveloppement;
    private String remarquable;
    private Point geo_point_2d;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdbase(Long idbase) {
        this.idbase = idbase;
    }

    public Point getGeo_point_2d() {
        return geo_point_2d;
    }

    public void setGeo_point_2d(Point geo_point_2d) {
        this.geo_point_2d = geo_point_2d;
    }

// Getter Methods

    public long getIdbase() {
        return idbase;
    }

    public String getTypeemplacement() {
        return typeemplacement;
    }

    public String getDomanialite() {
        return domanialite;
    }

    public String getArrondissement() {
        return arrondissement;
    }

    public String getComplementadresse() {
        return complementadresse;
    }

    public String getNumero() {
        return numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getIdemplacement() {
        return idemplacement;
    }

    public String getLibellefrancais() {
        return libellefrancais;
    }

    public String getGenre() {
        return genre;
    }

    public String getEspece() {
        return espece;
    }

    public String getVarieteoucultivar() {
        return varieteoucultivar;
    }

    public float getCirconferenceencm() {
        return circonferenceencm;
    }

    public float getHauteurenm() {
        return hauteurenm;
    }

    public String getStadedeveloppement() {
        return stadedeveloppement;
    }

    public String getRemarquable() {
        return remarquable;
    }



    // Setter Methods

    public void setIdbase( long idbase ) {
        this.idbase = idbase;
    }

    public void setTypeemplacement( String typeemplacement ) {
        this.typeemplacement = typeemplacement;
    }

    public void setDomanialite( String domanialite ) {
        this.domanialite = domanialite;
    }

    public void setArrondissement( String arrondissement ) {
        this.arrondissement = arrondissement;
    }

    public void setComplementadresse( String complementadresse ) {
        this.complementadresse = complementadresse;
    }

    public void setNumero( String numero ) {
        this.numero = numero;
    }

    public void setAdresse( String adresse ) {
        this.adresse = adresse;
    }

    public void setIdemplacement( String idemplacement ) {
        this.idemplacement = idemplacement;
    }

    public void setLibellefrancais( String libellefrancais ) {
        this.libellefrancais = libellefrancais;
    }

    public void setGenre( String genre ) {
        this.genre = genre;
    }

    public void setEspece( String espece ) {
        this.espece = espece;
    }

    public void setVarieteoucultivar( String varieteoucultivar ) {
        this.varieteoucultivar = varieteoucultivar;
    }

    public void setCirconferenceencm( float circonferenceencm ) {
        this.circonferenceencm = circonferenceencm;
    }

    public void setHauteurenm( float hauteurenm ) {
        this.hauteurenm = hauteurenm;
    }

    public void setStadedeveloppement( String stadedeveloppement ) {
        this.stadedeveloppement = stadedeveloppement;
    }

    public void setRemarquable( String remarquable ) {
        this.remarquable = remarquable;
    }


}
