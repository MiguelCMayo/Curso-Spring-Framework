package com.example.springpatterns.patterns.structural.decorator.decoradores;


import com.example.springpatterns.patterns.structural.decorator.Photo;

public abstract class PhotoDecorator extends Photo {
	
	protected Photo photo; //podria ser una digitalphoto o un decorador porque ambos extienden de photo

	protected PhotoDecorator(Photo photo) {
		super();
		this.photo = photo;
	}
	
	
	

}
