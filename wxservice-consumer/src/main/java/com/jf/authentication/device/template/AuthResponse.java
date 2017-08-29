package com.jf.authentication.device.template;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class AuthResponse {
	public static final int RESP_FAILED = -1;
	public static final int RESP_DONE = 0;
	public static final int RESP_TIMEOUT = -2;
	
	public int mErrorCode = RESP_FAILED;
	private AuthPacket mAuthPacket = null;
	
	public AuthPacket getAuthPacket() {
		return mAuthPacket;
	}
	
	public void setAuthPacket(AuthPacket packet) {
		mErrorCode = RESP_DONE;
		mAuthPacket = packet;
	}
}
