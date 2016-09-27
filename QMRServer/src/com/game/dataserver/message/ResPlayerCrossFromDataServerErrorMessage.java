package com.game.dataserver.message;

import com.game.message.Message;

import org.apache.mina.core.buffer.IoBuffer;

/** 
 * @author Commuication Auto Maker
 * 
 * @version 1.0.0
 * 
 * 返回请求公共服务器玩家跨服部分状态信息错误消息
 */
public class ResPlayerCrossFromDataServerErrorMessage extends Message{

	//角色id
	private long playerId;
	
	//账号
	private String userId;
	
	//服务器平台
	private String web;
	
	//状态类型
	private int state;
	
	
	/**
	 * 写入字节缓存
	 */
	public boolean write(IoBuffer buf){
		//角色id
		writeLong(buf, this.playerId);
		//账号
		writeString(buf, this.userId);
		//服务器平台
		writeString(buf, this.web);
		//状态类型
		writeInt(buf, this.state);
		return true;
	}
	
	/**
	 * 读取字节缓存
	 */
	public boolean read(IoBuffer buf){
		//角色id
		this.playerId = readLong(buf);
		//账号
		this.userId = readString(buf);
		//服务器平台
		this.web = readString(buf);
		//状态类型
		this.state = readInt(buf);
		return true;
	}
	
	/**
	 * get 角色id
	 * @return 
	 */
	public long getPlayerId(){
		return playerId;
	}
	
	/**
	 * set 角色id
	 */
	public void setPlayerId(long playerId){
		this.playerId = playerId;
	}
	
	/**
	 * get 账号
	 * @return 
	 */
	public String getUserId(){
		return userId;
	}
	
	/**
	 * set 账号
	 */
	public void setUserId(String userId){
		this.userId = userId;
	}
	
	/**
	 * get 服务器平台
	 * @return 
	 */
	public String getWeb(){
		return web;
	}
	
	/**
	 * set 服务器平台
	 */
	public void setWeb(String web){
		this.web = web;
	}
	
	/**
	 * get 状态类型
	 * @return 
	 */
	public int getState(){
		return state;
	}
	
	/**
	 * set 状态类型
	 */
	public void setState(int state){
		this.state = state;
	}
	
	
	@Override
	public int getId() {
		return 203314;
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
		//角色id
		buf.append("playerId:" + playerId +",");
		//账号
		if(this.userId!=null) buf.append("userId:" + userId.toString() +",");
		//服务器平台
		if(this.web!=null) buf.append("web:" + web.toString() +",");
		//状态类型
		buf.append("state:" + state +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}