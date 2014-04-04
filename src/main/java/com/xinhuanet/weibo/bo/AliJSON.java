/**
 * Title:		XINHUANET
 * Copyright:	Copyright(c) 2000-2014,XINHUANET.com All rights reserved.
 * Company:		新华网(www.xinhuanet.com)
 */
package com.xinhuanet.weibo.bo;

/**
 * TODO
 * @since luoka @ 2014年4月4日 下午3:08:50
 *
 */
public class AliJSON {
	
	private int code;
	private AliData data;
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the data
	 */
	public AliData getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(AliData data) {
		this.data = data;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AliJSON [code=" + code + ", data=" + data + "]";
	}
	
	
}
