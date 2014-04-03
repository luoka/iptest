package com.xinhuanet.weibo;

import com.xinhuanet.weibo.model.IPAddress;
import com.xinhuanet.weibo.model.IPTree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IPTree ipTree = new IPTree();
        System.out.println("begin init:");
        long begin = System.currentTimeMillis();
        long index = 0;
        for(int i=0; i<=25; i++){
        	for(int j=0; j<=25; j++){
        		for(int k=0; k<=25; k++){
        			for(int m=0; m<=25; m++){
        				System.out.println(index++);
        				ipTree.addIPAddress(new IPAddress(i,j,k,m), i + "." + j + "." + k + "." + m);
        			}
        		}
        	}
        }
        System.out.println("init over:" + (System.currentTimeMillis() - begin));
        System.out.println(ipTree.search(new IPAddress(12,45,2,55)).getData());;
    }
}
