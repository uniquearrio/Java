package Practising_Testing;

public class Class_Methods {
	public static void main(String[] args) {
		Cube cube1 = new Cube();
		System.out.println(cube1.GetCubeVolume());
		
		Cube cube2 = new Cube(10,30,40);
		System.out.println(cube2.GetCubeVolume());
	}
}
