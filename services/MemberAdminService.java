package com.bitcamp.services;

import com.bitcamp.domains.MemberBean;

public interface MemberAdminService {
	public String list();
	public MemberBean findById(String id);
	public MemberBean[] findByName(String name);
	public String CountAll();
}
