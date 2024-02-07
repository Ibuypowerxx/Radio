package org.example.radio;

public class Radio {
    private int NumberCurrentStation;
    private int Volume;
    private int maxStation;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    //
    public int getNumberCurrentStation() {
        return NumberCurrentStation;
    }

    public int getVolume() {
        return Volume;
    }

    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < minStation) {
            return;
        }
        if (newNumberCurrentStation > maxStation) {
            return;
        }
        this.NumberCurrentStation = newNumberCurrentStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        this.Volume = newVolume;
    }

    public void increaseStation() {                           // Следующая Станция
        if (NumberCurrentStation < maxStation) {
            NumberCurrentStation = NumberCurrentStation + 1;
        } else {
            NumberCurrentStation = minStation;
        }
    }

    public void decreaseStation() {                          // Предыдущая станция
        if (NumberCurrentStation > minStation) {
            NumberCurrentStation = NumberCurrentStation - 1;
        } else {
            NumberCurrentStation = maxStation;
        }

    }

    public void volumeUp() {                // Увеличение громкости
        if (Volume < maxVolume) {
            Volume = Volume + 1;
        }
    }

    public void volumeDown() {              // Уменьшение громкости
        if (Volume > minVolume) {
            Volume = Volume - 1;
        }
    }
}