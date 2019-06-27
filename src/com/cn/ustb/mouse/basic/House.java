package com.cn.ustb.mouse.basic;

public class House implements Cloneable, Comparable<House> {
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	public int getId() {
		return id;
	}
	
	public double getArea() {
		return area;
	}
	
	public java.util.Date getWhenBuilt() {
		return whenBuilt;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		/** 
		 * super.clone()属于浅复制。如果改为深复制，则将34行改为：
		 * House houseClone = (House)super.clone();
		 * houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
		 * return houseClone;
		 */
		return super.clone();
	}
	
	@Override
	public int compareTo(House o) {
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else
			return 0;
	}

}
