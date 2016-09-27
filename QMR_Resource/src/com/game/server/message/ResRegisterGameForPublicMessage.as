package com.game.server.message{
	import net.Message;
	
	/** 
	 * @author Commuication Auto Maker
	 * 
	 * @version 1.0.0
	 * 
	 * @since 2011-5-8
	 * 
	 * 游戏服务器请求注册公共服务器返回
	 */
	public class ResRegisterGameForPublicMessage extends Message {
	
		//服务器编号
		private var _serverId: int;
		
		//服务器名字
		private var _serverName: String;
		
		//平台名字
		private var _webName: String;
		
		
		/**
		 * 写入字节缓存
		 */
		override protected function writing(): Boolean{
			//服务器编号
			writeInt(_serverId);
			//服务器名字
			writeString(_serverName);
			//平台名字
			writeString(_webName);
			return true;
		}
		
		/**
		 * 读取字节缓存
		 */
		override protected function reading(): Boolean{
			//服务器编号
			_serverId = readInt();
			//服务器名字
			_serverName = readString();
			//平台名字
			_webName = readString();
			return true;
		}
		
		/**
		 * get id
		 * @return 
		 */
		override public function getId(): int {
			return 300312;
		}
		
		/**
		 * get 服务器编号
		 * @return 
		 */
		public function get serverId(): int{
			return _serverId;
		}
		
		/**
		 * set 服务器编号
		 */
		public function set serverId(value: int): void{
			this._serverId = value;
		}
		
		/**
		 * get 服务器名字
		 * @return 
		 */
		public function get serverName(): String{
			return _serverName;
		}
		
		/**
		 * set 服务器名字
		 */
		public function set serverName(value: String): void{
			this._serverName = value;
		}
		
		/**
		 * get 平台名字
		 * @return 
		 */
		public function get webName(): String{
			return _webName;
		}
		
		/**
		 * set 平台名字
		 */
		public function set webName(value: String): void{
			this._webName = value;
		}
		
	}
}