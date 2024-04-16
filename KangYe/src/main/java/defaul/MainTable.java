package defaul;
import jugs.*;
import jugs.Table.Position;


public class MainTable {
	public static void main (String[] args) {
		Table t=new Table(7,5);
		
		t.fill(Position.Right);
		t.fill(Position.Left);
		
		
		System.out.println(t.toString());
		
		
		t.empty(Position.Left);
		t.pourFrom(Position.Left);
		System.out.println(t.toString());
		
		
		
		
	}
	
}
