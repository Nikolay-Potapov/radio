package ru.netology.domain;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = 8;

    private int currentVolume = 5;

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void turnDownTheStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

///////////////////Volume/////////////////

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10 ) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}








