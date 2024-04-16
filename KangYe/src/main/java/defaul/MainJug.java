package defaul;


import jugs.Jug;

public class MainJug {

	public static void main(String[] args) {
		Jug a= new Jug(7);
		Jug b= new Jug(4);
		System.out.println(a.toString()+","+b.toString());

		a.fill();
		System.out.println(a.toString()+","+b.toString());
		
		b.pourFrom(a);//the content of a to b
		System.out.println(a.toString()+","+b.toString());
		
		
		b.empty();
		System.out.println(a.toString()+","+b.toString());
		
		b.pourFrom(a);
		System.out.println(a.toString()+","+b.toString());

		


	}

}
