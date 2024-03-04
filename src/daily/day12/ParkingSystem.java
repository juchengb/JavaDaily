package daily.day12;

// 1603. Design Parking System
class ParkingSystem {
    int[] count;

    public ParkingSystem(int big, int medium, int small) {
        count = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if (count[carType-1] == 0) {
            return false;
        }
        count[carType-1]--;
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */