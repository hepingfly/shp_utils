package com.iflytek.dcm.test;

public class CharacterUtil {

	/**
	 * 去除首尾指定字符
	 * 
	 * @author hpshen
	 * @time 2019年8月5日 下午3:16:52
	 * @param str
	 * @param element
	 * @return
	 */
	public static String trimFirstAndLastChar(String str, String element) {
		boolean beginIndexFlag = true;
		boolean endIndexFlag = true;
		do {
			int beginIndex = str.indexOf(element) == 0 ? 1 : 0;
			int endIndex = str.lastIndexOf(element) + 1 == str.length() ? str.lastIndexOf(element) : str.length();
			str = str.substring(beginIndex, endIndex);
			beginIndexFlag = (str.indexOf(element) == 0);
			endIndexFlag = (str.lastIndexOf(element) + 1 == str.length());
		} while (beginIndexFlag || endIndexFlag);
		return str;
	}

}
