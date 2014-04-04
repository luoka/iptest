package com.xinhuanet.weibo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.alibaba.fastjson.JSON;
import com.xinhuanet.weibo.bo.IPEntity;
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
        
       /* System.out.println("begin init:");
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
        System.out.println(ipTree.search(new IPAddress(12,45,2,55)).getData());;*/
        
        
        File file = new File("D:/ip.txt");
        try {
			readFile1(file, ipTree);
		} catch (IOException e) {
			System.out.println(e);
			
		}
        
       /* System.out.println(ipTree.search(new IPAddress(221,224,51,134)).getData());
        System.out.println(ipTree.search(new IPAddress(221,224,51,135)).getData());
        System.out.println(ipTree.search(new IPAddress(221,224,51,136)).getData());
        System.out.println(ipTree.search(new IPAddress(0,0,0,0)).getData());
        System.out.println(ipTree.search(new IPAddress(255,255,255,255)).getData());
        System.out.println(ipTree.search(new IPAddress(119,253,255,255)).getData());
        System.out.println(ipTree.search(new IPAddress(119,254,0,0)).getData());
        System.out.println(ipTree.search(new IPAddress(119,254,86,241)).getData());*/
        while(true){
        	System.out.println(ipTree.search(new IPAddress(119,254,86,241)).getData());
        	
        }
        
    }
    
    private static void readFile1(File fin, IPTree tree) throws IOException {
    	FileInputStream fis = new FileInputStream(fin);
     
    	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
     
    	String line = null;
    	long beginTime = System.currentTimeMillis();
    	long node = 0;
    	while ((line = br.readLine()) != null) {
    		IPEntity entity = JSON.parseObject(line, IPEntity.class);
    		tree.addIPAddress(entity.parseIPAddress(), entity.parseIPMessage());
    		//System.out.println("init node:" + node);
    		node++;
    	}
    	System.out.println("over:" + (System.currentTimeMillis() - beginTime));
    	br.close();
    }
    
    
}
