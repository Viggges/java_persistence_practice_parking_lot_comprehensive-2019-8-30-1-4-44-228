package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.ParkingLot;
import tws.mapper.ParkingLotMapper;

@Service
public class ParkingLotService {

	@Autowired
	ParkingLotMapper parkingLotMapper;

	public List<ParkingLot> selectAllParkingLots() {

		return parkingLotMapper.selectAllParkingLots();
	}

	public void addOneParkingLot(ParkingLot parkingLot) {
		parkingLotMapper.addOneParkingLot(parkingLot);
	}

}
