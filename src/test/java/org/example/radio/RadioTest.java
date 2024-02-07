package org.example.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(5);
        radio.increaseStation();

        int expected = 6;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(0);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFirstStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(1);
        radio.increaseStation();

        int expected = 2;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(2);
        radio.increaseStation();

        int expected = 3;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEightStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(8);
        radio.increaseStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNineStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(9);

        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualsNineStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(9);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTenStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(4);
        radio.decreaseStation();

        int expected = 3;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownMinusStation() {
        Radio radio = new Radio(10);
        radio.setNumberCurrentStation(0);
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.volumeUp();

        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTen() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(5);
        radio.volumeDown();

        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinus() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}



