/*
 *	Copyright © 2016 Bayi Studio. All rights reserved.
 *	八裔工作室 版权所有
 *	http://www.bayis.cn
 */
package cn.bayis.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Penguin
 *
 */
public abstract class TimeSubject {
	protected Map<String, Clock> clocks = new HashMap<>();
	
	public void attach(String cityName, Clock clock) {
		clocks.put(cityName, clock);
	}
	
	public void detach(String cityName) {
		clocks.remove(cityName);
	}
	public abstract void notifyAllClocks();
}
