package org.example.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(5);

        int expected = 5;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(0);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(-1);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFirstStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(1);

        int expected = 1;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(2);

        int expected = 2;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEightStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(8);

        int expected = 8;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNineStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(9);

        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTenStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(10);

        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}




