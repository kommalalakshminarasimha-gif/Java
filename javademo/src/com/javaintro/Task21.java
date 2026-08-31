package com.javaintro;

public class Task21 {
	static int count = 0;
	
	void ObjectCount(){
		count++;
	}
	
	public static void main(String[] args) {
		Task21 a = new Task21();
		Task21 b = new Task21();
		Task21 c = new Task21();
		Task21 d = new Task21();
		a.ObjectCount();
		b.ObjectCount();
		c.ObjectCount();
		d.ObjectCount();
		System.out.println("Welcome to Jadal zamana :" + count);
	}

}
