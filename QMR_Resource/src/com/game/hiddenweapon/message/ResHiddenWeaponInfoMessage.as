package com.game.hiddenweapon.message{
	import com.game.utils.long;
	import com.game.hiddenweapon.bean.HiddenWeaponInfo;
	import net.Message;
	
	/** 
	 * @author Commuication Auto Maker
	 * 
	 * @version 1.0.0
	 * 
	 * @since 2011-5-8
	 * 
	 * 返回客户端暗器信息
	 */
	public class ResHiddenWeaponInfoMessage extends Message {
	
		//暗器使用者ID
		private var _playerid: long;
		
		//暗器信息
		private var _info: HiddenWeaponInfo;
		
		
		/**
		 * 写入字节缓存
		 */
		override protected function writing(): Boolean{
			//暗器使用者ID
			writeLong(_playerid);
			//暗器信息
			writeBean(_info);
			return true;
		}
		
		/**
		 * 读取字节缓存
		 */
		override protected function reading(): Boolean{
			//暗器使用者ID
			_playerid = readLong();
			//暗器信息
			_info = readBean(HiddenWeaponInfo) as HiddenWeaponInfo;
			return true;
		}
		
		/**
		 * get id
		 * @return 
		 */
		override public function getId(): int {
			return 162101;
		}
		
		/**
		 * get 暗器使用者ID
		 * @return 
		 */
		public function get playerid(): long{
			return _playerid;
		}
		
		/**
		 * set 暗器使用者ID
		 */
		public function set playerid(value: long): void{
			this._playerid = value;
		}
		
		/**
		 * get 暗器信息
		 * @return 
		 */
		public function get info(): HiddenWeaponInfo{
			return _info;
		}
		
		/**
		 * set 暗器信息
		 */
		public function set info(value: HiddenWeaponInfo): void{
			this._info = value;
		}
		
	}
}