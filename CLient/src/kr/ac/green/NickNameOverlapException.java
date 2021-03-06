package kr.ac.green;

import java.io.Serializable;

public class NickNameOverlapException extends RuntimeException implements Serializable {

	int code = ResponseProtocol.RESPONSE_NICK_CHECKC_NO;

	public NickNameOverlapException(String nickName) {
		super(nickName + "는 이미 사용중인 닉네임 입니다.");
	}

	public int getCode() {
		return code;
	}
	@Override
	public String toString(){
		return super.getMessage();
	}

}