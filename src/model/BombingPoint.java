package model;

public class BombingPoint implements Comparable<BombingPoint>{

	private String name;
	
	public BombingPoint(String name) {
		this.name=name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(BombingPoint o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
