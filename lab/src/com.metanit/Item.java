package com.metanit;
public class Item extends TextObject {
	private String size;
	private Color color;
	private String type;
	public void setSize(String size){
		this.size = size;
	}
	public void getSize(){
		System.out.println("size " + size);
	}

	public void setColor(Color color){
		this.color = color;
	}
	public void getColor(){
		System.out.println("color " + color);
	}

	public void setType(String type){
		this.type = type;
	}
	public void getType(){
		System.out.println("type " + type);
	}

	protected String name;
	public Item(String name) {
        super(name);
        this.name = name;
    }	

}