package tws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tws.dto.ParkingBoyDto;

@Service
public class ParkingBoyDtoService {

	List<ParkingBoyDto> parkingBoyDtoList = new ArrayList<ParkingBoyDto>();

	public List<ParkingBoyDto> selectAllConnect() {

		return parkingBoyDtoList;
	}

	public void addOneConnect(ParkingBoyDto parkingBoyDto) {
		parkingBoyDtoList.add(parkingBoyDto);
	}

}
