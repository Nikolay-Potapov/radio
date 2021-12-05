package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void indicateTheStationNumber() {
        Radio radio = new Radio(0,9,5,10);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void indicateMaxTheStationNumber() {
        Radio radio = new Radio(0,9,10,10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void indicateMinTheStationNumber() {
        Radio radio = new Radio(0,9,-1,10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void stationIncrease() {
        Radio radio = new Radio(0,9,5,10);
        assertEquals(6, radio.increaseStation());
    }

    @Test
    public void stationIncreaseMax() {
        Radio radio = new Radio(0,9,9,10);
        assertEquals(0, radio.increaseStation());
    }

    @Test
    public void stationDecrease() {
        Radio radio = new Radio(0,9,5,10);
        assertEquals(4, radio.turnDownTheStation());
    }

    @Test
    public void stationDecreaseMin() {
        Radio radio = new Radio(0,9,0,10);
        assertEquals(9, radio.turnDownTheStation());
    }

//////////////////////////////////////////////////////Volume//////////////////////

    @Test
    public void increaseInSoundMaxLevel() {
        Radio radio = new Radio(0,100,100);
        assertEquals(100, radio.increaseVolume());
    }

    @Test
    public void increaseInSoundLevel() {
        Radio radio = new Radio(0,100,50);
        assertEquals(51, radio.increaseVolume());
    }

    @Test
    public void decreaseInSoundMinLevel() {
        Radio radio = new Radio(0,100,0);
        assertEquals(0, radio.decreaseVolume());
    }

    @Test
    public void decreaseInSoundLevel() {
        Radio radio = new Radio(0,100,50);
        assertEquals(49, radio.decreaseVolume());
    }

}
