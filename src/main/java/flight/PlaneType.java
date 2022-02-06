package flight;

public enum PlaneType {

    // BOEING_737(215, 79.015),
    BOEING_737(5, 79.015),
    AIRBUS_A319(156, 68.000);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
