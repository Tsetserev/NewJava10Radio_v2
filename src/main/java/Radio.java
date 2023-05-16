public class Radio {
    protected int currentStation;
    protected int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        // Проверить
        if (currentVolume > 10) {
            currentVolume = 10;
        } else if (currentVolume < 1) {
            currentVolume = 0;
        } else {
            // Понизить
            currentVolume--;
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public short previousStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
        return 0;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}