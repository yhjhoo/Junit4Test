package me.prince.junit.test;
/**
 * @author yhjhoo
 * @since 1.0
 * date : 19 Dec, 2015
 *
 */
public class User {
	private String name;
	private String desc;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", desc=" + desc + ", age=" + age + "]";
	}

}
