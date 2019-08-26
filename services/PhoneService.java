package com.bitcamp.services;

import com.bitcamp.domains.CelphoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;

public interface PhoneService {
	public String homePhone(PhoneBean param);
	public String celPhone(CelphoneBean param);
	public String iPhone(IPhoneBean param);
}
