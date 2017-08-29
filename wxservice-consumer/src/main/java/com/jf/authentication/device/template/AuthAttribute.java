package com.jf.authentication.device.template;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class AuthAttribute {
	public static final int ATTR_USERNAME = 0x1;
	public static final int ATTR_PASSWORD = 0x2;
	public static final int ATTR_CHALLENGE = 0x3;
	public static final int ATTR_CHAPPASSWORD = 0x4;
	
	public int mType = 0;
	public byte[] mData = null;
	
	public byte[] toBytes() {
		byte[] data = new byte[mData.length + 2];
		
		data[0] = (byte) mType;
		data[1] = (byte) (mData.length + 2);
		System.arraycopy(mData, 0, data, 2, mData.length);
		
		return data;
	}
	
	public static AuthAttribute newInstance(byte type, int length, byte[] data) {
		if (data == null)
			return null;
		
		AuthAttribute attr = new AuthAttribute();
		attr.mType = type;
		attr.mData = new byte[length];
		
		System.arraycopy(data, 0, attr.mData, 0, length);
		
		return attr;
	}
}