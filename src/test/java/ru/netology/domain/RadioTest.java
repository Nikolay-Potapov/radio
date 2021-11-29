package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void indicateTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void indicateMaxTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void indicateMinTheStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void stationIncrease() {
        Radio radio = new Radio();
        radio.increaseStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void stationDecrease() {
        Radio radio = new Radio();
        radio.turnDownTheStation();
        assertEquals(7, radio.getCurrentStation());
    }

//////////////////Volume//////////////////////

    @Test
    public void increaseInSoundMaxLevel() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void decreaseInSoundMinLevel() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

}

