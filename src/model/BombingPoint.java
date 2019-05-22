package model;

public class BombingPoint implements Comparable<BombingPoint>{

	private String name;
	private int x;
	private int y;
	 

	public BombingPoint(String name, int x, int y) {
		this.name=name;
		this.x=x;
		this.y=y;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
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