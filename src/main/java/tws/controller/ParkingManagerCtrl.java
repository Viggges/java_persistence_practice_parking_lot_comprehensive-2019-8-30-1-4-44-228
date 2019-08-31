package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.service.ParkingBoyDtoService;
import tws.service.ParkingBoyService;
import tws.service.ParkingLotService;

@RestController
@RequestMapping("/parking-manager")
public class ParkingManagerCtrl {

	@Autowired
	ParkingBoyService parkingBoyService;

	@Autowired
	ParkingLotService parkingLotService;

	@Autowired
	ParkingBoyDtoService parkingBoyDtoService;

	@GetMapping("/boys-list")
	public List<ParkingBoy> selectAllParkingBoys() {

		return parkingBoyService.selectAllParkingBoys();
	}

	@GetMapping("/lots-list")
	public List<ParkingLot> selectAllParkingLots() {
		return parkingLotService.selectAllParkingLots();
	}

	@GetMapping("/connect-list")
	public List<ParkingBoyDto> selectAllConnect() {
		return parkingBoyDtoService.selectAllConnect();
	}

	@PostMapping("/new-boy")
	public void addOneParkingBoy() {
		parkingBoyService.addOneParkingBoy();
	}

	@PostMapping("/new-lot")
	public void addOneParkingLot(@RequestBody ParkingLot parkingLot) {
		parkingLotService.addOneParkingLot(parkingLot);
	}

	@PostMapping("/new-connect")
	public void addOneConnect(@RequestBody ParkingBoyDto parkingBoyDto) {
		parkingBoyDtoService.addOneConnect(parkingBoyDto);
	}

}
