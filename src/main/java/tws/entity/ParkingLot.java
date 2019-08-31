package tws.entity;

public class ParkingLot {
	private String parkingLotID;
	private int capacity;
	private int availablePositionCount;

	public String getParkingLotID() {
		return parkingLotID;
	}

	public void setParkingLotID(String parkingLotID) {
		this.parkingLotID = parkingLotID;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getAvailablePositionCount() {
		return availablePositionCount;
	}

	public void setAvailablePositionCount(int availablePositionCount) {
		this.availablePositionCount = availablePositionCount;
	}

	public ParkingLot(String parkingLotID, int capacity, int availablePositionCount) {
		super();
		this.parkingLotID = parkingLotID;
		this.capacity = capacity;
		this.availablePositionCount = availablePositionCount;
	}

	public ParkingLot() {

	}

}
