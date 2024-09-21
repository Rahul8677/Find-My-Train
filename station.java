import java.util.ArrayList;
import java.util.List;

public class station {

    private String stationID;

    private String stationName;

    private List<Platform> platformList;

    public station(String stationID, String stationName) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.platformList=new ArrayList<>();
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "station{" +
                "stationID='" + stationID + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
