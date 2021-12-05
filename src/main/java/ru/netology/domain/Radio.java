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

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
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
            currentVolume --;
        }
        if (currentVolume == minVolume) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }
}







