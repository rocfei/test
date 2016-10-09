/*
 *	Copyright © 2016 Bayi Studio. All rights reserved.
 *	八裔工作室 版权所有
 *	http://www.bayis.cn
 */
package cn.bayis.test;

/**
 * @author Penguin
 *
 */
public abstract class Clock {
	private final int UTC_OFFSET = 0;
	private int localTime = 0;
	
	public abstract void setLocalTime(int localTime);
}
