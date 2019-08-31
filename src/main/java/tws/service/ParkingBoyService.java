package tws.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.mapper.ParkingBoyMapper;

@Service
public class ParkingBoyService {

	@Autowired
	ParkingBoyMapper parkingBoyMapper;

	public List<ParkingBoy> selectAllParkingBoys() {
		
		return parkingBoyMapper.selectAllParkingBoys();
	}

	public void addOneParkingBoy() {
		String id = UUID.randomUUID().toString();
		parkingBoyMapper.addOneParkingBoy(id);
	}

}
