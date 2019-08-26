package com.bitcamp.serviceimpls;

import com.bitcamp.domains.CelphoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.services.PhoneService;

public class PhoneServiceImpl implements PhoneService{

	@Override
	public String homePhone(PhoneBean param) {
		return param.toString();
	}

	@Override
	public String celPhone(CelphoneBean param) {
		return param.toString();
	}

	@Override
	public String iPhone(IPhoneBean param) {
		return param.toString();
	}

}
