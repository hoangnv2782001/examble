package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// anotation đánh dấu bean
@Component
public class Dog {

	// field inject không nên dùng
	@Autowired
	@Qualifier("cho")
	private AnimalI animal;

	// contructor inject tion nên dung
	public Dog(Animal animal) {
		this.animal = animal;
	}

	// setter injection
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void sua(){
		animal.sua();
	}
}
