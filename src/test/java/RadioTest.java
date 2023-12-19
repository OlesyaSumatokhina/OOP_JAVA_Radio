import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
        public void showNumberRealStation(){
        Radio radioStation = new Radio();
        radioStation.numberRealStation = 3;
        int expected = 3;
        int actual = radioStation.numberRealStation;
        Assertions.assertEquals(expected, actual);


    }
@Test
    public void showRealSoundVolume(){
        Radio radioVolume = new Radio();
        radioVolume.realSoundVolume = 25;
        int expected = 25;
        int actual = radioVolume.realSoundVolume;
        Assertions.assertEquals(expected, actual);
}

}
