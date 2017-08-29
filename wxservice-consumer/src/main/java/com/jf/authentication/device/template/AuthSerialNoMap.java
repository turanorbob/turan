package com.jf.authentication.device.template;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class AuthSerialNoMap {

	private static AuthSerialNoMap INSTANCE = null;
	private Map<String, AuthResponse> mSerialNoMap = new ConcurrentHashMap<String, AuthResponse>();

	private AuthSerialNoMap() {

	}

	public static AuthSerialNoMap getInstance() {
		if (INSTANCE == null) {
			synchronized (AuthSerialNoMap.class) {
				if (INSTANCE == null)
					INSTANCE = new AuthSerialNoMap();
			}
		}
		return INSTANCE;
	}

	private String getKey(String ip, int serialNo) {
		return ip + "_" + serialNo;
	}

	public AuthResponse addSerialNo(String ip, int serialNo) {
		AuthResponse obj = new AuthResponse();

		mSerialNoMap.put(getKey(ip, serialNo), obj);

		return obj;
	}

	public AuthResponse removeSerialNo(String ip, int serialNo) {
		return mSerialNoMap.remove(getKey(ip, serialNo));
	}
}
