package fuse.example.homeloan.processor;

import fuse.example.homeloan.model.HouseInfo;

public class AppraisalProcessor {
	
	
	public HouseInfo quote(HouseInfo houseInfo) {
		
		int appraisedValue = 0;
		appraisedValue += houseInfo.getLandSize() * 1000;
		appraisedValue += houseInfo.getBathroom() * 2000;
		appraisedValue += houseInfo.getBedroom() * 2500;
		
		houseInfo.setAppraisedValue(appraisedValue);
		
		return houseInfo;
	}

}
