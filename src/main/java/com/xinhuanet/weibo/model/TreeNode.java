/**
 * Title:		XINHUANET
 * Copyright:	Copyright(c) 2000-2014,XINHUANET.com All rights reserved.
 * Company:		新华网(www.xinhuanet.com)
 */
package com.xinhuanet.weibo.model;

import java.util.Map;

/**
 * 多叉树节点
 * @since luoka @ 2014年4月3日 下午2:46:18
 *
 */
public class TreeNode {

	
	/**
	 * IP节点的key
	 */
	private int key;
	
	/**
	 * IP节点的子节点数组
	 */
	private TreeNode[] childs = new TreeNode[256];
	
	/**
	 * IP对应的地理信息
	 */
	private String data;
	
	private Map<String, Object> additionalMessage;
	
	public TreeNode(int key){
		this.key = key;
	}
	
	public TreeNode(int key, String data){
		this.key = key;
		this.data = data;
	}
	
	public TreeNode setChildNode(int index, TreeNode node){
		this.childs[index] = node;
		return this;
	}
	
	/**
	 * @return the childs
	 */
	public TreeNode[] getChilds() {
		return childs;
	}

	/**
	 * @param childs the childs to set
	 */
	public void setChilds(TreeNode[] childs) {
		this.childs = childs;
	}

	public boolean isRootNode(){
		//TODO
		return false;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the additionalMessage
	 */
	public Map<String, Object> getAdditionalMessage() {
		return additionalMessage;
	}

	/**
	 * @param additionalMessage the additionalMessage to set
	 */
	public void setAdditionalMessage(Map<String, Object> additionalMessage) {
		this.additionalMessage = additionalMessage;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
	
	
}
