public class Radio {

    private int currentNumberRadioStation;
    private int maxNumberRadioStation;
    private int minNumberRadioStation;
    private int currentSoundVolume;   // текущая громкость звука

    public Radio() {
        maxNumberRadioStation = 9;
        minNumberRadioStation = 0;
    }

    public Radio(int quantityRadioStation) {
        this.maxNumberRadioStation = quantityRadioStation - 1;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void nextNumberRadioStation() {    // переключение на +
        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation++;
        } else {
            currentNumberRadioStation = minNumberRadioStation;
        }
    }

    public void prevNumberRadioStation() { //переключение на -
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation--;
        } else {
            currentNumberRadioStation = maxNumberRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {  //  передача данных о р-станции
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseVolumeSound() {    //громкости+
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void decreaseVolumeSound() { // громкости -
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}