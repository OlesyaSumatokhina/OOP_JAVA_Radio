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

    public int increaseStation() {
        int increaseRealStation = 0;
        if (increaseRealStation < 9) {
            increaseRealStation = increaseRealStation + 1;
        }
        return increaseRealStation;
    }

    public int nextStation() {
        int newStation = 0;
        if (newStation > 9) {
            newStation = 0;
        }
        if (newStation < 9 && newStation > 0) {
            newStation = newStation + 1;
        }
        return newStation;
    }

    public int prevStation() {
        int prevNewStation = 0;
        if (prevNewStation == 0) {
            prevNewStation = 9;
            if (prevNewStation > 0 && prevNewStation <= 9) ;
            prevNewStation = prevNewStation - 1;
        }
        return prevNewStation;
    }
}
