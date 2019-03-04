package com.yash.pojo;

public class DAOTest {
private String name;
private int duration;
@Override
public String toString() {
	return "DAOTest [name=" + name + ", duration=" + duration + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

}
