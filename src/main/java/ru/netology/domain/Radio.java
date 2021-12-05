package ru.netology.domain;

public class Radio {

    private int minStation;
    private int maxStation;
    private int currentStation;

    private int amountStation = 10;

    private int minVolume;
    private int maxVolume;
    private int currentVolume;


    public Radio(int minStation, int maxStation, int currentStation, int amountStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.amountStation = amountStation;

        if (currentStation > maxStation)
            this.currentStation = minStation;

        if (currentStation < minStation)
            this.currentStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public int increaseStation() {
        if (currentStation < maxStation) {
            currentStation ++;
        }
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        return currentStation;
    }

    public int turnDownTheStation() {
        if (currentStation > minStation) {
            currentStation --;
        }
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        return currentStation;
    }

    ///////////////////Volume/////////////////

    public Radio(int minVolume, int maxVolume, int currentVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume ++;

        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;

    }
}








