package com.metanit;
public class Clothes extends Item {
	private String name;
	private String typeCloth;
	private Color color;
	public Clothes(String name, Color color) {
        super(name);
        this.name = name;
        this.color = color;
    }
    public Clothes(String name) {
        super(name);

    }


	public void setTypeClothes(String typeClothes){
		this.typeCloth = typeCloth;
	}
	public String getTypeClothes(){
		return this.typeCloth;
	}
	
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return typeCloth.equals(clothes.typeCloth) &&
                (free == clothes.free) &&  (name == clothes.name) &&
                size.equals(bed.size) && color.equals(clothes.color) &&
		type.equals(clothes.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, color, typeCloth);
    }

    @Override
    public String toString() {
        return "Name of ths clothes: " + this.clothes.getName();
    }
}
