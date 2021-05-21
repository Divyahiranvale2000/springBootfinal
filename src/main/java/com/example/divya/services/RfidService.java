package com.example.divya.services;

import java.util.List;

import com.example.divya.entities.RfidData;

public interface RfidService {
	//abstract method
	public List<RfidData> getRfidDatas();

	public RfidData getRfidData(int tagId);
	
	public RfidData addRfidData(RfidData rfidData);
	
}
