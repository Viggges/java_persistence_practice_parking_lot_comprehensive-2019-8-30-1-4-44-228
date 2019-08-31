package tws.dto;

import java.util.List;

import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;

public class ParkingBoyDto {

	private ParkingBoy parkingBoy;
	private List<ParkingLot> parkingLotsList;

	public ParkingBoy getParkingBoy() {
		return parkingBoy;
	}

	public void setParkingBoy(ParkingBoy parkingBoy) {
		this.parkingBoy = parkingBoy;
	}

	public List<ParkingLot> getParkingLotsList() {
		return parkingLotsList;
	}

	public void setParkingLotsList(List<ParkingLot> parkingLotsList) {
		this.parkingLotsList = parkingLotsList;
	}

	public ParkingBoyDto(ParkingBoy parkingBoy, List<ParkingLot> parkingLotsList) {
		super();
		this.parkingBoy = parkingBoy;
		this.parkingLotsList = parkingLotsList;
	}
	public ParkingBoyDto() {
		
	}

}
