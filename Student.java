package com.neuedu.practice;

/**
 * @author neudu_gyz
 * @since 20190813
 * @version 1.0
 * */
public class Student {
	public static void main(String[] args) {
		int a = 18;
		double d = 18;
		Student student = new Student();
		boolean writeLog = student.writeLog(null);
		System.out.println(writeLog == true?"写日志了":"没写日志");
	}
	String stuNo;
	char sex;
	short age;
	String name;
	float height;
	float weight;
	public boolean writeLog(String log) {
		if(log == null) {
			return false;
		}else {
			return true;
		}
	}
}
