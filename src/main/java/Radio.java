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
        if (newRealsoundVolume > 100) {
            return;
        }
        if (newRealsoundVolume < 0) {
            return;
        }
      realSoundVolume = newRealsoundVolume;

    }


}
