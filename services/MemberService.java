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
public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members = new MemberBean[3];
		count = 0;
	}
	/*******************************************************
	 * 사용자기능
	 * ********************************************************/
	/*회원가입
	 * 
	 */
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	/**
	 * 2. 마이페이지
	 **/
	public String getMyPage(MemberBean param) {
		return param.toString();
	}
	/**
	 * 3. 비번수정 (Id, 옛날 비밀번호, 신규 비밀번호 입력받아서 옛날비번을 체크 후 일치하면 변경)
	 * 변경 후 로그인 실행, 새로 바뀐 비번이 로그인성공, 옛날비번은 로그인실패
	 * */
	public String changePassword(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		String[] pw = param.getPw().split(",");
	    String oldPw = pw[0];
	    String newPw = pw[1];
		for(int i = 0; i<count; i++) {
			if(param.getId().equals(members[i].getId())
					&& oldPw.equals(members[i].getPw())){
				members[i].setPw(newPw);
			
				break;
			}
		}
		return msg;
	}
	/**
	 * 
	 * 4. 회원탈퇴*/
	public String withdrawal(MemberBean param) {
		String msg = "회원탈퇴 완료.";
		return msg;
	}
	/**
	 * 5.아이디체크
	 */
	public String existId(String id) {
		String msg="가입 가능한 아이디입니다.";
		for(int i=0; i<count;i++) {
			if(id.equals(members[i].getId())) {
				msg="이미 존재하는 아이디.";
				break;
			}
		}
		return msg;
	}
	/**
	 * 6. 로그인 (파마니터로 id와 ,pw만 입력받은  상태)
	 * */
	public String login(MemberBean param) {
		String msg = "로그인 실패";
		for(int i=0; i<count; i++) {
			if(param.getId().equals(members[i].getId()) 
					&& param.getPw().equals(members[i].getPw())) {
				msg = "로그인 성공";
				break;
			}
		}
		return msg;
	}
	/*******************************************************
	 * 관리자기능
	 * ********************************************************/
	/**
	 * 1. 회원리스트
	 */
	public String list() {
		String msg = "";
		for(int i = 0; i<count; i++) {
			msg += members[i].toString()+", \n\n";
		}
		return msg;
	}
	/**
	 * 2. 아이디 검색
	 * */
	public MemberBean findById(String id) { //보안의 이유가 없는 것은 파라미터에 적어도 된다. setId 할 필요가 없음.
		MemberBean member = new MemberBean();
		for(int i = 0; i<count; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	/**
	 * 3. 이름검색// 같은 이름을 가진 모든 사람들 출력. 복수로 출력할 것이기 떄문에
	 * 리턴타입이 배열.
	 * */
	public MemberBean[] findByName(String name) {
		int j = 0;
		for(int i = 0; i<count; i++) {
			if(name.contentEquals(this.members[i].getName())) {
				j++;
			}
		}

		MemberBean[] members = new MemberBean[j];
		j=0;
		for(int i = 0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				members[j] = this.members[j];
				j++;
				if(members.length == j) {
					break;
				}
			}
			
		}
		return members;
	}
	/**
	 * 4. 전체회원수
	 * */
	public String CountAll() {
		return "총 회원수"+count;
	}
}
