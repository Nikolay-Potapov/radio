package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void indicateTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void stationIncrease() {
        Radio radio = new Radio();
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.increaseStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void stationDecrease() {
        Radio radio = new Radio();
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.turnDownTheStation();
        assertEquals(1, radio.getCurrentStation());
    }

//////////////////Volume//////////////////////
    @Test
    public void setVolumeLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseInSoundLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void decreaseInSoundLevel() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.decreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

}