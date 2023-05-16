import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // блок прямого ввода значения

    @Test
    void shouldNumberRadioStationAverage() {
        Radio service = new Radio(6);
        service.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldNumberRadioStationMin() {
        Radio service = new Radio(1);
        service.setCurrentNumberRadioStation(0);

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldNumberRadioStationMax() {
        Radio service = new Radio(10);
        service.setCurrentNumberRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldInputNumberRadioStationAverage() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationMinBorder1() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationMinBorder2() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(0);

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationMinBorder3() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(1);

        int expected = 1;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationMaxBorder1() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(8);

        int expected = 8;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationMaxBorder2() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationMaxBorder3() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationNegativeNotValid() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(-20);

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldInputNumberRadioStationNotValidPositiveMeaning() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(20);

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // блок преключение через next
    // функционал не позволяет использовать значения вне диапозона {0,1,2,3,4,5,6,7,8,9}

    @Test
    void shouldNextNumberRadioStationMax() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(9);
        service.nextNumberRadioStation();

        int expected = 0;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberRadioStationAverage() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(5);
        service.nextNumberRadioStation();

        int expected = 6;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberRadioStationMin() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(0);
        service.nextNumberRadioStation();

        int expected = 1;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    // блок преключение через prev

    @Test
    void shouldPrevNumberRadioStationMax() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(9);
        service.prevNumberRadioStation();

        int expected = 8;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberRadioStationAverage() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(5);
        service.prevNumberRadioStation();

        int expected = 4;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberRadioStationMin() {
        Radio service = new Radio();
        service.setCurrentNumberRadioStation(0);
        service.prevNumberRadioStation();

        int expected = 9;
        int actual = service.getCurrentNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    // блок увеличения громкости радио

    @Test
    void shouldIncreaseVolumeSoundMiddle() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(5);
        service.increaseVolumeSound();

        int expected = 6;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeSoundMax() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(100);
        service.increaseVolumeSound();

        int expected = 100;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeSoundMin() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(0);
        service.increaseVolumeSound();

        int expected = 1;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    // блок уменьшение громкости радио
    @Test
    void shouldDecreaseVolumeSoundMiddle() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(5);
        service.decreaseVolumeSound();

        int expected = 4;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeSoundMax() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(100);
        service.decreaseVolumeSound();

        int expected = 99;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeSoundMin() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(0);
        service.decreaseVolumeSound();

        int expected = 0;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeSoundNoValidMinus() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(-100);
        service.decreaseVolumeSound();

        int expected = 0;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeSoundNoValidPlus() {
        Radio service = new Radio();
        service.setCurrentSoundVolume(101);
        service.decreaseVolumeSound();

        int expected = 0;
        int actual = service.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
