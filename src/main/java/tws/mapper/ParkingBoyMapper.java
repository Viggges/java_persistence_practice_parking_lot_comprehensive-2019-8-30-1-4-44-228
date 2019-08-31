package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tws.entity.ParkingBoy;

@Mapper
public interface ParkingBoyMapper {

	List<ParkingBoy> selectAllParkingBoys();

	void addOneParkingBoy(String id);

}
