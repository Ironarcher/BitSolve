package com.bitsolve.client;

import java.util.ArrayList;

public class Algorithm extends Thread{
	private int bufferedData;
	private boolean acceptableData;
	private ArrayList<Integer> releaseData;
	
	public void run(){
		bufferedData = 0;
		acceptableData = true;
		releaseData = new ArrayList<Integer>();
		while(true){
			if(!acceptableData){
				startAlgorithm(bufferedData);
				acceptableData = true;
			}
		}
	}
	
	public boolean canAcceptData(){
		return acceptableData;
	}
	
	public boolean canReleaseData(){
		if(releaseData.size() > 0) return true;
		else return false;
	}
	
	public void acceptData(int data){
		if(acceptableData){
			this.bufferedData = data;
			acceptableData = false;
		}
	}
	
	public int takeReleaseBuffer(){
		int temp = releaseData.get(0);
		releaseData.remove(0);
		return temp;
	}
	
	@Deprecated
	private void startAlgorithm(int data){
		releaseData.add(data*2);
	}

}
