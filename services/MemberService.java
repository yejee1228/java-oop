package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;

/*요구사항:
 * >사용자기능
 * 1. 회원가입. 2. 마이페이지, 3. 비번수정. 4. 회원탈퇴, 5.아이디체크, 6.로그인
 * >관리자기능
 * 1.회원목록
 * 2.아이디 검색
 * 3.이름검색
 * 4.전체 회원수
 */
public interface MemberService {
	public String join(MemberBean param);
	public String getMyPage(MemberBean param);
	public String changePassword(MemberBean param);
	public String withdrawal(MemberBean param);
	public String existId(String id);
	public String login(MemberBean param);
}
