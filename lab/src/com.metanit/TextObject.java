package com.metanit;
public abstract class TextObject {
	private final String name;
	public String getName(){
        return this.name;
    }
    public TextObject(String name){
        this.name = name;
    }
}