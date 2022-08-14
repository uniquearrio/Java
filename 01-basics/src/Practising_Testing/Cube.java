package Practising_Testing;

public class Cube {
	
	int length;
	int bredth;
	int height;
	public int GetCubeVolume() {
		return (length * bredth * height);
	}
	Cube(){
		length=10;
		bredth=20;
		height=30;
	}
	Cube(int h,int b,int l) {
		height=h;
		bredth=b;
		length=l;
//		h=height;
//		b=bredth;
//		l=length;
	}
	
}
