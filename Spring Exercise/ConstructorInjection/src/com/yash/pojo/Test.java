package com.yash.pojo;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector traineeName;
	private TreeSet technologies;
	private Hashtable traineeMentor;
	@Override
	public String toString() {
		return "Test [traineeName=" + traineeName + ", technologies=" + technologies + ", traineeMentor="
				+ traineeMentor + "]";
	}
	public Vector getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(Vector traineeName) {
		this.traineeName = traineeName;
	}
	public TreeSet getTechnologies() {
		return technologies;
	}
	public void setTechnologies(TreeSet technologies) {
		this.technologies = technologies;
	}
	public Hashtable getTraineeMentor() {
		return traineeMentor;
	}
	public void setTraineeMentor(Hashtable traineeMentor) {
		this.traineeMentor = traineeMentor;
	}
}
	