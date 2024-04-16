package jugs;

public class Jug {
	private int capacity;
	private int content;
	
	
	public Jug(int newCapacity) {
		this.capacity=newCapacity;
		this.content=0;
		
		if(newCapacity<=0) {
			throw new RuntimeException("The capacity can´t be less than 0");
		}
	}
	
	
	public int capacity() {
		return this.capacity;
	}
	
	public int content() {
		return this.content;
	}
	
	public void fill() {
		this.content=this.capacity();
	}
	
	public void empty() {
		this.content=0;
	}
	
	public void pourFrom(Jug b) {
		if(this.equals(b)) {
			throw new RuntimeException("Error");
		}
	
	if((this.capacity-this.content)<b.content) {
		b.content=b.content-(this.capacity-this.content);
		this.content=this.capacity;
	}else {
		this.content=this.content+b.content;
		b.content=0;
		
	}
	
	

}
	public String toString() {
		String message;
		message="J("+this.capacity()+","+this.content()+")";
		return message;
	}

	
}