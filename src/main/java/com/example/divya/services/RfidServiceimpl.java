package com.example.divya.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.divya.dao.RfidDao;
import com.example.divya.entities.RfidData;
@Service
public class RfidServiceimpl implements RfidService {
	
	@Autowired
	private RfidDao rfidDao;
	
	//tempory storageS
	List<RfidData> list;
	public RfidServiceimpl() {
		
	/*	list= new ArrayList<>();
		
		list.add(new RfidData(181,"Ram","MH11BX1234","Cement","ABC technology","abc123@gmail.com"));
		list.add(new RfidData(191,"Raghav","MH11BX1234","cement","ABC technology","abc123@gmail.com"));
	*/	
		
	}

	@Override
	public List<RfidData> getRfidDatas() {
		// TODO Auto-generated method stub
		//return list;
		return rfidDao.findAll();
	}

	@Override
	public RfidData getRfidData(int tagId) {
	/*	RfidData t=null;
		for(RfidData rfidData:list) {
			
			if(rfidData.getTagId()==tagId)
			{
				t=rfidData;
				break;
			}
	*/		
		//}
		
		
		//return t;
		
		return rfidDao.getOne(tagId);
	}
// adddata api
	
	@Override
	public RfidData addRfidData(RfidData rfidData) {
		//list.add(rfidData);
		rfidDao.save(rfidData);
		return rfidData;
	}

}
