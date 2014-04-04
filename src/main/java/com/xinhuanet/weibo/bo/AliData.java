/**
 * Title:		XINHUANET
 * Copyright:	Copyright(c) 2000-2014,XINHUANET.com All rights reserved.
 * Company:		新华网(www.xinhuanet.com)
 */
package com.xinhuanet.weibo.bo;

/**
 * TODO
 * @since luoka @ 2014年4月4日 下午3:09:50
 *
 */
public class AliData {
	//{"country":"中国","country_id":"CN","area":"华东","area_id":"300000","region":"江苏省","region_id":"320000","city":"苏州市","city_id":"320500","county":"","county_id":"-1","isp":"电信","isp_id":"100017","ip":"221.224.51.134"}
	private String country;
	private String country_id;
	private String area;
	private String area_id;
	private String region;
	private String region_id;
	private String city;
	private String city_id;
	private String county;
	private String county_id;
	private String isp;
	private String ip;
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the country_id
	 */
	public String getCountry_id() {
		return country_id;
	}
	/**
	 * @param country_id the country_id to set
	 */
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the area_id
	 */
	public String getArea_id() {
		return area_id;
	}
	/**
	 * @param area_id the area_id to set
	 */
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the region_id
	 */
	public String getRegion_id() {
		return region_id;
	}
	/**
	 * @param region_id the region_id to set
	 */
	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the city_id
	 */
	public String getCity_id() {
		return city_id;
	}
	/**
	 * @param city_id the city_id to set
	 */
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * @return the county_id
	 */
	public String getCounty_id() {
		return county_id;
	}
	/**
	 * @param county_id the county_id to set
	 */
	public void setCounty_id(String county_id) {
		this.county_id = county_id;
	}
	/**
	 * @return the isp
	 */
	public String getIsp() {
		return isp;
	}
	/**
	 * @param isp the isp to set
	 */
	public void setIsp(String isp) {
		this.isp = isp;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AliData [country=" + country + ", country_id=" + country_id
				+ ", area=" + area + ", area_id=" + area_id + ", region="
				+ region + ", region_id=" + region_id + ", city=" + city
				+ ", city_id=" + city_id + ", county=" + county
				+ ", county_id=" + county_id + ", isp=" + isp + ", ip=" + ip
				+ "]";
	}
	
	
}
