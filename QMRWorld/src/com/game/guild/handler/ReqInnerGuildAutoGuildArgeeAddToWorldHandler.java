package com.game.guild.handler;

import org.apache.log4j.Logger;

import com.game.command.Handler;
import com.game.guild.manager.GuildWorldManager;
import com.game.guild.message.ReqInnerGuildAutoGuildArgeeAddToWorldMessage;

public class ReqInnerGuildAutoGuildArgeeAddToWorldHandler extends Handler{

	Logger log = Logger.getLogger(ReqInnerGuildAutoGuildArgeeAddToWorldHandler.class);

	public void action(){
		try{
			ReqInnerGuildAutoGuildArgeeAddToWorldMessage msg = (ReqInnerGuildAutoGuildArgeeAddToWorldMessage)this.getMessage();
			GuildWorldManager.getInstance().reqInnerGuildAutoGuildArgeeAddToWorld(msg);
			
		}catch(ClassCastException e){
			log.error(e);
		}
	}
}