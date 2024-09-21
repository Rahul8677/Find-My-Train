import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {

        TrainSystem system=new TrainSystem();

        station station1=new station("S00333","Pune");
        station station2=new station("S00444","Mumbai");

        Train train1=new Train("12408","VandeBharat","Express");
        Train train2=new Train("12608","Demo","Passenger");

        Platform p1=new Platform(1);

        Platform p2=new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList=new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);

        schedule s1=new schedule(train1,station1,"9AM","9.05am",p1);
        schedule s2=new schedule(train1,station2,"10AM","10.02am",p2);

        system.addstation(station1);
        system.addstation(station2);
        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source : ");
        String sourceStationName=sc.nextLine();
        System.out.println("Enter the Destination");
        String DestinationStationName= sc.nextLine();
        List<schedule> myTrains = system.findMyTrains(sourceStationName, DestinationStationName);
        System.out.println("You trains between "+sourceStationName +" And "+DestinationStationName);

        // System.out.println(myTrain);

        schedule schedule =myTrains.get(0);
        Train train = schedule.getTrain();
        System.out.println(train);


    }

}
