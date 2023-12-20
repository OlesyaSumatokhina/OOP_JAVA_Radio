import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void showNumberRealStation() {
        Radio radioStation = new Radio();
        radioStation.setnumberRealStation(9);
        int expected = 9;
        int actual = radioStation.getNumberRealStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showRealSoundVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setrealSoundVolume(25);
        int expected = 25;
        int actual = radioVolume.getRealSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberStation() {
        Radio radioStation = new Radio();
        radioStation.setnumberRealStation(10);
        int expected = 0;
        int actual = radioStation.getNumberRealStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minNumberStation() {
        Radio radioStation = new Radio();
        radioStation.setnumberRealStation(0);
        int expected = 0;
        int actual = radioStation.getNumberRealStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSoundVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setrealSoundVolume(110);
        int expected = 0;
        int actual = radioVolume.getRealSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSoundVolume() {
        Radio radioVolume = new Radio();
        radioVolume.setrealSoundVolume(0);
        int expected = 0;
        int actual = radioVolume.getRealSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRealVolume() {
        Radio service = new Radio();
        Radio radioVolume = new Radio();
        radioVolume.setrealSoundVolume(15);
        int expected = 16;
        int actual = service.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}
