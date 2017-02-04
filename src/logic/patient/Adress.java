package logic.patient;

import logic.enums.OblastRB;

/**
 * Created by User on 04.02.2017.
 */
public class Adress {
    private String country;
    private String region;
    private String city;
    private String rajon;
    private String selsovet;
    private String street;
    private int numberOfHouse;
    private String corpus;
    private int numberOfFlat;
    private OblastRB oblastRB;
    public Adress(){
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRajon() {
        return rajon;
    }

    public void setRajon(String rajon) {
        this.rajon = rajon;
    }

    public String getSelsovet() {
        return selsovet;
    }

    public void setSelsovet(String selsovet) {
        this.selsovet = selsovet;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public String getCorpus() {
        return corpus;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public OblastRB getOblastRB() {
        return oblastRB;
    }

    public void setOblastRB(OblastRB oblastRB) {
        this.oblastRB = oblastRB;
    }

    @Override
    public String toString (){
        return "Адресс: Страна: "+country+'\n'+
                "Область(регион): "+region+'\n'+
                "Город: "+'\n'+city+
                "улица "+street+"дом "+numberOfHouse+"квартира "+numberOfFlat;
    }
}
