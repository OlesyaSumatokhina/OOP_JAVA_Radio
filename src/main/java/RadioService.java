import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class RadioService {
    public int increaseVolume() {
        int increaseRealVolume = 0;
            if (increaseRealVolume < 100) {
            increaseRealVolume = increaseRealVolume + 1;
                  }
        return increaseRealVolume;
    }
    public int increaseStation(){
        int increaseRealStation = 0;
        if (increaseRealStation < 9){
            increaseRealStation = increaseRealStation + 1;
                    }
        return increaseRealStation;
    }
    public int nextStation(){
        int newStation = 0;
        if (newStation > 9){
            newStation = 0;
        }
        if (newStation <9 && newStation > 0){
            newStation = newStation + 1;
        }
        return newStation;
    }
    public int prevStation(){
        int prevNewStation = 0;
        if (prevNewStation == 0){
            prevNewStation = 9;
            if (prevNewStation > 0 && prevNewStation <= 9 );
            prevNewStation = prevNewStation - 1;
                    }
        return prevNewStation;
    }

}
