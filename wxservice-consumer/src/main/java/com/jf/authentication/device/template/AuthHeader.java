package com.jf.authentication.device.template;

import java.net.InetAddress;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class AuthHeader {
	public int mVersion = 0x2;
	public int mType = 0;
	public int mAuthType = 0;
	public int mSerialNo = 0;
	public int mReqId = 0;
	public String mUserIp = "";
	public int mUserPort = 0;
	public int mErrorCode = 0;
	public int mAttrCount = 0;
	
	public AuthHeader() {
		
	}
	
	public byte[] toBytes() {
		byte[] data = new byte[16];
		
		data[0] = (byte) (mVersion & 0xFF);
		data[1] = (byte) (mType & 0xFF);
		data[2] = (byte) (mAuthType & 0xFF);
		data[3] = 0;
		data[4] = (byte) ((mSerialNo & 0xFFFF) >> 8);
		data[5] = (byte) (mSerialNo & 0xFF);
		data[6] = (byte) ((mReqId & 0xFFFF) >> 8);
		data[7] = (byte) (mReqId & 0xFF);
		
		InetAddress isa = null;
		try {
			isa = InetAddress.getByName(mUserIp);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		byte[] ip = isa.getAddress();
		if (ip == null || ip.length != 4)
			return null;
		
		// IP address
		data[8] = ip[0];
		data[9] = ip[1];
		data[10] = ip[2];
		data[11] = ip[3];
		
		// port
		data[12] = (byte) ((mUserPort & 0xFFFF) >> 8);
		data[13] = (byte) (mUserPort & 0xFF);
		
		data[14] = (byte) (mErrorCode & 0xFF);
		data[15] = (byte) (mAttrCount & 0xFF);
		
		return data;
	}
	
	public static AuthHeader newAuthHeader(byte[] data) {
		if (data == null || data.length != 16)
			return null;
		
		AuthHeader header = new AuthHeader();
		
		header.mVersion = data[0];
		header.mType = data[1];
		header.mAuthType = data[2];
		header.mSerialNo = (((int) (data[4] & 0xFF)) << 8) | (data[5] & 0xFF);
		header.mReqId = (((int) (data[6] & 0xFF)) << 8) | (data[7] & 0xFF);
		
		StringBuilder sb = new StringBuilder();
		sb.append(data[8] & 0xFF).append(".").append(data[9] & 0xFF).append(".");
		sb.append(data[10] & 0xFF).append(".").append(data[11] & 0xFF);
		header.mUserIp = sb.toString();
		
		header.mUserPort = (((int) (data[12] & 0xFF)) << 8) | (data[13] & 0xFF);
		header.mErrorCode = (int) data[14];
		header.mAttrCount = (int) data[15];
		
		return header;
	}
}
