package com.jf.authentication.device.template;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

/**
 * Created by turan on 2017/8/2 0002.
 */
public class AuthAuthenticator {
	public byte[] mData = new byte[32];
	
	public static AuthAuthenticator newInstance(AuthHeader header, byte[] authenticator,
                                                List<AuthAttribute> attrList, String secret) {
		if (header == null)
			return null;

		try {
			//
			byte[] headerData = header.toBytes();
			byte[] authData = authenticator;

			if (authData == null) {
				authData = new byte[16];
				Arrays.fill(authData, (byte) 0);
			}

			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			bos.write(headerData);
			bos.write(authData);

			if (attrList != null) {
				if (header.mAttrCount != attrList.size())
					return null;

				for (AuthAttribute attr : attrList)
					bos.write(attr.toBytes());
			}
			
			bos.write(secret.getBytes());
			
			//
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] data = md.digest(bos.toByteArray());
			
			AuthAuthenticator authticator = new AuthAuthenticator();
			authticator.mData = data;
			
			return authticator;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public byte[] toBytes() {
		return mData;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof AuthAuthenticator == false)
			return false;
		
		AuthAuthenticator other = (AuthAuthenticator) obj;
		if (other == this)
			return true;
		
		return Arrays.equals(mData, other.mData);
	}
}
