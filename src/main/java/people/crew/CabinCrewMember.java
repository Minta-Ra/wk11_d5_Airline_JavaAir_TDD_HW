package people.crew;

public class CabinCrewMember extends PlaneCrew {

    public CabinCrewMember(String name, Rank rank){
        super(name, rank);
    }

    public String relayMessage(){
        return "Fasten seatbelts";
    }

}
