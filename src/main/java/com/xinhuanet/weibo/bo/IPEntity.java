/**
 * Title:		XINHUANET
 * Copyright:	Copyright(c) 2000-2014,XINHUANET.com All rights reserved.
 * Company:		新华网(www.xinhuanet.com)
 */
package com.xinhuanet.weibo.bo;

import com.alibaba.fastjson.JSON;
import com.xinhuanet.weibo.model.IPAddress;

/**
 * TODO
 * @since luoka @ 2014年4月4日 下午3:06:52
 *
 */
public class IPEntity {

	//{"ips":"221.224.51.134~221.224.51.134","data":{"code":0,"data":{}}}
	private String ips;
	private AliJSON data;
	
	public IPAddress parseIPAddress(){
		IPAddress result = new IPAddress(ips.split("~")[0]);
		return result;
		
	}
	
	public String parseIPMessage(){
		return ips + ":" + JSON.toJSONString(data.getData());
	}
	
	/**
	 * @return the ips
	 */
	public String getIps() {
		return ips;
	}
	/**
	 * @param ips the ips to set
	 */
	public void setIps(String ips) {
		this.ips = ips;
	}
	/**
	 * @return the data
	 */
	public AliJSON getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(AliJSON data) {
		this.data = data;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IPEntity [ips=" + ips + ", data=" + data + "]";
	}
	
	
}
