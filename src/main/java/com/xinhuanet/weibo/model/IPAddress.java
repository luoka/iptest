/**
 * Title:		XINHUANET
 * Copyright:	Copyright(c) 2000-2014,XINHUANET.com All rights reserved.
 * Company:		新华网(www.xinhuanet.com)
 */
package com.xinhuanet.weibo.model;

import java.util.Arrays;
import java.util.regex.Pattern;

import com.trs.dev4.jdk16.utils.StringHelper;

/**
 * IP对象
 * @since luoka @ 2014年4月3日 下午3:06:55
 *
 */
public class IPAddress {

	private int[] address;
	
	public static final Pattern IP_ADDRESS_REGEX = Pattern.compile("\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b");
	
	
	/** 
	 * 根据IP字符串构造IP地址对象
	 * @param ip eg: 0.0.0.0
	 * @since luoka @ 2014年4月3日 下午3:09:07
	*/
	public IPAddress(String ip){
		if(StringHelper.isNotEmpty(ip)){
			this.address = new int[4];
			String[] strs = StringHelper.splitAndTrim(ip, ".");
			for(int i=0; i<strs.length; i++){
				this.address[i] = Integer.parseInt(strs[i]);
			}
		}
	}


	/**
	 * @return the address
	 */
	public int[] getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(int[] address) {
		this.address = address;
	}
	
	public IPAddress(int a, int b, int c, int d){
		this.address = new int[4];
		this.address[0] = a;
		this.address[1] = b;
		this.address[2] = c;
		this.address[3] = d;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IPAddress [address=" + Arrays.toString(address) + "]";
	}
	
	
	
}
