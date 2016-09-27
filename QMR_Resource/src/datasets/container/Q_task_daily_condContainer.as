package datasets.container {
	import flash.utils.Dictionary;
	import datasets.bean.Q_task_daily_cond;

	import flash.utils.ByteArray;
	/** 
	 * @author ExcelUtil Auto Maker
	 * 
	 * @version 1.0.0
	 * 
	 * @since 2011-5-8
	 * 
	 * Q_task_daily_cond
	 */
	public class Q_task_daily_condContainer {
		
		private var _list:Vector.<Q_task_daily_cond> = new Vector.<Q_task_daily_cond>();
		
		private var _dict:Dictionary = new Dictionary();
		
		private var _version:int;
		
		public function Q_task_daily_condContainer(bytes: ByteArray){
			_version = bytes.readInt();
			var num:int = bytes.readInt();
			for (var i : int = 0; i < num; i++) {
				var bean:Q_task_daily_cond = new Q_task_daily_cond();
				bean.read(bytes);
				_list.push(bean);
				_dict[String(bean.q_id)] = bean;
			}
		}
		
		public function get list(): Vector.<Q_task_daily_cond>{
			return _list;
		}
		
		public function get dict(): Dictionary{
			return _dict;
		}
		
		public function get version(): int{
			return _version;
		}
	}
}
