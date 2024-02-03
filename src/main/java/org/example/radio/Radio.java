package org.example.radio;
public class Radio {
    private int NumberCurrentStation;
    private int Volume;

    public int getNumberCurrentStation() {
        return NumberCurrentStation;
    }

    public int getVolume() {
        return Volume;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        if (NumberCurrentStation < 0) {
            return;
        }
        if (NumberCurrentStation > 9) {
            return;
        }
        this.NumberCurrentStation = numberCurrentStation;
    }


    public void setVolume(int volume) {
        if (Volume < 0) {
            return;
        }
        if (Volume > 100) {
            return;
        }
        this.Volume = volume;
    }

    public void increaseStation() {                           // Следующая Станция
        if (NumberCurrentStation < 9) {
            NumberCurrentStation = NumberCurrentStation + 1;
        } else {
            NumberCurrentStation = 0;
        }
    }

    public void decreaseStation() {                          // Предыдущая станция
        if (NumberCurrentStation > 0) {
            NumberCurrentStation = NumberCurrentStation - 1;
        } else {
            NumberCurrentStation = 9;
        }
    }

    public void volumeUp() {                // Увеличение громкости
        if (Volume < 10) {
            Volume = Volume + 1;
        }
    }

    public void volumeDown() {              // Уменьшение громкости
        if (Volume > 0) {
            Volume = Volume - 1;
        }
    }
}