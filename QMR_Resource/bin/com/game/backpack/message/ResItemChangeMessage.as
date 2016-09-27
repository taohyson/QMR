package com.game.backpack.message{
	import com.game.backpack.bean.ItemInfo;
	import net.Message;
	
	/** 
	 * @author Commuication Auto Maker
	 * 
	 * @version 1.0.0
	 * 
	 * @since 2011-5-8
	 * 
	 * 物品信息修正
	 */
	public class ResItemChangeMessage extends Message {
	
		//物品信息
		private var _item: ItemInfo;
		
		
		/**
		 * 写入字节缓存
		 */
		override protected function writing(): Boolean{
			//物品信息
			writeBean(_item);
			return true;
		}
		
		/**
		 * 读取字节缓存
		 */
		override protected function reading(): Boolean{
			//物品信息
			_item = readBean(ItemInfo) as ItemInfo;
			return true;
		}
		
		/**
		 * get id
		 * @return 
		 */
		override public function getId(): int {
			return 104103;
		}
		
		/**
		 * get 物品信息
		 * @return 
		 */
		public function get item(): ItemInfo{
			return _item;
		}
		
		/**
		 * set 物品信息
		 */
		public function set item(value: ItemInfo): void{
			this._item = value;
		}
		
	}
}