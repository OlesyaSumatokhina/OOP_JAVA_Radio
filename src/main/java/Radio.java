public class Radio {
    public int numberRealStation;
    public int realSoundVolume;

    public int getNumberRealStation() {
        return numberRealStation;
    }

    public int getRealSoundVolume() {
        return realSoundVolume;
    }

    public void setnumberRealStation(int newNumberRealStation) {

        if (newNumberRealStation > 9) {
            return;
        }
        if (newNumberRealStation < 0) {
            return;
        }
        numberRealStation = newNumberRealStation;
    }

    public void setrealSoundVolume(int newRealsoundVolume) {
        if (realSoundVolume > 100) {
            return;
        }
        if (realSoundVolume < 0) {
            return;
        }
        realSoundVolume = newRealsoundVolume;

    }

    public void increaseVolume() {

        if (realSoundVolume < 100) {
            realSoundVolume = realSoundVolume + 1;

        }

    }

    public void increaseStation() {
        if (numberRealStation < 9) {
            numberRealStation = numberRealStation + 1;
        }

    }

    public void nextStation() {

        if (numberRealStation > 9) {
            numberRealStation = 0;
        }
        if (numberRealStation < 9 && numberRealStation > 0) {
            numberRealStation = numberRealStation + 1;
        }

    }

    public void prevStation() {

        if (numberRealStation == 0) {
            numberRealStation = 9;
            if (numberRealStation > 0 && numberRealStation <= 9) ;
            numberRealStation = numberRealStation - 1;
        }
    }
}
