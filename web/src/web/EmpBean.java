package web;

import java.io.Serializable;

public class EmpBean implements Serializable {

	private String name = null;
	private int age = 0;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    //カプセル化されてるnameを返す
	public String getName() {
		return name;
	}
    //引数をカプセル化されてるnameに代入
	public void setName(String name) {
		this.name = name;
	}
}
