package ru.netology.domain;

public class Radio {

    private int minStation;
    private int maxStation;
    private int currentStation;

    private int minVolume;
    private int maxVolume;
    private int currentVolume;

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
        if (currentStation < 10) {
            currentStation = currentStation + 1;
        }
    }

    public void turnDownTheStation() {
        if (currentStation < 1) {
            currentStation = currentStation + 1;
        }
    }

///////////////////Volume/////////////////

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int i) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume(int i) {
        if (currentVolume > 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume + 1;
        }
    }
}






