package flight;
import people.passenger.Passenger;
import java.util.ArrayList;


public class FlightManager {

    private Plane plane;
    private ArrayList<Passenger> passengers;

    public FlightManager(Plane plane, ArrayList<Passenger> passengers){
        this.plane = plane;
        this.passengers = passengers;
    }

    public Plane getPlane(){
        return plane;
    }

    public ArrayList<Passenger> getArrayOfPassengers(){
        return passengers;
    }

    public double getTotalPlaneBaggageWeightAllowance(){
        return plane.getPlaneType().getTotalWeight() * 0.05;
    }

    public double getAverageBaggageWeightForEachPassenger(Plane plane){
        double averageBaggageWeight = getTotalPlaneBaggageWeightAllowance() / plane.getPlaneType().getCapacity();
        return Math.round(averageBaggageWeight * 100.0) / 100.0;
    }

    public double getTotalBaggageWeightBookedByPassengers(ArrayList<Passenger> passengers){
        double totalBaggageWeight = 0;
        for (Passenger passenger : passengers){
            totalBaggageWeight += passenger.getNumOfBags() * 16;
        }
        return totalBaggageWeight;
    }

    public double getRemainingBaggageWeightAvailable(ArrayList<Passenger> passengers){
        return getTotalPlaneBaggageWeightAllowance() - getTotalBaggageWeightBookedByPassengers(passengers);
    }

}
