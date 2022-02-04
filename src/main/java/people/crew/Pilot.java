package people.crew;

public class Pilot extends PlaneCrew {

    String licenceNumber;

    // Constructor
    public Pilot(String name, Rank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber(){
        return this.licenceNumber;
    }

    public String flyThePlane(){
        return "Bruuum brum!";
    }

}
