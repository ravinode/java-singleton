package com.ravi.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleObject instance = SingleObject.getInstance();
		
		instance.showMessage();

	}

}
