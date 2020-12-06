package com.metanit;
public class Bed extends Item {
	private Person sleeper;
	private boolean free;

	public void setSleeper(Person sleeper){
		free = false;
		this.sleeper = sleeper;
	}

	public String getSleeper(){
		if (free == true) {
			return "Nobody";}
			else return sleeper.getName();
	}

	public void isFree(){
		free = true;
	}

	protected String name;
	public Bed(String name) {
        super(name);
        this.name = name;
    }
	
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bed bed = (Bed) o;
        return sleeper.equals(bed.sleeper) &&
                (free == bed.free) &&  (name == bed.name) &&
                size.equals(bed.size) && color.equals(bed.color) &&
		type.equals(bed.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, color, sleeper);
    }

    @Override
    public String toString() {
        return "Sleeper on this bed " + this.sleeper.getName();
    }
}
