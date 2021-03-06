package com.game.player.message;

import com.game.message.Message;

import org.apache.mina.core.buffer.IoBuffer;

/** 
 * @author Commuication Auto Maker
 * 
 * @version 1.0.0
 * 
 * 请求其他玩家详细信息消息
 */
public class ReqOtherPlayerInfoMessage extends Message{

	//角色Id
	private long personId;
	
	//类型： 0角色，1坐骑
	private byte type;
	
	
	/**
	 * 写入字节缓存
	 */
	public boolean write(IoBuffer buf){
		//角色Id
		writeLong(buf, this.personId);
		//类型： 0角色，1坐骑
		writeByte(buf, this.type);
		return true;
	}
	
	/**
	 * 读取字节缓存
	 */
	public boolean read(IoBuffer buf){
		//角色Id
		this.personId = readLong(buf);
		//类型： 0角色，1坐骑
		this.type = readByte(buf);
		return true;
	}
	
	/**
	 * get 角色Id
	 * @return 
	 */
	public long getPersonId(){
		return personId;
	}
	
	/**
	 * set 角色Id
	 */
	public void setPersonId(long personId){
		this.personId = personId;
	}
	
	/**
	 * get 类型： 0角色，1坐骑
	 * @return 
	 */
	public byte getType(){
		return type;
	}
	
	/**
	 * set 类型： 0角色，1坐骑
	 */
	public void setType(byte type){
		this.type = type;
	}
	
	
	@Override
	public int getId() {
		return 103203;
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
		buf.append("personId:" + personId +",");
		//类型： 0角色，1坐骑
		buf.append("type:" + type +",");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}