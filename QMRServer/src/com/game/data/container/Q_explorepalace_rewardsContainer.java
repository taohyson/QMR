package com.game.data.container;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.game.data.bean.Q_explorepalace_rewardsBean;
import com.game.data.dao.Q_explorepalace_rewardsDao;

/** 
 * @author ExcelUtil Auto Maker
 * 
 * @version 1.0.0
 * 
 * Q_explorepalace_rewards数据容器
 */
public class Q_explorepalace_rewardsContainer {

	private List<Q_explorepalace_rewardsBean> list;
	
	private HashMap<Integer, Q_explorepalace_rewardsBean> map = new HashMap<Integer, Q_explorepalace_rewardsBean>();

	private Q_explorepalace_rewardsDao dao = new Q_explorepalace_rewardsDao();
	
	public void load(){
		list = dao.select();
		Iterator<Q_explorepalace_rewardsBean> iter = list.iterator();
		while (iter.hasNext()) {
			Q_explorepalace_rewardsBean bean = (Q_explorepalace_rewardsBean) iter
					.next();
			map.put(bean.getQ_id(), bean);
		}
	}

	public List<Q_explorepalace_rewardsBean> getList(){
		return list;
	}
	
	public HashMap<Integer, Q_explorepalace_rewardsBean> getMap(){
		return map;
	}
}