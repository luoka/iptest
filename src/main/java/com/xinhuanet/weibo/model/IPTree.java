/**
 * Title:		XINHUANET
 * Copyright:	Copyright(c) 2000-2014,XINHUANET.com All rights reserved.
 * Company:		新华网(www.xinhuanet.com)
 */
package com.xinhuanet.weibo.model;


/**
 * IP信息树
 * @since luoka @ 2014年4月3日 下午2:59:06
 *
 */
public class IPTree {

	private TreeNode rootNode;
	
	public IPTree addIPAddress(IPAddress address, String data){
		int[] ipArray = address.getAddress();
		TreeNode focusNode = rootNode;
		int depth = 0;
		while(focusNode != null && depth<ipArray.length){
			if(focusNode.getChilds()[ipArray[depth]] == null){
				focusNode.setChildNode(ipArray[depth], new TreeNode(ipArray[depth], data));
			}
			focusNode = focusNode.getChilds()[ipArray[depth]];
			if(depth == ipArray.length-1){
				focusNode.setData(data);
			}
			depth ++;

		}
		return this;
	}
	
	public TreeNode search(IPAddress address){
		TreeNode root = rootNode;
		for(int i=0; i<address.getAddress().length; i++){
			root = getClosedChildNode(root, address.getAddress()[i]);
		}
		return root;
		
	}
	
	private TreeNode getClosedChildNode(TreeNode root, int key){
		TreeNode node = null;
		while(node == null && key>=0){
			node = root.getChilds()[key];
			key--;
		}
		return node;
	}

	public IPTree(){
		this.rootNode = new TreeNode(-1);
	} 
}
