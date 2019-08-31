package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {

	List<ParkingLot> selectAllParkingLots();

	void addOneParkingLot(ParkingLot parkingLot);

}
