package com.bitcamp.serviceimpls;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberAdminService;

public class AdminServiceImpl implements MemberAdminService {
	private MemberBean[] members;
	private int count;

	public AdminServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}

	@Override
	public String list() {
		String msg = "";
		for (int i = 0; i < count; i++) {
			msg += members[i].toString() + ", \n\n";
		}
		return msg;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (id.equals(members[i].getId())) {
				member = members[i];
				break;
			}
		}
		return member;

	}

	@Override
	public MemberBean[] findByName(String name) {
		int j = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(this.members[i].getName())) {
				j++;
			}
		}
		MemberBean[] members = new MemberBean[j];
		j = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(this.members[i].getName())) {
				members[j] = this.members[j];
				j++;
				if (members.length == j) {
					break;
				}
			}

		}
		return members;
	}

	@Override
	public String CountAll() {
		return "총 회원수" + count;
	}

}
