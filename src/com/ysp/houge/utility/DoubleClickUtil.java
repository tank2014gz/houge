package com.ysp.houge.utility;

public class DoubleClickUtil {
	private static long lastClickTime;

	public synchronized static boolean isFastClick() {
		long time = System.currentTimeMillis();
		if (time - lastClickTime < 2000) {
			return true;
		}
		lastClickTime = time;
		return false;
	}
}
