package com.jf.authentication.device.template;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class AuthPacket {
	
	public AuthHeader mHeader = null;
	public AuthAuthenticator mAuthenticator = null;
	public List<AuthAttribute> mAttributeList = new LinkedList<AuthAttribute>();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n====== AuthPacket =======");
		sb.append("\n\tmVersion = ").append(mHeader.mVersion);
		sb.append("\n\tmType = ").append(mHeader.mType);
		sb.append("\n\tmAuthType = ").append(mHeader.mAuthType);
		sb.append("\n\tmSerialNo = ").append(mHeader.mSerialNo);
		sb.append("\n\tmReqId = ").append(mHeader.mReqId);
		sb.append("\n\tmUserIp = ").append(mHeader.mUserIp);
		sb.append("\n\tmUserPort = ").append(mHeader.mUserPort);
		sb.append("\n\tmErrorCode = ").append(mHeader.mErrorCode);
		sb.append("\n\tmAttrCount = ").append(mHeader.mAttrCount);

		return sb.toString();
	}

	public static AuthPacket newAuthPacket(AuthHeader header,
                                           List<AuthAttribute> attrList, String secret) {

		if (header == null)
			return null;

		AuthPacket packet = new AuthPacket();
		packet.mHeader = header;

		if (attrList != null) {
			packet.mAttributeList = attrList;
			packet.mHeader.mAttrCount = attrList.size();
		}

		//
		packet.mAuthenticator = AuthAuthenticator.newInstance(packet.mHeader,
				null, attrList, secret);

		return packet;
	}

	public static AuthPacket newAuthPacket(byte[] data) {
		// without attributes, the size of packet should greater than 32 bytes
		if (data == null || data.length < 32)
			return null;

		AuthPacket packet = new AuthPacket();
		packet.mHeader = AuthHeader.newAuthHeader(Arrays.copyOf(data, 16));

		packet.mAuthenticator = new AuthAuthenticator();
		packet.mAuthenticator.mData = Arrays.copyOfRange(data, 16, 32);

		if (data.length == 32)
			return packet;

		byte[] attrBytes = Arrays.copyOfRange(data, 32, data.length);
		int offset = 0;

		try {
			while (offset < attrBytes.length - 1) {
				byte type = attrBytes[offset];
				byte length = attrBytes[offset + 1]; // this length contains one byte 'type' and one byte 'length'

				byte[] attrData = new byte[length];
				attrData = Arrays.copyOfRange(attrBytes, offset + 2, length + offset);

				offset = length;

				AuthAttribute attr = AuthAttribute.newInstance(type,
						length - 2, attrData);
				
				packet.mAttributeList.add(attr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return packet;
	}
	
	public byte[] toBytes() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		try {
			bos.write(mHeader.toBytes());
			bos.write(mAuthenticator.toBytes());
			
			for (AuthAttribute attr : mAttributeList)
				bos.write(attr.toBytes());
			
			return bos.toByteArray();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//
	public int getSerialNo() {
		return mHeader.mSerialNo;
	}
}
