// Parent abstract class for CabinCrewMember and Pilot
package people.crew;


public abstract class PlaneCrew {

    private String name;
    private Rank rank;

    public PlaneCrew(String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){
        return this.name;
    }

    public Rank getRank(){
        return this.rank;
    }

}
