package com.game.monster.message;

import com.game.message.Message;

import org.apache.mina.core.buffer.IoBuffer;

/** 
 * @author Commuication Auto Maker
 * 
 * @version 1.0.0
 * 
 * 最大体力变化消息
 */
public class ResMonsterMaxSpChangeMessage extends Message{

	//角色Id
	private long monsterId;
	
	//当前SP
	private int currentSp;
	
	//最大SP
	private int maxSp;
	
	
	/**
	 * 写入字节缓存
	 */
	public boolean write(IoBuffer buf){
		//角色Id
		writeLong(buf, this.monsterId);
		//当前SP
		writeInt(buf, this.currentSp);
		//最大SP
		writeInt(buf, this.maxSp);
		return true;
	}
	
	/**
	 * 读取字节缓存
	 */
	public boolean read(IoBuffer buf){
		//角色Id
		this.monsterId = readLong(buf);
		//当前SP
		this.currentSp = readInt(buf);
		//最大SP
		this.maxSp = readInt(buf);
		return true;
	}
	
	/**
	 * get 角色Id
	 * @return 
	 */
	public long getMonsterId(){
		return monsterId;
	}
	
	/**
	 * set 角色Id
	 */
	public void setMonsterId(long monsterId){
		this.monsterId = monsterId;
	}
	
	/**
	 * get 当前SP
	 * @return 
	 */
	public int getCurrentSp(){
		return currentSp;
	}
	
	/**
	 * set 当前SP
	 */
	public void setCurrentSp(int currentSp){
		this.currentSp = currentSp;
	}
	
	/**
	 * get 最大SP
	 * @return 
	 */
	public int getMaxSp(){
		return maxSp;
	}
	
	/**
	 * set 最大SP
	 */
	public void setMaxSp(int maxSp){
		this.maxSp = maxSp;
	}
	
	
	@Override
	public int getId() {
		return 114106;
	}

	@Override
	public String getQueue() {
		return null;
	}
	
	@Override
	public String getServer() {
		return null;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		//角色Id
		buf.append("monsterId:" + monsterId +",");
		//当前SP
		buf.append("currentSp:" + currentSp +",");
		//最大SP
		buf.append("maxSp:" + maxSp +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}