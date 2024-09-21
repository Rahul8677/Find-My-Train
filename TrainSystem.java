import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String,station>stations=new HashMap<>();

    private Map<String,Train>trains=new HashMap<>();

  private List<schedule> schedules = new ArrayList<>();

    public void addstation(station station)
    {
        stations.put(station.getStationID(),station);

    }

    public void addTrain(Train train)
    {
        trains.put(train.getTrainID(),train);
    }

    public void addSchedule(schedule schedule)
    {
        schedules.add(schedule);
    }
    public List<schedule> findMyTrains(String startStationID,String endStationID)
    {
        List<schedule> res=new ArrayList<>();
        for(schedule schedule:schedules)
        {

             {
                res.add(schedule);
            }
        }
        return res;
    }


}
