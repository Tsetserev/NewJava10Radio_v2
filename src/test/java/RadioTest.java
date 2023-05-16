import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test

    public void station8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void station0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.previousStation();

        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test

    public void prevStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.previousStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void prevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.previousStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void nextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test

    public void nextVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test

    public void nextVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test

    public void prevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(113);

        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test

    public void prevVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);

        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test

    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test

    public void prevVolumeNormal() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        Assertions.assertEquals(9, radio.getCurrentVolume());
    }

    @Test

    public void prevVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test

    public void StationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);


        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void StationTest1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1 );


        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}